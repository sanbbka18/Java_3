import java.util.InputMismatchException;
import java.util.Scanner;

public class lb42 {
    public  static int findNum(int[]array){
        int maxNum=Integer.MIN_VALUE;
        int index=-1;
        if(array.length!=0){
            for(int i=0;i<array.length;i++){
                if((array[i]%3==0)&array[i]>maxNum){
                    maxNum=array[i];
                    index=i;
                }
            }
            if(index>-1){
                return index;
            }
            throw new NullPointerException();
        }
          throw new NullPointerException();
    }
    public static void main(String[]args){

     try(Scanner sc=new Scanner(System.in)){
         System.out.println("Введіть довжину масиву: ");
         int[] arr=new int[sc.nextInt()];
         for(int i=0;i<arr.length;i++){
         arr[i]= sc.nextInt();
         }
         System.out.println("Індекс найбільшої кількості діленого на 3 = "+ findNum(arr));
         System.out.println("Число під цим індексом ="+ arr[findNum(arr)]);
     }catch (InputMismatchException e){
      System.out.println("Ви ввели неправильний тип даних ");
     }
     catch (NullPointerException e){
         System.out.println("У даному масиві немає числа, яке ділиться на 3");
     }
    }
}