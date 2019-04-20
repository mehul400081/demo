package org.tripund.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tripund.demo.model.Message;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = "/demo")
    public @ResponseBody Message getMessage() {
        Message msg = new Message();
        msg.setMessage("Hello Demo");
        return msg;
    }
}