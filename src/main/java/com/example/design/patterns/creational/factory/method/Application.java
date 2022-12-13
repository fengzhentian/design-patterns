package com.example.design.patterns.creational.factory.method;

/**
 * XXX
 *
 * @author jingjq
 * @version 1.0
 * @date 2022-12-13 18:07
 */
public class Application {

    private Dialog dialog;

    public void initialize() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    public void main() {
        this.initialize();
        dialog.render();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.main();
    }

}
