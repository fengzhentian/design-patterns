package com.example.design.patterns.creational.factory.method;

/**
 * Web对话框
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-13 18:06
 */
public class WebDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
