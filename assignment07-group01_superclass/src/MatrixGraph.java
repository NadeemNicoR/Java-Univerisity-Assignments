import java.util.List;
import java.util.LinkedList;

public class MatrixGraph {
	public int inDegree(int vertex, int[][] edge) 
	{
		{
			int row=0;
			int col=0;
			int count=0;
			for(row=0;row<edge.length;row++)
			{
				for(col=0;col<edge.length;col++)
				{
					if(col==vertex)
					{
						if(edge[row][col]==1)
						{
							System.out.println("edge moving towards vertex "+col+" from vertex "+ row);
							count ++;
						}
					}
				}
			}
			return count;
		}
	}

	public int outDegree(int vertex, int[][] edge) 
	{
		int row=0;
		int col=0;
		int count=0;
		for(row=0;row<edge.length;row++)
		{
			if(row==vertex)
			{
				for(col=0;col<edge.length;col++)
				{

					if(edge[row][col]==1)
					{
						System.out.println("edge moving away from vertex "+row+" towards vertex "+col);
						count ++;
					}
				}
			}
		}
		return count;
	}

	public List<Integer> adjacent(int vertex, int[][] edge) 
	{
		int row;
		int col;
		List<Integer>li=new LinkedList<Integer>();
		for(row=0;row<edge.length;row++)
		{
			if(row==vertex)
			{
				for(col=0;col<edge.length;col++)
				{
					if(edge[row][col]==1)
					{
						li.add(col);
					}
				}
			}
		}
		return li;
	}
}
