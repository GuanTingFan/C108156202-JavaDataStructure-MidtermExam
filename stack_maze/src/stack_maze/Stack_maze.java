/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_maze;

import java.util.Stack;

/**
 *
 * @author wangh
 */
public class Stack_maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] Maze = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        Stack<int[]> Canwalk = new Stack<int[]>();
        Canwalk.push(new int[]{1, 1});
        WalkMaze(Canwalk, Maze);
    }

    public static void WalkMaze(Stack<int[]> Canwalk, int[][] Maze) {
        int[] nl = Canwalk.peek();
        Maze[nl[0]][nl[1]] = 2;

        if (Canwalk.peek()[0] == 8 && Canwalk.peek()[1] == 10) {

            for (int i = 0; i <= 9; i++) {  // 顯示迷宮圖形
                for (int j = 0; j <= 11; j++) // 顯示座標值
                {
                    System.out.print(Maze[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        //如果左方可走
        if (Maze[nl[0]][nl[1] - 1] == 0) {
            Canwalk.push(new int[]{nl[0], nl[1] - 1});
            WalkMaze(Canwalk, Maze);
        }

        //如果右方可走
        if (Maze[nl[0]][nl[1] + 1] == 0) {
            Canwalk.push(new int[]{nl[0], nl[1] + 1});
            WalkMaze(Canwalk, Maze);
        }

        //如果上方可走
        if (Maze[nl[0] - 1][nl[1]] == 0) {
            Canwalk.push(new int[]{nl[0] - 1, nl[1]});
            WalkMaze(Canwalk, Maze);
        }

        //如果下方可走
        if (Maze[nl[0] + 1][nl[1]] == 0) {
            Canwalk.push(new int[]{nl[0] + 1, nl[1]});
            WalkMaze(Canwalk, Maze);
        }

        Maze[nl[0]][nl[1]] = 0;
    }

}
