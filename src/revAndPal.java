public class revAndPal {
    public static void main(String[] args) {
        System.out.println(isPal(0));

    }
    public static int reverse(int x) {
        int temp;
        long reverse = 0;

        while(x!=0){
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x/10;
        }
        if(reverse >=0)
            return (int)reverse;
        else
            return 0;

    }
    static boolean isPal(int n){

        if(  n != reverse(n)){
            return false;
        }
        else
            return true;

    }
}


