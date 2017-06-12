package cn.ffb.http.download;

import java.io.File;
/**
 * Created by lingfei on 2017/5/26.
 */
public class DownloadResponseListener implements IDownloadResponseListener {

    @Override
    public void onException(String taskId, Throwable e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onSuccess(String taskId, File file) {
        // TODO Auto-generated method stub

    }

}
