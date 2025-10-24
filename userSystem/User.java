package userSystem;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int userType; // 0 = Admin, 1 = Staff, 2 = User
    
    public User() {
        this.userType = 2; 
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
    public int getUserType() {
        return userType;
    }
    public void setUserType(int userType) { // Fixed method name
        this.userType = userType;
    }
    
    public static int login(ArrayList<User> userLists, String username, String password) {
        for (User user : userLists) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user.getUserType();
            }
        }
        return -1;
    }
}