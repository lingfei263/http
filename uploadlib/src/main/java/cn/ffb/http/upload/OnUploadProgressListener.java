package cn.ffb.http.upload;

/**
 * Created by lingfei on 2017/5/23.
 */

public interface OnUploadProgressListener {
    void onProgress(int progress);

    void onStart();

    void onComplete();
}
