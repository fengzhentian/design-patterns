package com.example.design.patterns.creational.factory.method;

/**
 * 对话框
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-12 18:29
 */
public abstract class Dialog {

    /**
     * 渲染
     */
    public void render() {
        Button button = createButton();
        button.render();
    }

    /**
     * 创建按钮
     *
     * @return 按钮
     */
    protected abstract Button createButton();

}
