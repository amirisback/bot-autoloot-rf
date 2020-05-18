package com.frogobox;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws AWTException {
	// write your code here

        JFrame frame = new JFrame("BotAutoLoot");
        frame.setContentPane(new BotAutoLoot().getRootPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
