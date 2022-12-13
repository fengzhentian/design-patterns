package com.example.design.patterns.creational.factory.method;

/**
 * Windows对话框
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-13 18:06
 */
public class WindowsDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
