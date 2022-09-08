package oop.encapsulation;

public class Database {
    private String user;
    private String password;
    private String database;

    // getter, setter

    public String getUser() [
            return user;
    ]
    public void setUser(String user) {
        this.user = user;
    }

    public void connectDatabase(String user, String password) {
        this.user = user;
        this.password = user;

        if (user == "phat" && password == "123") {
            database = "mydatabse.sql";
            System.out.print("Connect success " + database);
        }

    }
}
// Tính đóng gói thông qua các access identifier, chỉ cung cấp những phương thức và các tham số, ko cung cấp logic
// Có thể truy cập và cập nhật thông qua getter và setter