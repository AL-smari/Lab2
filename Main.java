import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
//        String [] sen = {"cat","dog","red","is","am"};
//        longest(sen);


        //Q2

//        int [] numbers = {1,1,1,3,3,5};
//        System.out.println("enter the number");
//        int match = s.nextInt();
//        occurs(numbers,match);


        //Q3

//        System.out.println("enter the K");
//        int k =s.nextInt();
//        int [] num = {1,4,17,7,25,3,100};
//        largest(num,k);

        //Q4
//        int [] test = {5,4,3,2,1};
//        revers(test);



        //Q5
//    program();


        //Q6
//        random();



        //Q7

//        System.out.println("enter the password");
//        String pass = s.nextLine();
//        int point = checkLength(pass)+checkSpecialCharacter(pass)+checkUpperCaseLowerCase(pass);
//        if(point>=8){
//            System.out.println("password is strong");
//        }else if(point>=5 && point <8){
//            System.out.println("password is moderately strong");
//        }else System.out.println("password is weak");




        //Q8

//        System.out.println("enter the number of fibonacci terms to generate");
//        int fib = s.nextInt();
//        fibonacci(fib);





        

    }

    //Q1
    public static void longest(String [] sen){

        ArrayList<String> str = new ArrayList<>();
        String lon = sen[0];
        for (int i = 0; i <sen.length ; i++) {
            if(sen[i].length()>=lon.length()){
                lon=sen[i];
                str.add(lon);
            }
        }
        System.out.println(str);

    }
    //Q2
    public static void occurs (int []numbers,int match){
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(match == numbers[i]){
                count++;
            }
        }
        System.out.println(match+" occurs "+count+" times");


    }

    //Q3

    public static void largest(int [] num , int k){
        Arrays.sort(num);
        System.out.println(k+" largest element of the array: ");
        for (int i = num.length-1; i >=num.length-k ; i--) {
            System.out.print(num[i]+" ");

        }

    }
    //Q4
    public static void revers(int [] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);

        }

    }
    //Q5
    public static void program(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = s.nextInt();
        int [] ar = new int[size];
        int option;
                do {
            System.out.println("1.Accept element of an array");
            System.out.println("2.Display element of an array");
            System.out.println("3.Search the element within array");
            System.out.println("4.Sort the array");
            System.out.println("5.To Stop");
            option = s.nextInt();
            if(option==1) {
                for (int i = 0; i < ar.length; i++) {
                    System.out.println("enter the numbers");
                    ar[i] = s.nextInt();
                }
            }else if(option ==2){
                for (int i = 0; i < ar.length; i++) {
                    System.out.print(ar[i]+" ");

                }
                System.out.println("");
            }else if(option==3){
                System.out.println("enter the number");
                int search = s.nextInt();
                boolean b = false;
                for(int a : ar){
                    if(a==search){
                        b=true;
                    }
                }
                System.out.println(b);
            }else if(option==4){
                Arrays.sort(ar);
            }
        }while (option !=5);
        System.out.println("Exit");

    }
    //Q6
    public static void random(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the minimum value of the rang :");
        int min = s.nextInt();
        System.out.println("Enter the maximum value of the rang :");
        int max = s.nextInt();
        System.out.println("Enter the number of the random numbers generate:");
        int numG =s.nextInt();
        int rang = max-min+1;
        for (int i = 0; i <numG ; i++) {
            System.out.print((int)(Math.random()*rang)+min+" ");

        }

    }
    //Q7
    public static int checkLength (String str){
        int point;
        if(str.length()>=8){
            point=3;

        }else if(str.length()==7 || str.length() ==6){
            point =2;
        }else point =0;

        return point;
        }

        public static int checkSpecialCharacter(String str){
        int point=0;
            for (int i = 0; i < str.length(); i++) {
                if(Character.isLetterOrDigit(str.charAt(i))==false){
                    point =2;
                    break;
                }else point =0;

            }
            return point;
        }


        public static int checkUpperCaseLowerCase(String str){
        int point ;
        int check=0;
            for (int i = 0; i < str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i))){
                    check++;
                    break;
                }

            } for (int i = 0; i < str.length(); i++) {
                if(Character.isLowerCase(str.charAt(i))){
                    check++;
                    break;
                }

            }
            if(check==2){
                point=3;
            }else point =0;



            return point;

        }

        //Q8
        public static void fibonacci(int num){
            int first=0;
            int second =1;
            int count =0;
           while(count<num){
               System.out.print(first+" ");
               int third = first +second;
               first=second;
               second=third;
               count++;
           }

        }




}