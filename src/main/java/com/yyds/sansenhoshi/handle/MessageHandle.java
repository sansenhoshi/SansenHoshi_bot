package com.yyds.sansenhoshi.handle;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.yyds.sansenhoshi.constant.HttpParams;
import com.yyds.sansenhoshi.constant.RetCode;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;

/**
 * @author sansenhoshi
 * 消息发送工具
 */
@Component
public class MessageHandle {
    public Boolean messageSend(JSONObject message){
        //创建http请求
        String post = HttpUtil.post(HttpParams.URL+HttpParams.SENDPRIVATEMSG,message);
        //请求go-cqHttp服务端，发送内容
        JSONObject parse = JSONObject.parseObject(post);
        return (Integer) parse.get("retcode") == RetCode.SUCESS && parse.get("status").equals("OK");
    }
}
