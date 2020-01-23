/**Assignment: LabBuilding
	Program: Building
	Programmer: Rafael Silva
	Created: September 9, 2019
*/
package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int y = 40;
		
		g.setColor(Color.GRAY); // creates the building
		g.fillRect(20, 20, 400, 700);
		
		Random rand = new Random(); // generates random rgb value
		
		int r = rand.nextInt(255);
		int green = rand.nextInt(255);
		int b = rand.nextInt(255);
		
		
		
		for(int i = 0; i < 5; i++)
		{
			g.setColor(new Color(r,green,b));// creates windows on left side of building
			g.fillRect(70, y, 100, 100);
			
			r = rand.nextInt(255); // randomizes color
			green = rand.nextInt(255);
			b = rand.nextInt(255);
			
			g.setColor(new Color(r,green,b)); // creates windows on right side of building
			g.fillRect(250, y, 100, 100);
			
			r = rand.nextInt(255); // randomizes color
			green = rand.nextInt(255);
			b = rand.nextInt(255);
			y += 125;
		}
		

		
	}

}

/**
 * 
*/
