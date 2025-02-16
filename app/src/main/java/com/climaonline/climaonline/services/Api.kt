package com.climaonline.climaonline.services

import com.climaonline.climaonline.model.Main
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
// 3a5b9af1700a2e8c2bafc7197c3ac749

interface Api {
 @GET("weather")

 fun weatherMap(
   @Query("q") cityName: String,
   @Query("appid") api_key: String
 ):Call<Main>

}