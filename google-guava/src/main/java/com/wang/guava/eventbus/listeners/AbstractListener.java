package com.wang.guava.eventbus.listeners;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * @description: Listener之间的继承关系
 * @date: 2020/8/9 16:22
 * @author: wei·man cui
 */
@Slf4j
public abstract class AbstractListener {

    @Subscribe
    public void commonTask(String event) {
        if (log.isInfoEnabled()) {
            log.info("The event [{}] will be handle by {}.{}.", this.getClass().getSimpleName(), "commonTask");
        }
    }

}
