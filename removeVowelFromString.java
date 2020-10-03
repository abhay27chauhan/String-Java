import java.util.HashSet;
class removeVowelFromString{

    public static String removeVowels(String s){
        HashSet<Character> hs = new HashSet<>();
        hs.add('a'); 
        hs.add('e'); 
        hs.add('i'); 
        hs.add('o'); 
        hs.add('u');

        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1; i>=0; i--){
            if(hs.contains(sb.charAt(i))){
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        String str = "aeiou";
        System.out.println(removeVowels(str));
    }
}