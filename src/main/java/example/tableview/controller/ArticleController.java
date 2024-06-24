package example.tableview.controller;

import example.tableview.entity.Article;
import example.tableview.repository.MySqlRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ArticleController implements Initializable {
    public TableView tableView;
     MySqlRepository mySQLRepository = new MySqlRepository();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Article> data = FXCollections.observableArrayList(mySQLRepository.findAll());
        tableView.setItems(data);
    }
}

