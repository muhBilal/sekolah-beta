package com.example.jsonretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jsonretrofit.data.TodosItem

class TodoListAdapter : RecyclerView.Adapter<TodoViewHolder>() {

    val todoList: MutableList<TodosItem> = mutableListOf()

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val data = todoList[position]
//        holder.checkBox.isChecked = data.completed == true
//        atau juga bisa begini
        holder.checkBox.isChecked = data.completed ?: false
        holder.checkBox.text = data.todo
    }

    fun setNewData(data : List<TodosItem>){
        todoList.clear()
        todoList.addAll(data)
        notifyDataSetChanged()
    }
}