package com.company;

import java.util.Scanner;

public class aarrays{
     int marsh[]=new int [20];
     int N;
    Scanner scan = new Scanner(System.in);
    public void get_data(){
        System.out.println("enter the number of elements in the array");

        N = scan.nextInt();
        int i=0;
        System.out.println("enter the elements of the array");
        for(i=0;i<N;i++){
            marsh[i]=scan.nextInt();
        }

    }
    public void put_data(){
        System.out.println("the element of the array are:");
        for(int i=0;i<N;i++){
            System.out.print(marsh[i]+" ");

        }System.out.println("\n");
    }
    public void insert(){
        System.out.println("the location at which the element is to be inserted");
        int k=scan.nextInt();
        System.out.println("enter the element to be inserted at "+ k + " location");
        k=k-1;
        int P=scan.nextInt();
        for(int i=N;i>=k;i--) {
            marsh[i + 1] = marsh[i];
        }
        marsh[k]=P;
        N=N+1;
    }
    public void delete(){
        System.out.println("enter the location of the element to be deleted");
        int k=scan.nextInt()-1;
        int D=marsh[k];
        for(int i=k;i<N-1;i++){
            marsh[i]=marsh[i+1];
        }
        N=N-1;

    }
    public void insertionsort(){

        int j,i,key;
        for(j=1;j<N;++j){
            key=marsh[j];
            i=j-1;
            while(i>=0 && marsh[i]>key){
                marsh[i+1]=marsh[i];
                i--;
            }
            marsh[i+1]=key;
        }

    }
    public void search() {
        System.out.println("enter the element to be searched in the given array");
        int sch = scan.nextInt();
        int z=0;
        for (int j = 0; j < N; j++) {
            if (sch == marsh[j]) {

                    z = j;

            }

        }

            System.out.println("element found at location "+ z);

    }
    public void reverse(){
        System.out.println("the reverse of the given array is");
        for(int i=N-1;i>=0;i--){
            System.out.print(marsh[i]+" ");
        }

    }
}
