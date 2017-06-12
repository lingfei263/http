package cn.ffb.http.core;

import android.content.Context;
/**
 * Created by lingfei on 2017/5/26.
 */
public interface IHttpRequestListener {

    void onStart(Context context, ICancelable cancelable, int requestCode);

    void onException(Context context, int requestCode, Throwable t);

    void onComplete(int requestCode);

}
