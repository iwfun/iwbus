package com.iwfun.bus.server.facade.v1.impl;

import com.iwfun.bus.server.facade.v1.BusFacade;
import com.iwfun.bus.server.facade.v1.event.BusEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wind
 */
@Slf4j
@RestController
public class BusFacadeImpl implements BusFacade {
    @Override
    public BusEvent prepare(BusEvent busEvent) {
        System.out.println("prepare");
        return null;
    }

    @Override
    public void fire(BusEvent busEvent) {
        System.out.println("fire");
    }
}
