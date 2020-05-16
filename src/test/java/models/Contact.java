package models;

public class Contact {
    private String firstName;  //optional
    private String middleName; //optional
    private String lastName; //needed
    private String suffix; //optional
    private String title; //optional
    private String email; //optional
    private String phone; //optional
    private String mobile; //optional
    private String department; //optional
    private String fax; //optional
    private String mailingStreet; //optional
    private String accountName; //needed
    private String salutation; //optional

    public static class ContactBuilder {
        String firstName;  //optional
        String middleName; //optional
        String lastName; //needed
        String suffix; //optional
        String title; //optional
        String email; //optional
        String phone; //optional
        String mobile; //optional
        String department; //optional
        String fax; //optional
        String mailingStreet; //optional
        String accountName; //needed
        String salutation; //optional

        public ContactBuilder(String lastName, String accountName) {
            this.lastName = lastName;
            this.accountName = accountName;
        }

        public ContactBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public ContactBuilder setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public ContactBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ContactBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public ContactBuilder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public ContactBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public ContactBuilder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public ContactBuilder setMailingStreet(String mailingStreet) {
            this.mailingStreet = mailingStreet;
            return this;
        }

        public ContactBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    private Contact(ContactBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.suffix = builder.suffix;
        this.title = builder.title;
        this.email = builder.email;
        this.phone = builder.phone;
        this.mobile = builder.mobile;
        this.department = builder.department;
        this.fax = builder.fax;
        this.mailingStreet = builder.mailingStreet;
        this.accountName = builder.accountName;
        this.salutation = builder.salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDepartment() {
        return department;
    }

    public String getFax() {
        return fax;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getSalutation() {
        return salutation;
    }
}
