package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;

public class FireWorks extends BasicGameState
{
	public static ArrayList<BigBoi> bigBois;
	private int id;

	public FireWorks(int id)
	{
		this.id = id;
	}
	
	public int getID() 
	{
		return id;		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(true);
		bigBois = new ArrayList<BigBoi>();


	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		for (BigBoi b : bigBois)
		{
			b.update();
		}


	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		g.setBackground(Color.blue);
		for (BigBoi b : bigBois)
		{
			b.render(g);
		}

	}
	
	public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a gameState.  
	}

	public void leave(GameContainer gc, StateBasedGame sbg) 
	{
		// This code happens when you leave a gameState. 
	}

	public void keyPressed(int key, char c)
	{
		// This code happens every time the user presses a key
	}
	
	public void mousePressed(int button, int x, int y)
	{

		for(int i = 0; i<15; i++)
		{
			bigBois.add(new BigBoi(Mouse.getX(), Main.getScreenHeight()-Mouse.getY()));

		}
//		System.out.println(Mouse.getY());



	}
	
	


}
