package ro.itschool.mvnbase.tema17.recursionEx;

public class ZeroCounter {
    public int count(int number){
        if(number==0){
            return 0;
        }else if(number%10==0){
            return 1+count(number/10);
        }else{
            return count(number/10);
        }
    }
}
