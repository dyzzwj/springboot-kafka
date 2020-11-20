package com.dyzwj.springkafka.producer;


import com.alibaba.fastjson.JSON;
import com.dyzwj.springkafka.po.Message;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produce(){
        for (int i = 0; i < 10; i++){
            Message message = new Message();
            message.setTaskId(System.currentTimeMillis());
            message.setSendTime(new Date().toString());
            message.setMsg("msg " + i);
            kafkaTemplate.send("test1",String.valueOf(i), JSON.toJSONString(message));
        }

    }

}
