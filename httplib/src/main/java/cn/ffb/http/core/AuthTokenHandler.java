package cn.ffb.http.core;


/**
 * Created by lingfei on 2017/5/10.
 */
public interface AuthTokenHandler {

    String getAuthName();

    String getAuthValue(boolean isRefresh);

    boolean isIgnoreUrl(String url);

}
