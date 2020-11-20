package com.dyzwj.springkafka;


import com.dyzwj.springkafka.producer.MyKafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringKafkaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private MyKafkaProducer producer;

    @Test
    public void produce(){
        producer.produce();
    }




}
