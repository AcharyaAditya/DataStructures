/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Hashtable;

/**
 *
 * @author Aditya
 */
public class MapNumbersUsingQueue {

    MyQueue<String> firstQ;
    MyQueue<String> secondQ;
    int number;

    public MapNumbersUsingQueue(int number) {
        this.number = number;
        firstQ = new MyQueue<>();
        secondQ = new MyQueue<>();
        int firsttwo = 0;
        while (firsttwo < 2) {
            int temp = this.number % 10;
            String hashValues = getValues(temp);
            if (firsttwo == 0) {
                fillQueues(hashValues, firstQ);
            } else {
                fillQueues(hashValues, secondQ);
            }
            this.number = this.number / 10;

            firsttwo++;
        }
    }

    public void combine() {
        combine(firstQ, secondQ);
    }

    public boolean combine(MyQueue<String> q1, MyQueue<String> q2) {
        MyQueue<String> q3 = new MyQueue<>();
        for (int i = 0; i < q1.getSize(); i++) {
            String tmp1 = q1.dequeue();
            for (int j = 0; j < q2.getSize(); j++) {
                String tmp2 = q2.dequeue();
                if (number == 0) {
                    System.out.println(tmp1 + tmp2);
                }
                q3.enqueue(tmp1 + tmp2);
                q2.enqueue(tmp2);
            }
            q1.enqueue(tmp1);
        }
        if (number != 0) {
            int temp = number % 10;
            String hashValues = getValues(temp);
            number = number / 10;
            fillQueues(hashValues, secondQ);
            combine(q3, secondQ);
        }
        return true;
    }

    private void fillQueues(String hashValues, MyQueue<String> toFill) {
        toFill.clear();
        for (int counter = 0; counter < hashValues.length(); counter++) {
            String s = toString(hashValues.charAt(counter));
            toFill.enqueue(s);
        }
    }

    private String getValues(int key) {
        Hashtable ht = new Hashtable();
        ht.put(1, "");
        ht.put(2, "abc");
        ht.put(3, "def");
        ht.put(4, "ghi");
        ht.put(5, "jkl");
        ht.put(6, "mno");
        ht.put(7, "pqrs");
        ht.put(8, "tuv");
        ht.put(9, "wxyz");
        ht.put(10, "");
        return (String) ht.get(key);
    }

    public String toString(char c) {
        return "" + c;
    }

}
