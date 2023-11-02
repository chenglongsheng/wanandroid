package com.buyehou.wanandroid.common

/**
 * @author Rosen
 */
sealed interface StateResult<out T> {
    /**
     * 加载中
     */
    object Loading : StateResult<Nothing>

    /**
     * 加载成功
     */
    data class Success<T>(val data: T) : StateResult<T>

    /**
     * 加载失败
     */
    data class Error(val exception: Throwable? = null) : StateResult<Nothing>
}