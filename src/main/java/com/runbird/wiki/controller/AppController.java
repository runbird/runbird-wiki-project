package com.runbird.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: JimLock
 * @desc: AppController
 * @version:1.0
 * @create:2023/3/26 21:13
 */
@RestController
public class AppController {

    @GetMapping("/hello")
    public String test() {
        return "Hello World!";
    }
}
