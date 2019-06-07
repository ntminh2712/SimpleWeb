package simpleweb.entity;

public class Student {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String phone;
    private String address;
    private Status status;

    public Student() {
    }

    public Student(String username, String password, String fullName, String email, String phone, String address) {
        this.username = username;
        this.password = password;
        this.fullname = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if(status == null){
            status = Status.DEACTIVE;
        }
        this.status = status;
    }

    public enum Status{
        ACITVE(1), DEACTIVE(0), DELETED(-1);
        int value;
        Status(int value){this.value = value;}
        public int getValue(){return value;}
        public static Status findByValue(int value){
            for (Status status :
                    Status.values()) {
                if (status.getValue() == value){
                    return status;
                }
            }
            return  null;
        }
    }
}

