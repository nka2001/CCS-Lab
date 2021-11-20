/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11_problemssolutions;

/**
 *
 * Solve problem 03:
 * We can easily verify that none of the entries in the first seven rows of Pascal's triangle are divisible by 7:

 	 	 	 	 	 	 1
 	 	 	 	 	 1	 	 1
 	 	 	 	 1	 	 2	 	 1
 	 	 	 1	 	 3	 	 3	 	 1
 	 	 1	 	 4	 	 6	 	 4	 	 1
 	 1	 	 5	 	10	 	10	 	 5	 	 1
1	 	 6	 	15	 	20	 	15	 	 6	 	 1
However, if we check the first one hundred rows, we will find that only 2361 of the 5050 entries are not divisible by 7.

Find the number of entries which are not divisible by 7 in the first one billion (109) rows of Pascal's triangle.
* 
 */
public class Problem03 {
    
    public Problem03(){
        
    }
    
    public void doStuff(int r){
        int numEntries = 0;
        
        for(int i = 0; i < r; i++){
            long k = 1;
            
            
            for(int j = 0; j <= i; j++){
                System.out.print(k + " ");
                k = k * (i - j) / (j + 1);
                
                if(k % 7 != 0){
                    numEntries++;
                }
            }
            System.out.println();
        }
        System.out.println("The number of entires not divisble by 7 are: " + numEntries);
    }

    
    }