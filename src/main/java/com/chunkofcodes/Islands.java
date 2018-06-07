package com.chunkofcodes;

public class Islands {

    public static void main(String args[]){
        // 1 1 0
        // 0 0 1
        // 1 0 1
        // Result: 2 islands
        int n=3, m=3;
        int[] A = {1, 1, 0, 0, 0, 1, 1, 0, 1};
        System.out.println(findNumberIslands(A,3,3));

        // 0 0 0
        // 0 0 0
        // 0 0 1
        // Result: 1 island
        A = new int []{0, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(findNumberIslands(A,n,m));

        // 1 0 1
        // 0 0 0
        // 1 0 1
        // Result: 4 islands
        A = new int []{1, 0, 1, 0, 0, 0, 1, 0, 1};
        System.out.println(findNumberIslands(A,n,m));

        // 1 1 1
        // 1 1 1
        // 1 1 1
        // Result: 1 island
        A = new int []{1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(findNumberIslands(A,n,m));

    }

    private static int findNumberIslands(int[] A, int n, int m) {

        int count=0;

        for(int i=0; i<A.length; i++){
            if(A[i]==1 && !hasPreviousNeighborsPartOfIsland(A, n, m, i)){
                count++;
            }
        }

        return count;
    }

    private static boolean hasPreviousNeighborsPartOfIsland(int[] a, int n, int m, int index) {

        // find the previous neighbors (there r 4)
        // case 1 up left
        int n0 = getN(n,index)-1;
        int m0 = getM(n,index)-1;
        int index0 = n0 + m0*n;
        if(n0>=0 && n0<n && m0>=0 && m0<m && a[index0]==1){
            return true;
        }
        // case 2 up center
        n0 = getN(n,index);
        m0 = getM(n,index)-1;
        index0 = n0 + m0*n;
        if(n0>=0 && n0<n && m0>=0 && m0<m && a[index0]==1){
            return true;
        }
        // case 3 up right
        n0 = getN(n,index)+1;
        m0 = getM(n,index)-1;
        index0 = n0 + m0*n;
        if(n0>=0 && n0<n && m0>=0 && m0<m && a[index0]==1){
            return true;
        }
        // case 4 left
        n0 = getN(n,index)-1;
        m0 = getM(n,index);
        index0 = n0 + m0*n;
        if(n0>=0 && n0<n && m0>=0 && m0<m && a[index0]==1){
            return true;
        }
        return false;
    }

    private static int getN(int n, int index){
        return index%n;
    }

    private static int getM(int n, int index){
        return index/n;
    }

}
