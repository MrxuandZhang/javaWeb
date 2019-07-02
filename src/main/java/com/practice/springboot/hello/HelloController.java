package com.practice.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @Author xuzhangyuan
 * @Date 2019/7/2 16:18
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hi() {
        return "Congratulations1 It works!";
    }
}
