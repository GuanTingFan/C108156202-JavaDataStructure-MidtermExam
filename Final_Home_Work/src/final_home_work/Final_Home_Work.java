/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_home_work;

import java.util.Stack;

/**
 *
 * @author wangh
 */
public class Final_Home_Work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 說明 - 舊有的專案沒有找到適合做更改的，有關於堆疊與柱列以及遞迴在高中的時候已經熟悉過了 所以如果需要使用的通常我已經做使用了
        // 附上用堆疊與遞迴寫的四則運算

        String formula = "(3+(9/3*(2+2)))*(2-(4*3))*(4+3)+3*(6-2)/(4-2/(2-1)*(4-3))";

        formula = formula.replace("+", " + ");
        formula = formula.replace("-", " - ");
        formula = formula.replace("*", " * ");
        formula = formula.replace("/", " / ");
        formula = formula.replace("(", "( ");
        formula = formula.replace(")", " )");

        System.out.println(formu(formula));
    }

    public static Integer formu(String formula) {

        Stack<String> stack = new Stack<String>();
        boolean tfbreak = false;
        int n1 = 0, n2 = 0, sum = 0, n = -1;
        String sign = "", st = "";
        while (true) {
            stack.clear();
            String[] arr = formula.split(" ");
            if (arr.length == 1) {
                sum = Integer.parseInt(formula);
                break;
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                stack.push(arr[i]);
            }
            formula = "";
            if ((stack.indexOf("/") > -1 || stack.indexOf("*") > -1)) {
                while (stack.isEmpty() == false) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        st = "";
                        n = 0;
                        while (true) {
                            if (stack.peek().equals("(")) {
                                n = n + 1;
                            } else if (stack.peek().equals(")")) {
                                n = n - 1;
                            }
                            if (n == -1) {
                                stack.pop();
                                break;
                            }
                            st = st + stack.pop() + " ";
                        }
                        n1 = formu(st);
                    } else {
                        n1 = Integer.parseInt(stack.pop());
                    }
                    if (stack.isEmpty()) {
                        formula = formula + String.valueOf(n1);
                        break;
                    }
                    sign = stack.pop();
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        st = "";
                        n = 0;
                        while (true) {
                            if (stack.peek().equals("(")) {
                                n = n + 1;
                            } else if (stack.peek().equals(")")) {
                                n = n - 1;
                            }
                            if (n == -1) {
                                stack.pop();
                                break;
                            }
                            st = st + stack.pop() + " ";
                        }
                        n2 = formu(st);
                    } else {
                        n2 = Integer.parseInt(stack.pop());
                    }
                    if (sign.equals("+") || sign.equals("-")) {
                        stack.push(String.valueOf(n2));
                        formula = formula + String.valueOf(n1) + " " + sign + " ";
                    } else {
                        if (sign.equals("*")) {
                            n1 = n1 * n2;
                        } else {
                            n1 = n1 / n2;
                        }
                        while (stack.isEmpty() == false && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                            sign = stack.pop();
                            if (stack.peek().equals("(")) {
                                stack.pop();
                                st = "";
                                n = 0;
                                while (true) {
                                    if (stack.peek().equals("(")) {
                                        n = n + 1;
                                    } else if (stack.peek().equals(")")) {
                                        n = n - 1;
                                    }
                                    if (n == -1) {
                                        stack.pop();
                                        break;
                                    }
                                    st = st + stack.pop() + " ";
                                }
                                n2 = formu(st);
                            } else {
                                n2 = Integer.parseInt(stack.pop());
                            }
                            if (sign.equals("*")) {
                                n1 = n1 * n2;
                            } else {
                                n1 = n1 / n2;
                            }
                        }
                        if (stack.isEmpty()) {
                            formula = formula + String.valueOf(n1);
                        } else {
                            sign = stack.pop();
                            formula = formula + String.valueOf(n1) + " " + sign + " ";
                        }
                    }
                }
            }
            if (stack.isEmpty() == false) {
                sum = Integer.parseInt(stack.pop());
            }
            while (stack.isEmpty() == false) {

                sign = stack.pop();
                n2 = Integer.parseInt(stack.pop());
                if (sign.equals("+")) {
                    sum = sum + n2;
                } else {
                    sum = sum - n2;
                }
                tfbreak = true;
            }
            if (tfbreak) {
                break;
            }
        }
        return sum;
    }

}
