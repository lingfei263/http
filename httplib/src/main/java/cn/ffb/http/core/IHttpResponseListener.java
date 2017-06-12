package cn.ffb.http.core;

import android.content.Context;
/**
 * Created by lingfei on 2017/5/26.
 */

public interface IHttpResponseListener<T> {

    void onResponse(Context context, int requestCode, T response, boolean isFromCache);

    void onException(Context context, Throwable t);
}
