public class FizzBuzz {


    public static String fizzBuzz(int i) {


        String result = "";
        if (i % 3 ==0){
            result = "Fizz";
        }

        if (i % 5==0){
            result += "Buzz";
        }

        if (i % 7==0){
            result += "Fuzz";
        }
        if (result.isEmpty()){
            return String.valueOf(i);
        }

        return result;


    }






    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

           // fizzBuzz(i);

            System.out.println(fizzBuzz(i));
        }
    }

}


