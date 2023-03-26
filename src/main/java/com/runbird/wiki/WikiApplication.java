package com.runbird.wiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@SpringBootApplication
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);

        ConfigurableEnvironment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("启动端口：{}", env.getProperty("server.port"));
    }

}
