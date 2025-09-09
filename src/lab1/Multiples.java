package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }


    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while(i <n){
            boolean db3 = i %a==0;
            boolean db5 = i %b==0;
            if(db3 || db5){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int multiples() {
        int i = 1;
        int count = 0;
        while(i < 1000){
            boolean db3 = i %3==0;
            boolean db5 = i %5==0;
            if(db3 || db5){
                count++;
            }
            i++;
        }
        return count;
    }
}
