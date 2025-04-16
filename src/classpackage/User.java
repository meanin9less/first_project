package classpackage;

public class User {
    private String id;
    private String pw;
    private String name;
    private String address;
    private String contact;

    public User (String id, String pw, String name, String address, String contact){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }


    public String getId(){
        return this.id;
    }
    public String getPw(){
        return this.pw;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getContact(){
        return this.contact;
    }

    public void setAddress(String inputAddress){
        this.address = inputAddress;
    }
    public void setContact(String inputContact){
        this.contact = inputContact;
    }


}
