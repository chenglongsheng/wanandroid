package com.buyehou.wanandroid.network.model

/**
 * @author Rosen
 */
data class Response<T>(
    val data: T? = null,
    val errorCode: Int = 0,
    val errorMsg: String = ""
)