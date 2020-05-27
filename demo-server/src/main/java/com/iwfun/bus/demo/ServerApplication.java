package com.iwfun.bus.demo;

import com.iwfun.bus.server.EnableBusServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * bus center demo
 *
 * @author Wind
 */
@EnableBusServer
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
