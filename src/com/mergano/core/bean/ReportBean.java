package com.mergano.core.bean;

public class ReportBean {

    private int ReportID;

    public int getReportID() {
        return ReportID;
    }

    public void setReportID(int ReportID) {
        this.ReportID = ReportID;
    }

    public String getReportType() {
        return ReportType;
    }

    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    public String getReportDetail() {
        return ReportDetail;
    }

    public void setReportDetail(String ReportDetail) {
        this.ReportDetail = ReportDetail;
    }

    public String getReportStatus() {
        return ReportStatus;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public void setReportStatus(String ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    public String getUserCreated() {
        return UserCreated;
    }

    public void setUserCreated(String UserCreated) {
        this.UserCreated = UserCreated;
    }
    private String ReportType;
    private String ReportDetail;
    private String ReportStatus;
    private String UserCreated;
    private String CreatedDate;
}
