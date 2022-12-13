package com.example.design.patterns.creational.factory.method;

/**
 * HTML按钮
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-13 18:05
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
