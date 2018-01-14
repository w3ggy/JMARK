package com.jmark.utils.checker;

public interface CheckerLifeCycle {
    void beforeCheck();
    void check();
    void afterCheck();
}
