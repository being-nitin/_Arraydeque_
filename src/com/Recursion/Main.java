package com.Recursion;
import java.util.ArrayDeque;
public class Main {

    public static void main(String[] args) {
	/*
	It is an special type of data structure in which insertion and deletion can be
	done from both the end , and you can peek the element from both the side.
	 */
        ArrayDeque <Integer> aq = new ArrayDeque<>();

        // offerFirst method will add the element at first place.

        aq.offerFirst(7887);
        aq.offerFirst(7882);
        aq.offerFirst(7881);
        aq.offerFirst(7883);

        // offerLast method will add the element at last place.
        aq.offerLast(876);
        aq.offerLast(877);
        aq.offerLast(878);

        // similarly you can use for peek.

        System.out.println(aq.peek());

        // you can use first and last for peek too.

        System.out.println(aq.peekFirst());


    }
}
