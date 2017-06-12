package cn.ffb.http.core;

import retrofit2.Call;

/**
 * Created by lingfei on 2017/5/14.
 */

public interface ICall<T> extends ICallExecutor<T> {

    Call<T> getRaw();

}
