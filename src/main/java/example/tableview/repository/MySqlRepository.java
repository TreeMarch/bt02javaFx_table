package example.tableview.repository;

import example.tableview.entity.Article;

import java.sql.*;
import java.util.ArrayList;

public class MySqlRepository {

    private final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/bt02_javafx";
    private final String MYSQL_USERNAME = "root";
    private final String MYSQL_PASSWORD = "";


    public ArrayList<Article> findAll(){
       ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USERNAME, MYSQL_PASSWORD);
            String prSql = "SELECT * FROM article";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(prSql);
            while (resultSet.next()) {
                Article obj = new Article();
                obj.setId(resultSet.getLong("id"));
                obj.setTitle(resultSet.getString("title"));
                obj.setDes(resultSet.getString("description"));
                obj.setContainer(resultSet.getString("content"));
                articles.add(obj);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }
}
