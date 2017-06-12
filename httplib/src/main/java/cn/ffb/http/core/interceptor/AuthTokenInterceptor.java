package cn.ffb.http.core.interceptor;

import java.io.IOException;

import cn.ffb.http.core.AuthTokenHandler;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lingfei on 2017/5/14.
 */

public class AuthTokenInterceptor implements Interceptor {
    private static AuthTokenHandler mAuthTokenHandler;

    public static void setAuthTokenHandler(AuthTokenHandler authTokenHandler) {
        AuthTokenInterceptor.mAuthTokenHandler = authTokenHandler;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        if (mAuthTokenHandler == null) {
            return chain.proceed(originalRequest);
        }
        if (mAuthTokenHandler.isIgnoreUrl(originalRequest.url().toString())) {
            return chain.proceed(originalRequest);
        }
        String authValue = mAuthTokenHandler.getAuthValue(false);
        if (authValue == null || alreadyHasAuthorizationHeader(mAuthTokenHandler.getAuthName(), originalRequest)) {
            return chain.proceed(originalRequest);
        }
        Request authorised =
                originalRequest.newBuilder().header(mAuthTokenHandler.getAuthName(), authValue).build();
        return chain.proceed(authorised);
    }

    private static boolean alreadyHasAuthorizationHeader(String name, Request originalRequest) {
        return originalRequest.header(name) != null;
    }
}
