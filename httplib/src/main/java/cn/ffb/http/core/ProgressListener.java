package cn.ffb.http.core;
/**
 * Created by lingfei on 2017/5/26.
 */
public interface ProgressListener {
    void onProgress(long bytesRead, long contentLength);
}
