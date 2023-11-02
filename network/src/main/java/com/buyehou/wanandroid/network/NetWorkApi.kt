package com.buyehou.wanandroid.network

import com.buyehou.wanandroid.network.model.HotKey
import com.buyehou.wanandroid.network.model.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author buyehou
 */
interface NetWorkApi {

    companion object {
        const val HOST = "https://www.wanandroid.com"
    }

    @GET("/article/list/{page}/json")
    suspend fun getArticleList(@Path("page") page: Int): Result<List<HotKey>>

    @GET("/hotkey/json")
    suspend fun getHotkey(): Result<Response<HotKey>>

}