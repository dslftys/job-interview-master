package com.job.code.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Victor on 2017/8/27.
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",5678);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        String message = "This is client";
        os.write(message.getBytes());

        byte[] buffer = new byte[100];
        int length = is.read(buffer,0,buffer.length);
        String response = new String(buffer,0,length);
        System.out.println("The response: "+response);
    }
}
