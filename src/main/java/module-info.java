module org.ryansallee {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.ryansallee to javafx.fxml;
    exports org.ryansallee;
}