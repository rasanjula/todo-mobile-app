package com.example.todomobileapp.model

data class Todo(
    var userID: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)