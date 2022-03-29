package graphs;

import java.util.ArrayList;
import java.util.List;

public class CountIslands {
	
	static class Direction{
		int row;
		int col;
		
		Direction(int row ,int col){
			this.row = row;
			this.col = col;
		}
	}
	
	static List<Direction> directionsList = new ArrayList<>();
	
	public static int countIslands(int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		
		boolean[][] visited = new boolean[m][n];
		int count = 0;
		for(int row=0;row<m;row++) {
			 
			for(int col=0;col<n;col++) {
				
				if(grid[row][col] == 1 && !visited[row][col]) {
					findConnected(grid,visited,row,col);
					count = count + 1;
				}
				
			}
		}
		
		return count;
	}
	
	public static void findConnected(int[][] grid,boolean[][] visited,int row,int col) {

		if(visited[row][col]) return;
		
		visited[row][col] = true;
		
		for(Direction direction : getNeighbours(row,col,grid)) {
			
			findConnected(grid,visited,direction.row,direction.col);
		}
	}
	
	public static List<Direction> getNeighbours(int row,int col,int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		List<Direction> neighboursList = new ArrayList<>();
		for(Direction direction : directionsList) {
			int newRow = row + direction.row;
		    int newCol = col + direction.col;
		  
		    if((0 <= newRow && newRow < m) && (0 <= newCol && newCol < n) && grid[newRow][newCol] == 1) {
		    	
		    	Direction neighbour = new Direction(newRow,newCol);
		    	neighboursList.add(neighbour);
		    }
		}
		return neighboursList;
	}
	
	public static void main(String args[]) {
		CountIslands ci = new CountIslands();
		int[][] grid = new int[5][5];
		grid[0][0] = 1;
		grid[0][1] = 1;
		grid[1][0] = 1;
		grid[2][0] = 1;
		grid[2][1] = 1;
		
		grid[1][3] = 1;
		
		grid[4][0] = 1;
		
		grid[3][3] = 1;
		grid[4][2] = 1;
		grid[4][3] = 1;
		
		Direction d1 = new Direction(0,1);
		Direction d2 = new Direction(0,-1);
		Direction d3 = new Direction(1,0);
		Direction d4 = new Direction(-1,0);
		directionsList.add(d1);
		directionsList.add(d2);
		directionsList.add(d3);
		directionsList.add(d4);
		
		int count = countIslands(grid);
		System.out.println(count);
		
	}

}
