import java.util.Scanner;
import java.util.Stack;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findOutput(sc.next()));

    }

    public static int findOutput(String s){
        Stack<Integer> numStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                int n1 = numStack.pop();
                int n2 = numStack.pop();
                numStack.push(performOperation(n1,n2,s.charAt(i)));
            }else{
                numStack.push(s.charAt(i)-'0');
            }

        }
        return numStack.pop();
    }

    public static int performOperation(int num1, int num2, char c){
        switch (c) {
            case '+':{
                return num2+num1;
            }
            case '-':{
                return num2-num1;
            }
            case '*':{
                return num2*num1;
            }
            case '/':{
                return num2/num1;
            }

        }
        return 0;
    }
}
