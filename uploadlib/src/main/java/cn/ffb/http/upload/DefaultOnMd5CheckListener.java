package cn.ffb.http.upload;

import android.content.Context;

import cn.ffb.dialog.core.DialogBuilder;
import cn.ffb.dialog.core.IDialog;

/**
 * Created by lingfei on 2017/5/23.
 */

public class DefaultOnMd5CheckListener implements OnMd5CheckListener {
    private IDialog dialog;

    public DefaultOnMd5CheckListener(Context context) {
        dialog = DialogBuilder.loadingDialog0(context).setMessage("正在进行秒传检测...").create();
    }

    @Override
    public void start() {
        dialog.show();
    }

    @Override
    public void complete() {
        dialog.dismiss();
    }

}
