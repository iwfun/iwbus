package com.iwfun.bus.server.facade.v1;

import com.iwfun.bus.server.facade.v1.event.BusEvent;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * BusFacade
 * @Transaction
 * {
 *      BaseEvent event = BusFacade.prepare(new Event)
 *      do business logic
 *      ......
 *      try{
 *          BusFacade.fire(event);
 *      }catch(Exception e){
 *          //do nothing
 *      }
 * }
 * @author Wind
 */
@RequestMapping("bus/v1")
public interface BusFacade {
    /**
     * prepare Event
     * @param busEvent
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/prepare", method = POST)
    BusEvent prepare(@RequestBody BusEvent busEvent);

    /**
     * fire Event
     * @param busEvent
     */
    @ResponseBody
    @RequestMapping(value = "/fire", method = POST)
    void fire(@RequestBody BusEvent busEvent);
}
