package cn.ffb.http.core;

import retrofit2.Response;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface ICallResponse<T> {
    T getResponseBody();

    Response getResponse();

}
