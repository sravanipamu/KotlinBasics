package com.sravani.kotlinbasics.objects

import com.sravani.kotlinbasics.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    val instance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}


/*class RetrofitBuilder {
    val instance = null

    static void getRetrofitInstance(){
        if(instance == null)
            instance =   Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return instance
    }

} */