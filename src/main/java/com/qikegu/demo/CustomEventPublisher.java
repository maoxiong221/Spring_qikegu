package com.qikegu.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    // 必须重写这个方法获取ApplicationEventPublisher
    public void setApplicationEventPublisher (ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }

    public void publish() {
        CustomEvent event = new CustomEvent(this, "");
        publisher.publishEvent(event);
    }
}
