package Homework_5_4_Proxy;

public class ProxyDataAccess implements  DataAccess{
    private NormalDataAccess normalDataAccess;
    private String username;
    private String password;

    public ProxyDataAccess(String username, String password) {
        this.username = username;
        this.password = password;
        this.normalDataAccess = new NormalDataAccess();
    }

    @Override
    public void readData() {
        if (isAuthorized()) {
            normalDataAccess.readData();
        } else {
            System.out.println("Доступ запрещён");
        }
    }

    @Override
    public void writeData(String data) {
        if (isAuthorized()) {
            normalDataAccess.writeData(data);
        } else {
            System.out.println("Доступ запрещён");
        }
    }

    private boolean isAuthorized() {
        return username.equals("admin") && password.equals("password");
    }
}
