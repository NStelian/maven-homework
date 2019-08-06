package ro.itschool.mvnbase.tema17.recursionEx;

public class DigitSum {
    public int sum(int number){
        if(number==0){
            return 0;
        } else{
            return Math.abs(number%10)+sum(number/10);
        }
    }
}
