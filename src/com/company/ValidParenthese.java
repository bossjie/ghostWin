package com.company;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthese {
    private HashMap<Character,Character> mappings;

    public ValidParenthese(){ //利用构造函数初始化mapping
        this.mappings = new HashMap<Character, Character>(){};
        this.mappings.put(']','[');
        this.mappings.put(')','(');
        this.mappings.put('}','{');
    }

    public static void main(String[] args) {
        ValidParenthese t = new ValidParenthese();
        System.out.println(t.fun("[]{}()"));
    }

    public boolean fun(String str){
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);
            if(mappings.containsKey(temp)){ //如果是右括号,pop,检查
                Character topElement = stack.isEmpty()?'#':stack.pop(); //为空时用#代替
                if(topElement != mappings.get(temp)) return false; //对比
            }else{
                stack.push(temp); //左括号一律push
            }
        }
        return stack.isEmpty(); //最后全部匹配,stack应为空
    }

}
