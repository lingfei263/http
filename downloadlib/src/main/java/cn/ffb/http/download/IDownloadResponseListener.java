package cn.ffb.http.download;

import java.io.File;
/**
 * Created by lingfei on 2017/5/26.
 */

public interface IDownloadResponseListener {
    void onException(String taskId, Throwable e);

    void onSuccess(String taskId, File file);
}
