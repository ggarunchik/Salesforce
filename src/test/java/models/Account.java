package models;

public class Account {
    String accountName;
    String phone;
    String webSite;
    String employees;
    String textArea;

    public Account(String accountName, String phone, String webSite, String employees, String textArea) {
        this.accountName = accountName;
        this.phone = phone;
        this.webSite = webSite;
        this.employees = employees;
        this.textArea = textArea;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }
}
