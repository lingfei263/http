package cn.ffb.http.upload;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface FileUploaderProvider<UploadResponse, FileUploadInfo> extends
        UploadCallCreator<UploadResponse>,
        Md5CheckCallCreator<UploadResponse>,
        Md5Strategy<FileUploadInfo>,
        UploadParser<UploadResponse, FileUploadInfo> {
}
