package com.java.util;



import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色
 */
public class RandomColorful {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        //生成redradom
        int red = random.nextInt(256);
        //生成green
        int green = random.nextInt(256);
        //blue
        int blue = random.nextInt(256);
        System.out.println("R:" + red + ", G:" + green + ", B:" + blue);
        //绘制图片
        //在图片缓冲区生成图片对象 指定图片大小类型
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色
        Color color = new Color(red,green,blue);
        g.setColor(color);
        //绘制,充满
        g.fillRect(0,0,120,40);
        //字的颜色
        g.setColor(Color.black);
        //创建字母及数字的数组
        char[] ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int len=ch.length;
        int letter;
        //循环输出字
        for(int i=0;i<4;++i){
            letter=random.nextInt(len);
            //画出对应随机的验证码字符
            g.drawString(ch[letter]+"",(i*20)+15,20);
        }
        //输出
        File file = new File("D:/code.jpg");
        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
    }
}
