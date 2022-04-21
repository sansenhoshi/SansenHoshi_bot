package com.yyds.sansenhoshi.entity.group;

import lombok.Data;
/**
 * @author sansenhoshi
 * 接收消息实体类
 */
@Data
public class GroupMessage {
    /**
     * 匿名信息, 如果不是匿名消息则为 null
     */
    private String anonymous;
    /**
     * 字体
     */
    private int font;
    /**
     * 群号
     */
    private long groupId;
    /**
     * 消息内容
     */
    private String message;
    /**
     * 消息id
     */
    private long messageId;
    /**
     * 消息序列
     */
    private int messageSeq;
    /**
     * 消息类型
     */
    private String messageType;
    /**
     * 上报类型
     */
    private String postType;
    /**
     * 原始消息内容
     */
    private String rawMessage;
    /**
     * 收到事件的机器人 QQ 号
     */
    private long selfId;
    /**
     * 发送人信息
     */
    private Sender sender;
    /**
     * 消息子类型, 正常消息是 normal, 匿名消息是 anonymous, 系统提示 ( 如「管理员已禁止群内匿名聊天」 ) 是 notice
     */
    private String subType;
    /**
     * 事件发生的时间戳
     */
    private long time;
    /**
     * 发送者 QQ 号
     */
    private long userId;
}