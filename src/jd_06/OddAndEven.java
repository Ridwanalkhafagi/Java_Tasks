package jd_06;

public class OddAndEven {

    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println(result);
        result = isEven(100);
        System.out.println(result);

    }

    public static boolean isOdd(int a){

        if(a%2==0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isEven(int b){
        if(b%2 ==0){
            return true;
        }else{
            return false;
        }
    }

}
