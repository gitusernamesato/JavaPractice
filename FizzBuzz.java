// import java.util.Scanner;
// import java.util.InputMismatchException;

class FizzBuzz{
  public static void main(String[] args){
    int end = 30;
    for(int x = 1; x <= end; x++){
      if(x % 3 == 0 && x % 5 == 0){
        System.out.println("FizzBuzz");
      }else if(x % 3 == 0){
        System.out.println("Fizz");
      }else if(x % 5 == 0){
        System.out.println("Buzz");
      }else{
        System.out.println(x);
      }
    }

    // try {
    //   Scanner scanner = new Scanner(System.in);
    //   System.out.print("Input > ");

    //   int x = scanner.nextInt();

    //   if(x % 15 == 0){
    //     System.out.println("FizzBuzz");
    //   }else if(x % 3 == 0){
    //     System.out.println("Fizz");
    //   }else if(x % 5 == 0){
    //     System.out.println("Buzz");
    //   }else{
    //     System.out.println(x);
    //   }
    //   scanner.close();
    //   }catch(InputMismatchException e){
    //     System.out.println("整数を入力してください。");
    //   }
    }
  }