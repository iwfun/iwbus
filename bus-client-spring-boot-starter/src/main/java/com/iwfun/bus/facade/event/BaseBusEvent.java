package com.iwfun.bus.facade.event;

/**
 * @author Wind
 */
public class BaseBusEvent {
    private String id;
    private String dest;
    private Object dto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Object dto) {
        this.dto = dto;
    }
}
