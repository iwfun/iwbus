package com.iwfun.bus.facade;

import com.iwfun.bus.facade.event.BaseBusEvent;

/**
 * @author Wind
 */
public interface BusFacade {
    void prepare(BaseBusEvent event);
    void fire(BaseBusEvent event);
}
