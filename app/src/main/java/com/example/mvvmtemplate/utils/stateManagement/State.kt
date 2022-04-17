package com.example.mvvmtemplate.utils.stateManagement

sealed class State<T>(private val data:T?=null, private val msg:String?=null)
{

    class Success<T>(val data:T?) : State<T>(data)
    class Error<T>(val msg: String?): State<T>(null,msg)
    class Loading<T>: State<T>()
    class None<T>: State<T>()

}