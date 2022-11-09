package com.example.jsonretrofit

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.jsonretrofit.data.TodosItem

class TodoViewHolder(view : View) : RecyclerView.ViewHolder(view){

    val checkBox = view.findViewById<CheckBox>(R.id.cb_todo)


}