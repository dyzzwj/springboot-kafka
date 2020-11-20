package com.dyzwj.springkafka.po;


public class Message {

    private long taskId;

    private String sendTime;

    private String msg;


    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "taskId=" + taskId +
                ", sendTime='" + sendTime + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
