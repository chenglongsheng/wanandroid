package com.buyehou.wanandroid.network

import com.buyehou.wanandroid.common.Result
import retrofit2.http.GET

/**
 * @author buyehou
 */
interface NetWorkApi {

    companion object {
        const val HOST = "https://www.wanandroid.com"
    }

    @GET("/article/list/0/json")
    fun getArticleList(): Result<>

}