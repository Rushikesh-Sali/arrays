package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        aarrays a1=new aarrays();
        System.out.println("----------MENU------------");
        int ch;
        do { System.out.println("1: Insert array\n2: Print array\n3: Insert an element at given location\n4: Delete an element at given location\n5: sort the given array\n6: search a given element in the array\n7: reverse the array\n8: exit");
        System.out.println("enter your choice");
        Scanner scan=new Scanner(System.in);
        ch=scan.nextInt();

            switch (ch) {
                case 1:
                    a1.get_data();
                    break;
                case 2:
                    a1.put_data();
                    break;
                case 3:
                    a1.insert();
                    break;
                case 4:
                    a1.delete();
                    break;
                case 5:
                    a1.sort();
                    break;
                case 6:
                    a1.search();
                    break;
                case 7:
                    a1.reverse();
                    break;
                case 8:break;
                default:
                    System.out.println("invalid choice");
            }

        }while(ch!=8);


    }
}
