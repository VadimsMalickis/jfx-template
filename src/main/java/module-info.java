module lv.rvt {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.slf4j;
    requires org.xerial.sqlitejdbc;
     
    opens lv.rvt to javafx.fxml;
    exports lv.rvt;
    exports lv.rvt.Controller;
    exports lv.rvt.Model;
    exports lv.rvt.View;
    exports lv.rvt.Utils;

}
