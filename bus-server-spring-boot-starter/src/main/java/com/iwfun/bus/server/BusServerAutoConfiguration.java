package com.iwfun.bus.server;

import com.iwfun.bus.server.config.BusServerProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wind
 */
@Configuration
@ConditionalOnClass(EnableBusServer.class)
@EnableConfigurationProperties(BusServerProperties.class)
public class BusServerAutoConfiguration {


}
