package hackerrank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import hackerrank.MyLL.Node;
 


public class Solution {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int t=sc.nextInt();
        int[] result=new int[s];
        MyLL<Integer> ls=new MyLL<Integer>();
        for(int i=0;i<n;i++){
        	ls.add(sc.nextInt());
        }
        int time=0;
        int currentslot=0;
        int nxt=0;
    for(int i=0;i<s;i++){
    	time=0;
    	MyLL<Integer> ls2=new MyLL<Integer>();
    	ls2=(MyLL<Integer>) ls.clone();
    	Iterator<Integer> itr=ls2.iterator();
    	Node<Integer> lastnode=ls2.last;
    	ls2.last.next=ls2.first;
    	ls2.first.prev=ls2.last;
    	currentslot=i;
    	while(itr.hasNext() ){
    			nxt=(int) itr.next();
    			
    		if(currentslot==nxt){
    			itr.remove();
    			time=time+t;
				currentslot=(currentslot+t)%s;
    		}
    		else if(currentslot<nxt){
    			time=time+nxt-currentslot;
    					currentslot=nxt;
    				itr.remove();
    				time=time+t;
    				currentslot=(currentslot+t)%n;
    		}
    		else if(currentslot>nxt){
    			if(currentslot>lastnode.item){
    				time=time+s-lastnode.item;
    				currentslot=0;
    				itr=ls2.iterator();
    			}
    		}
    	}
    	
    	result[i]=time;
    }
    for(int i=0;i<s;i++){
    	 System.out.println(result[i]);    }
        }
}