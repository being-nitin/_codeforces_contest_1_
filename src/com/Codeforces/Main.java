package com.Codeforces;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	  Much Xor
      Time Limit: 1.5 sec
      Memory Limit: 128000 kB
      Problem Statement
      You are given Q queries. In each query, determine whether there exists an array A of size N such that:

      1. All the elements are positive integers.
      2. The number of subarrays such that their XOR-sum is 0 is exactly K. In other words,
      there are exactly K pairs of integers (l, r) such that 1 ≤ l ≤ r ≤ N and Al ⊕ Al+1 ⊕ ... Ar = 0.

      If there exists such an array, print "YES", otherwise print "NO".
      Input
      The first line of the input contains a single integer Q — the number of queries (1 ≤ Q ≤ 105).
      Q lines follow, each line containing two space separated integers N (1 ≤ N ≤ 1000) and K (0 ≤ K ≤ N(N+1)/2).
      Output
      For each test case, print "YES", if there exists such an array, otherwise print "NO" (without the quotes).

      Note that the output is case sensitive.
      Example
      Sample Input
      3
      2 2
      3 2
      2 1
      Sample Output
      NO
      YES
      YES
	 */
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     for(int i=0;i<t;i++){
         int n = sc.nextInt();
         int m = sc.nextInt();
         muchXor(n,m);
     }
    }
    public static void muchXor(int n,int m){
        if((n^m)==0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
