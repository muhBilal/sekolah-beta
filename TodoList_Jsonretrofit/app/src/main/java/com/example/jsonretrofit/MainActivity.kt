package com.example.jsonretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.jsonretrofit.R.id.rv_todo
import com.example.jsonretrofit.data.APIService
import com.example.jsonretrofit.data.TodosItem
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
            throwable.printStackTrace()
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todos = listOf<TodosItem>(
            TodosItem(todo = "Beli buku"),
            TodosItem(todo = "Beli makan", completed = true),
            TodosItem(todo = "Belajar OOP"),
        )

        val rvTodos = findViewById<RecyclerView>(R.id.rv_todo)
        rvTodos.adapter = TodoListAdapter().apply {
            setNewData(todos)
        }


        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler) {
            val resp = retrofitService().getTodoList()

            if (resp.isSuccessful) {
                val newTodoData = resp.body()?.todos
                rvTodos.adapter = TodoListAdapter().apply {
                    setNewData(newTodoData.orEmpty())
                }
            }
        }
    }

    fun retrofitService(): APIService {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://dummyjson.com/")
            .build()
            .create(APIService::class.java)
    }
}