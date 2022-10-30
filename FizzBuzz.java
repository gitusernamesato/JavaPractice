import java.util.Scanner;
import java.util.InputMismatchException;

class FizzBuzz{
  public static void main(String[] args){
    end(10);

    input();
  }


  public static void end(int end){
    for(int i = 1; i <= end; i++){
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      }else if(i % 3 == 0){
        System.out.println("Fizz");
      }else if(i % 5 == 0){
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }


    public static void input(){
      try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input > ");

        int i = scanner.nextInt();

        if(i % 15 == 0){
          System.out.println("FizzBuzz");
        }else if(i % 3 == 0){
          System.out.println("Fizz");
        }else if(i % 5 == 0){
          System.out.println("Buzz");
        }else{
          System.out.println(i);
        }
        scanner.close();
        }catch(InputMismatchException e){
        System.out.println("整数を入力してください。");
        }
    }
}