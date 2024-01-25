import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Enter row size
		int m = sc.nextInt();
		//Enter row column
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];
		//elements in array
		for(int i=0; i<=m; i++)
		{
			for(int j=0; j<=n; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		//variables
		System.out.println("The Spiral order is:");
		int rowStart = 0;
		int rowEnd = m-1;
		int colStart = 0;
		int colEnd = n-1;
		//condition for spiral order
		while(rowStart <= rowEnd && colStart <= colEnd)
		{
			for(int col=colStart; col<=colEnd ;col++)
			{
				System.out.print(matrix[rowStart][col] + ' ');
			}
		    rowStart++;
		    for(int row=rowStart; row<=rowEnd; row++)
		    {
		    	System.out.print(matrix[row][colEnd] + ' ');
		    }
		    colEnd--;
		    for(int col=colEnd; col>=colStart; col--)
		    {
		    	System.out.print(matrix[rowEnd][col]);
		    }
		    rowEnd--;
		    for(int row=rowEnd; row>=rowStart; row--)
		    {
		    	System.out.print(matrix[row][colStart] + ' ');
		    }
		    colStart++;
		    
		    System.out.println();
		}
	}

}
