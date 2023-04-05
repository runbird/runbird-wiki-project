package com.runbird.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: JimLock
 * @desc: EBookController
 * @version:1.0
 * @create:2023/4/5 21:35
 */

@RestController("/ebook")
public class EBookController {

    @GetMapping("/list")
    public void getListByName(String name) {

    }
}
