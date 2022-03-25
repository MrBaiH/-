package com.栈.括号匹配问题;

import com.栈.Stack;

/**
 * @Author baixu
 * @Date 2022/3/23 0023 15:43
 * Version 1.0
 * @Description :
 */
public class ParenthesisMatching {
    private static boolean matching(String str){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String current = str.charAt(i)+"";
            if(current.equals("(")){
                stack.push("(");
            }else if(current.equals(")")){
                String pop = stack.pop();
                if(pop==null){
                    return false;
                }
            }
        }

        if(stack.length()!=0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(matching("(1+2)*7==21?(e2:)L()"));
    }
}
