/**
 * 
 */
package com.leetcode.firstweek;

/**
 * 
 */
class ListNode
{
int val;
ListNode next;

public ListNode() {
		this.val=0;
		this.next=null;	
}

public ListNode(int x) {
	this.val=x;
	this.next=null;
}


public ListNode(int x,ListNode next) {
	this.val=x;
	this.next=next;
}

}
class Solution{
	public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		int carry=0;
		while(l1!=null || l2 != null || carry !=0) {
			int digit1 = (l1!=null)?l1.val:0;
			int digit2 = (l2!=null)?l2.val:0;
			
			int sum=digit1+digit2+carry;
			int digit=sum%10;
			carry=sum/10;
			
			ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

			
			l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
			
		}
		ListNode result=dummy.next;
		dummy.next=null;
		return result;
	}
}
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ListNode l3=new ListNode(3);
		ListNode l2=new ListNode(4,l3);
		ListNode l1=new ListNode(2,l2);
		ListNode l6=new ListNode(4);
		ListNode l5=new ListNode(6,l6);
		ListNode l4=new ListNode(5,l5);
		Solution sol=new Solution();
		ListNode result = sol.addTwoNumbers(l1, l4);
		while(result!= null) {
			System.out.print(result.val+",");
			result=(result.next!=null)?result.next:null;
		}
		

	}

}
