package cn.ffb.http.core.interceptor;

import java.io.IOException;

import cn.ffb.http.core.AuthTokenHandler;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/**
 * 当验证失败的时候处理的一个拦截器
 * <p>
 * Created by lingfei on 2017/4/14.
 */

public class AuthenticatorInterceptor implements Authenticator {
    private static AuthTokenHandler mAuthTokenHandler;

    public static void setAuthTokenHandler(AuthTokenHandler authTokenHandler) {
        AuthenticatorInterceptor.mAuthTokenHandler = authTokenHandler;
    }

    @Override
    public Request authenticate(Route route, final Response response) throws IOException {
        if (mAuthTokenHandler == null) {
            return null;
        }
        String authValue = mAuthTokenHandler.getAuthValue(true);
        if (authValue == null) {
            return null;
        }
        return response.request().newBuilder().addHeader(mAuthTokenHandler.getAuthName(), authValue)
                .build();
    }

}
