package length;
import java.util.Scanner;

public class CheckLength{
    public String getString;
    public int count = 0;
    public CheckLength(String getString){
        this.getString = getString;
    }
    
    public void length_num(){
        for(char c : getString.toCharArray()){
            count++;
        }
        
    }
}