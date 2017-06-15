package cn.ffb.http.upload;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/23.
 */

public interface OnUploadResponseListener<T> {
    void onSuccess(T response);

    void onFailure(Context context, Throwable t);
}
