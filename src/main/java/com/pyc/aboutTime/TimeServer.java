//IntelliJ IDEA
//NIOProject
//TimeServer
//2021/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.aboutTime;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8234;
        if(args!=null&&args.length>0){
            try{
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }
}
