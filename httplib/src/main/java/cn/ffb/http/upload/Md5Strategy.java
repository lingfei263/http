package cn.ffb.http.upload;

import java.io.File;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface Md5Strategy<FileUploadInfo> {
    boolean isUploaded(File file, String md5, FileUploadInfo uploadInfo);
}
