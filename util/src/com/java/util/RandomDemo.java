package com.java.util;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.awt.font.MultipleMaster;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
