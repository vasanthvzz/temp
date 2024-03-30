import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class recurPrint {
    public static void main(String[] args) {
        String s = "aab";
        s = "abc";
        List result = helper(s,"",s);
        HashSet<String> set = new HashSet<>(result);
        //System.out.println(set);
        System.out.println(iterPrint(s));
    }

    static  List<String> iterPrint(String s){
        List<String> result = new ArrayList();
        result.add("");
        for(char c : s.toCharArray()){
            int n = result.size();
            for(int i = 0;i<n;i++){
                String temp = result.get(i)+ c;
                result.add(temp);
            }
        }
        return result;
    }
    



    static List<String> helper(String s , String processed , String unprocessed){
        if(unprocessed.length() == 0){
            List<String> temp = new ArrayList<>();
            if(processed.equals("")){
                return temp;
            }
            temp.add(processed);
            return temp;
        }
        List<String> result = new ArrayList<>();
        result.addAll(helper(s, processed+unprocessed.charAt(0), unprocessed.substring(1)));
        result.addAll(helper(s, processed, unprocessed.substring(1)));
        return result;
    }
}
