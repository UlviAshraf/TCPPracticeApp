package util;

public class Config {
    private String fileName;
    private String ip;
    private int port;

    private static Config config;

    private Config() {
    }

    public Config(String fileName, String ip, int port) {
        this.fileName = fileName;
        this.ip = ip;
        this.port = port;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
            return config;
        } else {
            return config;
        }
    }
}
