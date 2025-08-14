package Recursions.lecFile;
import java.util.Arrays;
public class Backtracking {
    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                           {true, true, true},
                           {true, true, true}};
        allPathMaze("",arr,0,0);
        int [][]path = new int[arr.length][arr[0].length];
        printAllPathMaze("",arr,0,0,path,1);
    }
    static void allPathMaze(String p, boolean[][]maze, int r, int c) {
        if (r == maze.length - 1 && c == maze.length - 1) {
            System.out.print(p + " ");
            return;
        }
        if (!maze[r][c]) return;
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allPathMaze(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPathMaze(p + "R", maze, r, c + 1);
        }
        if (r > 0) {
            allPathMaze(p + "U", maze, r - 1, c);
        }
        if (c > 0) {
            allPathMaze(p + "L", maze, r, c - 1);
        }
        maze[r][c] = true;
    }
    static void printAllPathMaze(String p, boolean[][]maze, int r, int c, int[][] pathArray, int step) {
        if (r == maze.length - 1 && c == maze.length - 1) {
                pathArray[r][c] = step;
                for(int[] arr : pathArray) {
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(p);
                System.out.println();
                return;
        }
        if (!maze[r][c]) return;
        maze[r][c] = false;
        pathArray[r][c]=step;
        if (r < maze.length - 1) {
            printAllPathMaze(p + "D", maze, r + 1, c,pathArray,step+1);
        }
        if (c < maze[0].length - 1) {
            printAllPathMaze(p + "R", maze, r, c + 1,pathArray,step+1);
        }
        if (r > 0) {
            printAllPathMaze(p + "U", maze, r - 1, c,pathArray,step+1);
        }
        if (c > 0) {
            printAllPathMaze(p + "L", maze, r, c - 1,pathArray,step+1);
        }
        maze[r][c] = true;
        pathArray[r][c]=0;
    }
}
