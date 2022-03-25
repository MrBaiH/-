package com.栈.逆波兰表达式;

import com.栈.StackPlus;

/**
 * @Author baixu
 * @Date 2022/3/23 0023 16:35
 * Version 1.0
 * @Description :
 */
public class PolishNotation {
    private static Integer getResult(String [] str){
        StackPlus<Integer> stack = new StackPlus<>();
        Integer o1;
        Integer o2;
        Integer result;
        for (int i = 0; i < str.length; i++) {
            switch (str[i]){
                case "+":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o1+o2;
                    stack.push(result);
                    break;
                case "-":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2-o1;
                    stack.push(result);
                    break;
                case "*":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o1*o2;
                    stack.push(result);
                    break;
                case "/":
                    o1 = stack.pop();
                    o2 = stack.pop();
                    result = o2/o1;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(str[i]));
            }
        }
        result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String strs [] = {"3","17","15","-","*","18","6","/","+"};
        System.out.println(getResult(strs));
    }
}
