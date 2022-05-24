package com.premiumminds.internship.screenlocking;

import java.util.concurrent.Callable;

public class AllPatterns implements Callable<Integer> {

    private int max;
    private int length;

    /**
     * Main initializer of class
     * @param m Starting point
     * @param n Length of pattern
     */
    public AllPatterns(int m, int n){
        max = m;
        length = n;
    }

    /**
     * Calculates number of paths that can be formed with a starting point and a length
     * @param start Starting point
     * @param length Length of pattern
     * @return number of paths
     */
    public int numberOfPatterns(int start, int length) {
        // Keep a recod of invalid points on the path between two selected points 
        int skip[][] = new int[10][10];
        //In order to point 1 connect to point 3 and vice versa, point 2 must be visited
        skip[1][3] = skip[3][1] = 2;
        //In order to point 1 connect to point 7 and vice versa, point 4 must be visited
        skip[1][7] = skip[7][1] = 4;
        //In order to point 3 connect to point 9 and vice versa, point 6 must be visited
        skip[3][9] = skip[9][3] = 6;
        //In order to point 7 connect to point 9 and vice versa, point 8 must be visited
        skip[7][9] = skip[9][7] = 8;
        //Point 5 must be visited so these points can connetc to each other
        skip[1][9] = skip[9][1] = skip[2][8] = skip[8][2] = skip[3][7] = skip[7][3] = skip[4][6] = skip[6][4] = 5;
        boolean visited[] = new boolean[10];
        return DFS(visited, skip, start, length);
    }

    /**
     * Applies the DFS (Depth-First-Search) algorithm to a starting point with a certain length
     * @param visited boolean array with all the visited points
     * @param skip multidimensional array with the point necessary to be visited in order to connect the two points
     * @param cur current point
     * @param remain remainder of the length we need to go through
     * @return number of possible paths 
     */
    private int DFS(boolean[] visited, int[][] skip, int cur, int remain) {
        // Base case: out of bounds
        if (remain < 1) return 0;
        // max legnth reached
        if (remain == 1) return 1;
        // Mark current point as visited
        visited[cur] = true;
        int res = 0;
  
        for (int i = 1; i <= 9; i++) {
            // Next point must be unvisited
            // AND
            // There is no point between current and next or skip point is already visited
            if (!visited[i] && (skip[cur][i] == 0 || visited[skip[cur][i]])) {
                res += DFS(visited, skip, i, remain-1);
            }
        }
        // Mark the current one unvisited so we can continue to search for other paths
        visited[cur] = false;
        return res;
    }

    @Override
    public Integer call() throws Exception {
        return numberOfPatterns(max, length);
    }

}
