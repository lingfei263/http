package cn.ffb.http.upload;

import android.content.Context;

import cn.ffb.dialog.builder.ProgressDialogBuilder;
import cn.ffb.dialog.core.DialogBuilder;
import cn.ffb.dialog.core.IDialog;

/**
 * Created by lingfei on 2017/5/23.
 */

public class DefaultOnUploadProgressListener implements OnUploadProgressListener {
    private IDialog dialog;
    private ProgressDialogBuilder.ProgressHandler progressHandler = new ProgressDialogBuilder.ProgressHandler();

    public DefaultOnUploadProgressListener(Context context) {
        dialog = DialogBuilder.progressDialog(context)
                .setMessage("文件正在上传，请稍后...")
                .progressHandler(progressHandler).create();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onProgress(int progress) {
        progressHandler.setProgress(progress);
        if (progress == 0) {
            dialog.show();
        }
        if (progress == 100) {
            dialog.dismiss();
        }
    }

}
