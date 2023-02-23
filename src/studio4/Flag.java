package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) 
	{
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(.5, .5, 0.5, 0.5);
		StdDraw.setPenColor(41, 110, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.08);
		StdDraw.setPenColor(23, 0, 156);
		StdDraw.filledCircle(0.5, 0.5, 0.08);
		StdDraw.setPenColor(204, 0, 204);
		StdDraw.filledRectangle(0.5, 0.5, 0.01, 0.08);
		StdDraw.setPenColor(0, 204, 204);
		StdDraw.filledRectangle(.5, 0.5, 0.08, 0.01);
		
	}
}