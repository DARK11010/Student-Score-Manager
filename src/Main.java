
import java.util.Scanner;

import static java.lang.Character.*;
import static java.lang.Math.*;



public class Main {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {








    


















        int num_of_student, num_of_subjects;


        System.out.print("Enter the number of students: ");

        //num_of_student = 2;
        num_of_student = read.nextInt();

        System.out.print("Enter the number of subjects: ");
        //num_of_subjects = 2;
        num_of_subjects = read.nextInt();

        String[] names = new String[num_of_student];

        int[][] grades = new int[num_of_student][num_of_subjects];

        int [] avrege = new int[grades.length];

        //String[] header = new String[grades.length + 1];



        input(names, grades);

        avg(grades, avrege);

        display(names, grades,avrege);


        System.out.println("\n after sorting \n");

        sorting(avrege,grades,names);

        display(names, grades,avrege);



        System.out.println("\nTop Performer: "+ names[0]);











    }












    public static void input(String[] name, int[][] grade)  {

        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter the name of student: ");

           // name[i] = "3r3r";

            name[i] = read.next();

            System.out.printf("Enter the scores for %s (separated by spaces): ", name[i]);

            for (int j = 0; j < grade[i].length; j++) {

                //grade[i][j] = 5;

                 grade[i][j] = read.nextInt();


            }

        }

    }


    public static void display(String[] name, int[][] grade, int[] avgs) {


        for (int i = 0; i <= grade[0].length ; i++) {

            if (i == 0)
                System.out.print("\nnames");
            else
                System.out.print("    subject" + i);

        }
        System.out.print("    avarge");


        for (int i = 0; i < name.length; i++) {


            System.out.print("\n" + name[i] + "        ");


            for (int j = 0; j < grade[i].length; j++) {
                System.out.print(grade[i][j] + "            ");

            }



                System.out.print(" "+avgs[i]);




        }

    }


    public static void avg(int[][] score, int [] avgs ) {

        for (int i = 0; i < score.length; i++) {

            int sum = 0;

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j] ;

            }
            avgs[i] = sum/ score[i].length;

        }

    }


    public static void printer(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            System.out.print("\n" + arr[i] + " ");

        }
    }
//        z = x;
//
//        x = y;
//
//        y = z;

    public static void sorting(int[] avrg , int score[][], String[] names){


        int [] temp = new int[avrg.length];
        String[] tempS= new String[names.length];


        for (int p = 0; p < score[0].length; p++) {


            for (int i = 0; i < avrg.length - 1; i++) {


                if (avrg[i] < avrg[i + 1]) {

                    for (int j = 0; j < score[i].length; j++) {

                        temp[i] = score[i][j];

                        score[i][j] = score[i + 1][j];

                        score[i + 1][j] = temp[i];

                    }







                    tempS[i] = names[i];


                    names[i] = names[i + 1];

                    names[i + 1] = tempS[i];


                    temp[i] = avrg[i];

                    avrg[i] = avrg[i + 1];

                    avrg[i + 1] = temp[i];

                }


            }



            int tempv;



                for (int i = 0; i < score.length; i++) {

                    for (int j = 0; j < score[i].length - 1; j++) {

                        if (score[i][j] < score[i][j + 1]) {
                            tempv = score[i][j];

                            score[i][j] = score[i][j + 1];

                            score[i][j + 1] = tempv;

                        }


                    }

                }



        }
    }





}



