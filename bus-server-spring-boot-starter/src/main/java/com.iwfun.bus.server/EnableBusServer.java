package com.iwfun.bus.server;


import java.lang.annotation.*;

/**
 * 启动bus中心服务
 * @author Wind
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableBusServer {

}
