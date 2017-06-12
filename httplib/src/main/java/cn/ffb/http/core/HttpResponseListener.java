package cn.ffb.http.core;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/26.
 */
public class HttpResponseListener<T> implements IHttpResponseListener<T> {

    @Override
    public void onResponse(Context context, int requestCode, T response, boolean isFromCache) {

    }

    @Override
    public void onException(Context context, Throwable t) {

    }
}
