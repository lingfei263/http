package cn.ffb.http.app;

import cn.ffb.http.core.ICall;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lingfei on 2017/6/19
 */

public interface XAPI {

    @GET("weather_mini")
    ICall<WeatherInfo> getWeatherInfo(@Query("city") String city);
}
