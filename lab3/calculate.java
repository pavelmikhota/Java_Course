import java.util.Arrays;

public class calculate implements var08 {

    public double logika(double d1, double d2, double d3){
        if(d3 == d2){
            System.out.println("1.Порядковый номер числа: "+1);
        }else if(d1 == d3){
            System.out.println("1.Порядковый номер числа: "+2);
        }else{System.out.println("1.Порядковый номер числа: "+3);}
        return 0;
    }
    public void poka(int N){
        while((N>0)&((N%10)%2==0)) {
            N /=10;
        }
        if((N%10)%2!=0){
            System.out.println("2.True");}else{
                System.out.println("2.False");}
        //True - есть нечетные; False - четные
    }
    public void massivy(int[] A){
        Arrays.sort(A);
        for(int i=0; i<=A.length; i++){
            if(A[i]%2==0){
                int n = A[i];
                System.out.println("3.Минимальный четное число: "+n);
                break;
            }
        }

    }
}
