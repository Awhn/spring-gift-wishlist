package gift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        final Connection connection = getConnection();
        connection.close();
    }

    public static Connection getConnection() throws Exception {
        var url = "jdbc:h2:mem:test";
        var user = "sa";
        var password = "";
        return DriverManager.getConnection(url,user,password);
    }
}
