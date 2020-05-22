package com.iwfun.bus.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Wind
 */
@ConfigurationProperties(prefix = "bus.server")
public class BusServerProperties {
    private String account;
    private String password;
}
