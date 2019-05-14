package com.soft1841.jdbc;

import javax.xml.parsers.FactoryConfigurationError;
import java.sql.*;

/**
 * JDBC起步练习
 * 2019.5.15
 */

public class JDBCDemo1 {
    //JDBC驱动名及数据库连接URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_jdbc";

    //数据库的用户名和密码
    static final String USER ="root";
    static final String PASS ="root";

    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        //加载JDBC驱动
        Class.forName(JDBC_DRIVER);
        //建立连接
        System.out.println("连接数据库...");
        Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("实例化Statement对象...");
        //实例化Statement对象
        Statement statement = connection.createStatement();
        //向数据库发送SQL语句
        String sql = "SELECT * FROM t_student";
        //执行查询操作
        ResultSet resultSet = statement.executeQuery(sql);
        //通过循环处理查询的结果集
        while (resultSet.next()){
            //通过字段取值
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            //输出数据
            System.out.print("ID：" + id);
            System.out.print(",姓名：" + name );
            System.out.print("，年龄：" + age);
            System.out.print("\n");
        }
        //关闭连接
        resultSet.close();
        statement.close();
    }
}
