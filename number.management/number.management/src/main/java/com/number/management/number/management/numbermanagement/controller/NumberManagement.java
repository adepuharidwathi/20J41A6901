package com.number.management.number.management.numbermanagement.controller;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NumberManagement {
	
	@RequestMapping("/hello")
	public String helloworld() {
	return "hello world";
	}
	
	@RequestMapping("/primenumbers")
	public String primenumbers() {
		ArrayList<Integer> listOfPrimes= new ArrayList<Integer>();
		int N = 100;
        for(int i=1; i<=N; i++){
            if(isPrime(i)) {
            	listOfPrimes.add(i);
                }    
	}
       
        return listOfPrimes.toString();
	}
            
           private boolean isPrime(int n){
                if(n==1||n==0)return false;
                for(int i=2; i<n; i++){
                      if(n%i==0)return false;
                }
                return true;
          }
           
           @RequestMapping("/oddnumbers")
       	public String oddnumbers() {
       		ArrayList<Integer> listOfOdd= new ArrayList<Integer>();
       		int N = 100;
               for(int i=1; i<=N; i++){
                   if(i%2!=0) {
                   	listOfOdd.add(i);
                       }       
       	} 
               return listOfOdd.toString();
           	}
           
           @RequestMapping("/fibnumbers")
          	public String fibnumbers() {
          		ArrayList<Integer> listOfFibonacci= new ArrayList<Integer>();
          		int N = 10;
          		int a=0;
          		int b =1,c;
          		listOfFibonacci.add(a);
          		listOfFibonacci.add(b);
                  for(int i=1; i<=N; i++){
                    	c=a+b;
                    	a=b;
                    	b=c;
                      	listOfFibonacci.add(c);
                          }       
                  return listOfFibonacci.toString();
              	}

}
