package com.yyds.sansenhoshi.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yyds.sansenhoshi.constant.HttpParams;
import com.yyds.sansenhoshi.entity.privmessage.PrivateMessage;
import com.yyds.sansenhoshi.handle.MessageHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sansenhoshi
 */
@RestController
public class MessageController {
    @Autowired
    private MessageHandle messageHandle;

    @RequestMapping("/message")
    public void getMessage(@RequestBody String message) {
        if (message.contains("heartbeat")){
            System.err.println("--------------------");
        }else {
            PrivateMessage privateMessage = JSON.parseObject(message, PrivateMessage.class);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("user_id",privateMessage.getUserId());
            jsonObject.put("message","嗨害氦，来辣！");
            jsonObject.put("auto_escape",false);
            Boolean aBoolean = messageHandle.messageSend(jsonObject);
            System.err.println(aBoolean);
        }
    }
}
