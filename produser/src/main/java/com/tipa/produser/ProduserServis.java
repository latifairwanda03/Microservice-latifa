package com.tipa.produser;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class ProduserServis {
    @Autowired
    private RabbitTemplate rabbitTemplate;

        @Autowired
        @Qualifier("myQueue")
        private Queue queue;

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(queue.getName(), message);
        System.out.println("Sent: " + message);
    }
    
}
