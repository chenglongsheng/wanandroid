package com.buyehou.wanandroid.common

/**
 * @author buyehou
 */
data class Result<T>(
    val data: T? = null,
    val errorCode: Int = 0,
    val errorMsg: String = ""
)