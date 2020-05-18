package com.frogobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * BotAutoLoot
 * Copyright (C) 18/05/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class BotAutoLoot {
    private JButton buttonPressX;
    private JPanel rootPanel;
    private JButton stopLootButton;
    boolean stateKey = false;
    Robot robot = new Robot();
    Thread lootThread;

    public BotAutoLoot() throws AWTException {
        runTheCode();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void runTheCode() {
        setupButton();
    }

    private void setupButton() {
        buttonPressX.addActionListener(e -> {
            new Thread(() -> {
                while (true) {
                    doPressX(robot);
                }
            }).start();
        });


        stopLootButton.addActionListener(e -> {
            doReleaseX(robot);
        });
    }

    private void doPressX(Robot robot) {
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_X);
        System.out.println("Pressing Keyboard X");
    }

    private void doReleaseX(Robot robot) {
        robot.keyRelease(KeyEvent.VK_X);
        System.out.println("Stop");
        System.exit(0);
    }

}
