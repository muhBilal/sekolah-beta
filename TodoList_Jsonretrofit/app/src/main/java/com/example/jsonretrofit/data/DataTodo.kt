package com.example.jsonretrofit.data

import com.google.gson.annotations.SerializedName

data class DataTodo(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("skip")
	val skip: Int? = null,

	@field:SerializedName("todos")
	val todos: List<TodosItem>? = null
)

data class TodosItem(

	@field:SerializedName("todo")
	val todo: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("completed")
	val completed: Boolean? = null,

	@field:SerializedName("userId")
	val userId: Int? = null
)
