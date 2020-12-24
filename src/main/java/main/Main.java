package main;

import util.Menu;
import util.TCPClient;
import util.TCPServer;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu.process();
        TCPClient.client();
    }
}
