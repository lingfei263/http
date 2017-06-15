package cn.ffb.http.upload;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface UploadParser<Response, Result> {
    Result getUploadResult(Response response);
}
