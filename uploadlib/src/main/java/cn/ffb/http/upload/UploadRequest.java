package cn.ffb.http.upload;

import java.io.File;
import java.util.List;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface UploadRequest<T> {

    void upload(List<File> files, OnUploadProgressListener listener1, OnUploadResponseListener<T> listener2);

}
