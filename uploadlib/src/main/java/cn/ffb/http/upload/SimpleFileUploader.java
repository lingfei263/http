package cn.ffb.http.upload;

import android.content.Context;

/**
 * Created by lingfei on 2017/5/26.
 */

public abstract class SimpleFileUploader<UploadResponse, FileUploadInfo>
        extends FastFileUploader<UploadResponse, FileUploadInfo>
        implements FileUploaderProvider<UploadResponse, FileUploadInfo> {

    public SimpleFileUploader(Context context) {
        super(context);
        this.setUploadParser(this);
        this.setMd5CheckRequest(this);
        this.setUploadRequest(this);
        this.setMd5Strategy(this);
    }

}
