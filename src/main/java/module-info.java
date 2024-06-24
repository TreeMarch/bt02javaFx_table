module example.tableview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jdk.jdi;
    requires java.desktop;

    opens example.tableview to javafx.graphics,javafx.fxml;
    opens example.tableview.controller to javafx.graphics,javafx.fxml;
    opens example.tableview.entity to javafx.graphics,javafx.fxml;
    opens example.tableview.repository to javafx.graphics,javafx.fxml;

    exports example.tableview;
    exports example.tableview.entity;
    exports example.tableview.repository;
    exports example.tableview.controller;

}