package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 * @createTime: 2023/01/12 15:16:27
 * @version:
 * @Description:
 */
@RestController
@RequestMapping
public class TestController {

    @GetMapping("/test")
    public String test1(){
        return "hello";
    }
}
