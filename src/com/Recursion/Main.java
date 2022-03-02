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
        aq.offerLast(876);
        aq.offerLast(877);
        aq.offerLast(878);

    }
}
