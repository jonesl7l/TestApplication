package com.jonesl7l.testapplication.retrofit

import com.jonesl7l.testapplication.viewmodels.Nics
import retrofit2.Response
import retrofit2.http.GET

interface NicService {

    @GET("/getNics")
    suspend fun loadNics(): Response<Nics>
}