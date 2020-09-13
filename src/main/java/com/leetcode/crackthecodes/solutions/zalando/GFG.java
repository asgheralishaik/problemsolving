package com.leetcode.crackthecodes.solutions.zalando;// Java implementation of the approach

import java.io.*; 

class GFG { 

// Returns factorial 
// of the number 
static int fact(int n) 
{
	if(n<=0) return 1;
	int fact = 1; 
	for (int i = 2; i <= n; i++) 
		fact *= i; 
	return fact; 
} 

// Function to calculate ncr 
static int ncr(int n, int r) 
{
	int fact = fact(r);
	int ncr=1;
	if(fact>=1){
		 ncr = fact(n) / (fact * fact(n - r));
	}


	return ncr; 
} 

// Function to calculate 
// the total possible ways 
static int ways(int m, int w, int n, int k) 
{ 

	int ans = 0; 
	while (m >= k) { 
		ans += ncr(m, k) * ncr(w, n - k); 
		k += 1; 
	} 

	return ans;
} 

// Driver code 
	public static void main (String[] args) { 
		
	int m, w, n, k; 
	m = 65;
	w = 35;
	n = 3;
	k = 1;
	System.out.println( ways(m, w, n, k)); 
	} 
} 
