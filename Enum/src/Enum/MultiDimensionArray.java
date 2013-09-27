package Enum;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int X = 3;
		final int Y = 3;
		final int Z =3;
		
		//initialize
		int magicCubic[][][] = new int [X][Y][Z];
		
		int count=0;
		
		for (int x=0; x<magicCubic.length; x++ )
			for (int y=0; x<magicCubic[X-1].length; y++ )
				for (int z=0; x<magicCubic[X-1][Y-1].length; z++ ){
					count++;
					magicCubic[x][y][z] = count;// puts data 1 in "cube" 1 @ (0,0,0)
				}
		
		//print out\
		for (int x=0; x<magicCubic.length; x++ )
			for (int y=0; x<magicCubic[X-1].length; y++ )
				for (int z=0; x<magicCubic[X-1][Y-1].length; z++ )
		System.out.println("magicCubic[" + x + "][" +y+ "][" +z+ "]" + magicCubic);
		
		
	}

}
