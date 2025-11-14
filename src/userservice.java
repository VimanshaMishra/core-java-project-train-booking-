import java.util.HashMap;
import java.util.Map;

public class userservice {
    private Map<String,user> userMap=new HashMap<>();
    private user curruser=null;
    public boolean register(String username,String password,String fullname, String contact){
        if(userMap.containsKey(username)){
            System.out.println("User already exists!");
            return false;
        }
        user user=new user(username,password,fullname,contact);
        userMap.put(username,user);
        System.out.println("User registered successfully!");
        return true;
    }
    public boolean login(String username,String password){
        if(!userMap.containsKey(username)){
            System.out.println("User does not exists!");
            return false;
        }
        user user=userMap.get(username);
        if(!user.getPassword().equals(password)){
            System.out.println("Login unsuccessful!");
            return false;
        }
        curruser=user;
        System.out.println("Login successful!");
        return true;

    }
    public void logout(){
        if(curruser!=null){
            System.out.println("Logout successful!"+curruser.getFullname());

    }
        curruser=null;
}

public  user getUser(){
    return curruser;
    }

    public  boolean isLoggedIn(){
        return curruser!=null;
    }
}