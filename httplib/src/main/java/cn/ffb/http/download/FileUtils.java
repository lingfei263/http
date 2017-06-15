package cn.ffb.http.download;
/**
 * Created by lingfei on 2017/5/26.
 */
public class FileUtils {
    public static String getFileSuffix(String name) {
        if (name == null || name.equals("")) {
            return "";
        }
        return name.substring(name.lastIndexOf(".") + 1, name.length());
    }
}
