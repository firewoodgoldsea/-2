package cn.cast.digui;

public class Demo1 {
    public static void main(String[] args) {
        int sum =1;
        for (int i = 1; i <=10 ; i++) {
            sum*=i;
        }
        System.out.println(sum);
        System.out.println(digui(10));
    }

    private static  int digui(int n){
        if(n==1){
            return 1;
        }
        return digui(n-1)*n;
    }
}
