package com.dyzwj.springkafka.consumenr;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dyzwj.springkafka.po.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


import java.util.Optional;

@Component
public class MyKafkaConsumer {

    @KafkaListener(topics = {"test1"})
    public void consume(ConsumerRecord<String, String> consumerRecord){
        Optional<String> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if(kafkaMessage.isPresent()){
            Object s = kafkaMessage.get();
            System.out.println(s);
            Message message = JSON.toJavaObject(JSONObject.parseObject((String) s), Message.class);
            System.out.println(message);
        }
    }

}
