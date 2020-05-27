package com.iwfun.bus.server.facade.v1.event;

import java.io.Serializable;

/**
 * bus event
 *
 * @author Wind
 */
@lombok.Data
public class BusEvent<T extends Serializable> {
    /**
     * business id,eg: orderId;
     */
    private Long bizId;

    /**
     * business type
     * recommended use 【class】 simple name;
     * eg：OrderCreatedEvent
     */
    private String bizType;

    /**
     * destination service
     * spring.application.name
     */
    private String destination;

    /**
     * origin service
     * spring.application.name
     */
    private String origin;

    /**
     * data transfer object
     * the (business) object which you want to transfer to destination service
     * eg: Order
     */
    private T dto;
}