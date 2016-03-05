package ch.com.coolweather.util;

/**
 * Created by asus on 2016/3/5.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
