package com.example.design.patterns.creational.factory.method;

/**
 * 按钮接口
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-12 18:29
 */
public interface Button {

    /**
     * 渲染
     */
    void render();

    /**
     * 点击
     */
    void onClick();

}
