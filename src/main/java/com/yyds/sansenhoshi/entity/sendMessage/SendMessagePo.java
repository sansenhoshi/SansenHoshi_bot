package com.yyds.sansenhoshi.entity.sendMessage;

import lombok.Data;

/**
 * @author sansenhoshi
 * 发送消息实体类
 */
@Data
public class SendMessagePo {
    /**
     * 用户的qq号码
     */
    private String userId;
    /**
     * 群号
     */
    private String groupId;
    /**
     * 消息本体
     */
    private String message;
    /**
     * 消息内容是否作为纯文本发送 ( 即不解析 CQ 码 ) , 只在 message 字段是字符串时有效
     */
    private Boolean autoEscape;

}
