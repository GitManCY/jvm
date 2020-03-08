package com.cy.jvm.byteCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;

public class MyTest3 {

    public void test() throws IOException,FileNotFoundException,NullPointerException{
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        }catch (FileNotFoundException ex){

        }catch (IOException ex){

        }catch (Exception e){

        }finally {
            System.out.println("finally");
        }
    }
}
