package com.java.util;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

/**
 * Integer类的联系
 * @author 蔡一帆
 * 2019.3.12
 */

public class IntegerDemo {
    public static void main(String[] args) {
        int n = 31;
        //调用Integer类的方法，将n转换进制
        //二进制
        String string = Integer.toBinaryString(n);
        System.out.println("二进制：" + string);
        //八进制
        String string1 = Integer.toOctalString(n);
        System.out.println("八进制：" + string1);
        //十六进制
        String string2 = Integer.toHexString(n);
        System.out.println("十六进制：" + string2);
        //七进制
        String string3 = Integer.toString(n,7);
        System.out.println("七进制：" + string3);
        System.out.println("---------------------------------");
        String string4 = convet(76,2);
        System.out.println("转换的进制数为：" + string4);
    }

    private static String convet(int num, int radix) {
        StringBuffer stringBuffer = new StringBuffer();
        while (num!=0){
            //求余数
            int remainder = num % radix;
            //将余数加入StringBuffer
            stringBuffer.append(String.valueOf(remainder));
            //更新被除数为商
            num = num / radix;

        }
        //num转为radix进制
        return stringBuffer.reverse().toString();
    }


}
