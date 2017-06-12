package cn.ffb.http.upload;

import android.content.Context;

import cn.ffb.utils.ToastUtils;

/**
 * Created by lingfei on 2017/5/23.
 */

public abstract class DefaultOnUploadResponseListener<T> implements OnUploadResponseListener<T> {

    @Override
    public void onFailure(Context context, Throwable t) {
        ToastUtils.showToast(context, "文件上传失败");
    }
}
