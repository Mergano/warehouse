package com.mergano.core.dbManager;

public class BacklogBean {

    // Backlog table
    private int BacklogID;
    private String ActionType;
    private String ActionDetail;
    private String BacklogDate;
    private String BacklogTime;
    private String user;

    // Setter and Getter for backlog data
    public int getBacklogID() {
        return BacklogID;
    }

    public void setBacklogID(int BacklogID) {
        this.BacklogID = BacklogID;
    }

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public String getActionDetail() {
        return ActionDetail;
    }

    public void setActionDetail(String ActionDetail) {
        this.ActionDetail = ActionDetail;
    }

    public String getBacklogDate() {
        return BacklogDate;
    }

    public void setBacklogDate(String BacklogDate) {
        this.BacklogDate = BacklogDate;
    }

    public String getBacklogTime() {
        return BacklogTime;
    }

    public void setBacklogTime(String BacklogTime) {
        this.BacklogTime = BacklogTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
