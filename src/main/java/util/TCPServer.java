/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author UlviAshraf
 */
public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(321);
        while (true) {
            System.out.println("Qoshulma gozleyir");
            Socket socket = server.accept();
            System.out.println("Qoshulma tamamlandi...");
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int length = dis.readInt();
            byte[] arr = new byte[length];
            dis.readFully(arr);
            writeIntoFile("C:\\Users\\UlviAshraf\\Desktop\\3ay.jpg", arr);
        }
    }

    private static void writeIntoFile(String filePath, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
