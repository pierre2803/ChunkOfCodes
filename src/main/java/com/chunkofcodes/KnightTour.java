package com.chunkofcodes;

// Knight Tour problem
// https://www.geeksforgeeks.org/?p=12916
public class KnightTour {
    static int N = 5;
    static int xMove[] = {-1,1,-2,2,-2,2,-1,1};
    static int yMove[] = {-2,-2,-1,-1,1,1,2,2};

    public static void main(String args[]) {
        solveKT();
    }

    static boolean solveKT() {
        int sol[][] = new int[N][N];
        /* Initialization of solution matrix */
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;
        sol[0][0]=0;
        // start from 0, explore recursively all solutions
        if(!solveKTutil(0,0,1,sol)){
            System.out.println("No solution found");
            printSolution(sol);
            return false;
        } else {
            System.out.println("Solution found");
            printSolution(sol);
        }
    return true;
    }

    private static void printSolution(int[][] sol) {
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println("");
        }

    }

    static boolean solveKTutil(int currentX, int currentY, int moveCount, int [][] sol) {

        if(moveCount==N*N)
            return true;

        for(int i=0; i<8; i++){
            int nextX = currentX + xMove[i];
            int nextY = currentY + yMove[i];
            if(isSafe(nextX, nextY, sol)){
                sol[nextX][nextY] = moveCount;
                if(solveKTutil(nextX, nextY, moveCount+1,sol))
                    return true;
                else
                    sol[nextX][nextY] = -1; // backtracking !!

            }
        }

        return false;
    }

    private static boolean isSafe(int nextX, int nextY, int [][] sol) {
        return (nextX>=0 && nextX<N &&
                nextY>=0 && nextY<N &&
                sol[nextX][nextY]==-1);
    }

}
