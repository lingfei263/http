package cn.ffb.http.app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lingfei on 2017/6/19
 */

public interface API {

    @GET("weather_mini")
    Call<WeatherInfo> getWeatherInfo(@Query("city") String city);
}
