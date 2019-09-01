package com.example.kotlin.ParsingData.domain

interface Command<T>{
    fun excute(): T
}


