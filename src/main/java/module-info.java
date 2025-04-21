module com.project.jobrecruitingagency {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.jobrecruitingagency to javafx.fxml;
    exports com.project.jobrecruitingagency;
}