
package test04;
import java.util.ArrayList;
import java.util.HashMap;
public class user_pass {
    private ArrayList user_name ;
    private ArrayList pass_word ;
    public user_pass(){
        user_name = new ArrayList();
        pass_word = new ArrayList();
        user_name.add("op");
        user_name.add("ken");
        user_name.add("admin");
        pass_word.add("12");
        pass_word.add("123");
        pass_word.add("admin");
    }
    public void user_pass_re(String user,String pass){
        user_name.add(user);
        pass_word.add(pass);
    }
    public ArrayList get_user_name(){
        return user_name;
    }
    public ArrayList get_pass_word(){
        return pass_word;
    }

}