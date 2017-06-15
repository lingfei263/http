package cn.ffb.http.download;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface IHttpDownloader {
    void download(Context context, DownloadTask downloadTask);

    void cancel(Context context, DownloadTask downloadTask);
}
