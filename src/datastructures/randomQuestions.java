/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Aditya
 */
public class randomQuestions {

    MyStack<Integer> result = new MyStack<Integer>();

    public void numberReading() {
        Integer number = 233334558;
        Integer prevNum = number % 10;
        number = number / 10;
        int count = 1;
        while (number != 0) {
            Integer currNum = number % 10;
            if (currNum != prevNum) {
                result.push(prevNum);
                result.push(count);
                count = 1;
//                System.out.println(prevNum+" = " + count);
            } else {
                count++;
            }
            prevNum = currNum;
            number = number / 10;
        }
        result.push(prevNum);
        result.push(count);
        while (!result.isEmpty()) {
            System.out.print(result.pop());
        }
        System.out.println();
    }
}
