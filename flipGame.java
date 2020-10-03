// 293 leeetcode
import java.util.ArrayList;
import java.util.List;
class flipGame{

    public static List<String> flipGame(String str){
        List<String> result = new ArrayList<>();
        char[] characters = str.toCharArray();

        for(int i=0; i<characters.length-1; i++){
            if(characters[i] == '+' && characters[i] == characters[i+1]){
                characters[i] = '-';
                characters[i+1] = '-';
                result.add(new String(characters));
                characters[i] = '+';
                characters[i+1] = '+';
            }
        }

        return result;
    }

    public static void main(String[] args){
        String str = "++++++++";
        System.out.println(flipGame(str));
    }
}