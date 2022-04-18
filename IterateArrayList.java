import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
public class IterateArrayList {
    public static void populateAL(ArrayList<Integer> al) {
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);
        al.add(10);
        al.add(12);
        al.add(14);
        al.add(16);
    }

    public static void printALWithSysout(ArrayList<Integer> al) {
        System.out.println("ArrayList print using sysout(toString();)");
        System.out.println(al);
    }

    public static void printALwithFor(ArrayList<Integer> al) {
        System.out.println("ArrayList Iteration using For Loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    public static void printALwithWhile(ArrayList<Integer> al) {
        System.out.println("\nArrayList Iteration using While Loop");
        int limit = 0;
        while (al.size() > limit) {
            System.out.print(al.get(limit) + " ");
            limit++;
        }
    }

    public static void printALwithAdvanceFor(ArrayList<Integer> al) {
        System.out.println("\nArrayList Iteration using Advance For Loop");
        for (Integer i : al) {
            System.out.print(i + " ");
        }
    }
    
    public static void printALusingIterator(ArrayList<Integer> al) {
        Iterator<Integer> itr = al.iterator();
        System.out.println("\nArrayList Iteration using Iterator (hasNext();)");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void printALusingScanner(ArrayList<Integer> al) {
        System.out.println("\nArrayList Iteration using Scanner (hasNext();)");
        Scanner sc = new Scanner(al.toString());
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println();
        populateAL(al);
        printALWithSysout(al);
        printALwithFor(al);
        printALwithWhile(al);
        printALwithAdvanceFor(al);
        printALusingIterator(al);
        printALusingScanner(al);
    }
}