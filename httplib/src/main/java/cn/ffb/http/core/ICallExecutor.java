package cn.ffb.http.core;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface ICallExecutor<T> extends
        ICallBuilder<ICallExecutor<T>>, ICancelable {

    ICallResponse<T> execute(Context context, IHttpResponseListener<T> listener);

    ICallResponse<T> execute(Context context, IHttpRequestListener requestListener, IHttpResponseListener<T> responseListener);

}
