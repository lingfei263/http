package cn.ffb.http.upload;

import java.io.File;
import java.util.List;
import java.util.Map;

import cn.ffb.http.core.ICall;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface Md5CheckCallCreator<Response> {

    ICall<Response> createMd5CheckCall(List<File> files, Map<File, String> md5s);

}
