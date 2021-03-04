package com.jonesl7l.testapplication.helpers

import android.widget.ImageView
import com.squareup.picasso.Picasso
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkCallHelper {

    fun <T> getDataRetrofitService(url: String, classType: Class<T>): T {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(classType)
    }

    fun fetchImageWithPicasso(imageView: ImageView, url: String) {
        Picasso.get()
            .load(url)
            .into(imageView)
    }
}