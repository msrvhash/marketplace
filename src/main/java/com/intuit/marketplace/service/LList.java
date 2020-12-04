package com.intuit.marketplace.service;

import com.intuit.marketplace.dto.ProjectDTO;

public class LList {

    public static void main(String[] args) {

        LNode head=getList(new int[]{1,2,3,4});
ProjectService ps=new ProjectService();
ProjectDTO p=ps.getProjectById("");

    }

      static  LNode head;


    public static LNode getList(int[] arr) {

        head=new LNode();
        head.val=arr[0];
        LNode dummy=head;



        for(int i=1;i<arr.length;i++) {
            dummy.next=new LNode();
            dummy.next.val=arr[i];
            dummy=dummy.next;
        }
        printList(head);
        return head;
    }

    public static void printList(LNode head) {
        LNode dummy=head;
        while(dummy!=null) {
            System.out.println(dummy.val);
            dummy=dummy.next;
        }
    }

    public static class LNode {
        int val;
        LNode next;
        public LNode() {
        }
    }
}
