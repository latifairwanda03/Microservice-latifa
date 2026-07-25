package com.tipa.produser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProduserController {
    @Autowired
    private ProduserServis produserServis;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        produserServis.sendMessage(message);
        return "Message sent:" + message;
    }
    
}