package com.qikegu.demo;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source, String message) {
        super(source);
    }

    public String toString() {
        return "我是自定义事件";
    }
}
