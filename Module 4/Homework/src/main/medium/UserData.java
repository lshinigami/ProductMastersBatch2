package medium;
public class UserData {
    private int id;
    private String name;
    private String email;
    public UserData(){}
    public UserData(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nname: " + name + "\nemail: " + email;
    }
}
