/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author UlviAshraf
 */
public class TCPClient {

    public static void client() throws Exception {
        Config config = Config.getInstance();
        Socket socket = new Socket(config.getIp(), config.getPort());
        Path paths = Paths.get(config.getFileName());
        byte[] data = Files.readAllBytes(paths);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(data.length);
        dos.write(data);
        System.out.println("Data ugurla gonderildi..!");
        dos.close();
    }
}
