package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        // while loops

        boolean whileCondition = false;
        while (whileCondition) {
            System.out.println(" Our while condition is true. Adding one to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("Our count is at 3");
                whileCondition = false;
            }


//do while

            int count = 0;
            // while loops

            boolean whileCondition = false;
            do
                (whileCondition) {
                        System.out.println(" Our while condition is true. Adding one to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("Our count is at 3");
                whileCondition = false


            }
    }while (whileCondition) ;


// for loops
            int i = 0;

            for (int 1 = 0; i <= 5 ;
            i++){
                System.out.println(i);
            }
//





            //foreach loop
            Arraylist<String> fruit = new ArrayList<String>();
            fruit.add("Bannana");
            fruit.add("apple");

            for(String food : fruit){
                if(food.contains("b"))|| food.contains(("B")){
                    System.out.println(food);
                }
            }
        }
    }