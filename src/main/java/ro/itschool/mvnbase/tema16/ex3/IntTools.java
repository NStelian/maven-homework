package ro.itschool.mvnbase.tema16.ex3;

public class IntTools {
    private int number;

    public IntTools(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int digitSum(){
        int copy=number;
        int sum=0;
        while(copy!=0){
            sum+=copy%10;
            copy/=10;
        }
        return sum;
    }

    public int lastDigit(){
        return number%10;
    }

    public int digitAt(int position) throws PositionException { // fa cu liste
        int copy=number;
        int i=0;
        int[] arrayNumber=new int[10];
        while(copy!=0){
            arrayNumber[i]=copy%10;
            copy/=10;
            i++;
        }
        if(position<=0 || position>i){
            throw new PositionException(position);
        }

        return arrayNumber[position-1];
    }
}
