package cn.ffb.http.core;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/13.
 */

public interface IHttpExceptionHandler {

    void onException(Context context, Throwable t);
}
