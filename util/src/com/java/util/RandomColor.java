package com.java.util;

import org.omg.CORBA.INTERNAL;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class RandomColor {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int redRandom = random.nextInt(256);
        int greenRandom = random.nextInt(256);
        int blueRandom = random.nextInt(256);
        System.out.println("R:" + redRandom + ",G:" + greenRandom + ",B:" + blueRandom );
        //开始使用刚才的随机的色值来绘制衣服图片
        //在图片缓冲区生成对象,指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(120,60,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        //设置字体的变量
        Font font = new Font("微软雅黑",Font.BOLD,16);
        graphics.setFont(font);
        //设置画笔颜色，
        Color color = new Color(redRandom ,greenRandom ,blueRandom );
        graphics.setColor(color);

        //开始绘制
        graphics.fillRect(0,0,120,42);
        //用黑色绘制文字
        //绘制文字
        graphics.setColor(color.BLACK);

        graphics.drawString("",40,15);
        //输出图片
        File file = new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();
    }
}
