package com.example.jsonretrofit.data

import retrofit2.http.GET

interface APIService {

    @GET("/todos")
    suspend fun getTodoList(): retrofit2.Response<DataTodo>

}