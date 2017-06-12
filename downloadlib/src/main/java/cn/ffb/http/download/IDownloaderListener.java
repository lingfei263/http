package cn.ffb.http.download;

/**
 * Created by lingfei on 2017/5/26.
 */
public interface IDownloaderListener extends IDownloadResponseListener {

    void onStart(String taskId);

    void onCancel(String taskId);

    void onPause(String taskId);

    void onResume(String taskId);
}
