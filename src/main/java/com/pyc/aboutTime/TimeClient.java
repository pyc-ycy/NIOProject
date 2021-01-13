//IntelliJ IDEA
//NIOProject
//TimeClient
//2021/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.aboutTime;

public class TimeClient {
    public static void main(String[] args) {
        int port = 8234;
        if(args!=null&&args.length>0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1",port),"TimeClient-001").start();
    }
}
