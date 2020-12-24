package util;

import java.util.Scanner;

public class Menu {
    public static void process() {
        Config config = Config.getInstance();
        System.out.println("Zehmet olmasa adinizi qeyd edin:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Zehmet olmasa soyadinizi qeyd edin:");
        String surname = sc.nextLine();
        System.out.println(name + " " + surname + " Xosh gelmisiniz");
        System.out.println("Zehmet olmasa gondermek istediyiniz file-in kechidini yazin:");
        String file = sc.nextLine();
        config.setFileName(file);
        System.out.println("Zehmet olmasa file-i gondereceyiniz serverin ip ve portunu daxil edin:");
        String connect = sc.nextLine();
        String[] ipAndPort = connect.split(":");
        config.setIp(ipAndPort[0]);
        config.setPort(Integer.parseInt(ipAndPort[1]));
    }
}
