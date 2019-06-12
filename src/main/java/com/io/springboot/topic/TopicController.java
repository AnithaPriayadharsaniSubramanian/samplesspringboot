package com.io.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> returnTopic(){
        return Arrays.asList( new Topic("java","java","java descp"),
                new Topic("sql","sql","sql descp"),
                new Topic("api","api","api descp"));
    }
}