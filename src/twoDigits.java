public class twoDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));

    }

 static  int addDigits(int num) {
        int sum = 0;
       int i = num % 100 / 10;
        int j = num % 10;
        sum+=num;
        if (sum < 10) {
            return sum;
        }
        else
      return num;
    }
}










