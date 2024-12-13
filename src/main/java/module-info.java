module praticas {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens praticas to javafx.fxml;

    exports praticas;
}
