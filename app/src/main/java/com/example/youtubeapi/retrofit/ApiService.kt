package com.example.youtubeapi.retrofit

import com.example.youtubeapi.models.YoutubeData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search")
    suspend fun getChannelsVideos(
        @Query("key") key: String = "AIzaSyDZ4L327My4DUQybzWbNrA06LV5QjJK-nc",
        @Query("channelId") channelId: String = "UCLRXXDGv3L_gGxUHFY8D45g",
        @Query("part") part: String = "snippet, id",
        @Query("order") order: String = "date",
        @Query("maxResults") maxResults: Int = 20
    ): Response<YoutubeData>
}