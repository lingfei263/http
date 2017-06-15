package cn.ffb.http.upload;

import cn.ffb.http.core.ICall;
import okhttp3.RequestBody;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface UploadCallCreator<Response> {

    ICall<Response> createUploadCall(RequestBody requestBody);

}
