/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eight_queens;

/**
 *
 * @author wangh
 */
public class Eight_queens {

    static int[][] Checkerboard = new int[8][8];
    static int ans;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pushPiece(0);
        System.out.println(ans);
    }

    public static void pushPiece(int n) {

        for (int i = 0; i < 8; i++) {
            if (checkCanPush(n, i) == false) {
                continue;
            }
            Checkerboard[n][i] = 1;
            if (n < 7) {
                pushPiece(n + 1);
            } else {
                for (int k = 0; k < 8; k++) {  // 顯示迷宮圖形
                    for (int j = 0; j < 8; j++) // 顯示座標值
                    {
                        System.out.print(Checkerboard[k][j] + "  ");
                    }
                    System.out.println();
                }

                System.out.println();
                ans += 1;
            }
            Checkerboard[n][i] = 0;
        }

    }

    public static boolean checkCanPush(int x, int y) {
        for (int j = 0; j < x; j++) {
            if (Checkerboard[j][y] == 1) {
                return false;
            }
        }

        int i = 1;
        while (true) {
            if (x - i < 0 || y - i < 0) {
                break;
            }
            if (Checkerboard[x - i][y - i] == 1) {
                return false;
            }
            i++;
        }

        i = 1;
        while (true) {
            if (x - i < 0 || y + i > 7) {
                break;
            }
            if (Checkerboard[x - i][y + i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }
}
