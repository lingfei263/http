package cn.ffb.http.core;

/**
 * Created by lingfei on 2017/5/26.
 */

public interface ICallBuilder<T> {

    T requestCode(int requestCode);

    T async(boolean isAsync);

    T exceptionHandler(IHttpExceptionHandler handler);

    T cacheStrategy(CacheStrategy cacheStrategy);

    T cacheStale(int cacheStale);
}
