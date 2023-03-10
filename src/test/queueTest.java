package test;/*
 * @Date:2023/2/8-21:48
 * @Description:
 * @Param:
 */

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;
import queue.ArrayQueue;

import java.sql.Struct;
import java.util.Scanner;

public class queueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        Boolean loop = true;
        String key;
        Scanner scanner = new Scanner(System.in);
        while (loop){
            System.out.println("输入l,展示队列");
            System.out.println("输入a,入队");
            System.out.println("输入g,出队");
            System.out.println("输入h,获取队头元素");
            System.out.println("输入e,退出程序");
            key = scanner.next();
            switch (key.charAt(0)){
                case 'l':
                    arrayQueue.ls();
                    break;
                case 'a':
                    System.out.println("输入入队元素");
                    int insert = scanner.nextInt();
                    arrayQueue.addQueue(insert);
                    arrayQueue.ls();
                    break;
                case 'g':
                    arrayQueue.getQueue();
                    arrayQueue.ls();
                    break;
                case 'h':
                    arrayQueue.headQueue();
                    arrayQueue.ls();
                    break;
                case 'e':
                    System.out.println("即将退出程序");
                    loop = false;
                    break;
            }
        }
    }
    @Test
    public void test(){

        String s1 = "()";
        String s2 = "[]";
        String s3 = "(]";
        String s4 = "{[]}";
        class Solution {
            public boolean isValid(String s) {
                for (int i = 0; i < s.length()-1; i++) {
                    String key = String.valueOf(s.charAt(i));
                    switch (key){
                        case "(":
                            if (s.charAt(i+1)==")".charAt(0)){
                                return true;
                            }
                            else return false;
                        case "[":
                            if (s.charAt(i+1)=="]".charAt(0)){
                                return true;
                            }
                            else return false;
                        case "{":
                            if (s.charAt(i+1)=="}".charAt(0)){
                                return true;
                            }
                            else return false;
                    }

            }
                return false;
        }
        }
        Solution solution = new Solution();
        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
        System.out.println(solution.isValid(s4));
    }


}
