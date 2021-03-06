package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import game.GameData;
import game.interfaces.GameOutput;
import networking.Client;

public class TemplateFrame extends JFrame implements GameOutput{
	private TemplateGamePanel gamePanel;
	
	
	public TemplateFrame(Client client, String title) {
		//Setting game window tile
		setTitle(title);
		//Sets size/position of game window (x1,y1,x2,y2)
		setBounds(100,100,530,520);
		//Defines layout of components in frame
		setLayout(new BorderLayout());
		
		
		//Adding gamePanel to center of screen
		gamePanel = new TemplateGamePanel(client.getGameData());
		add(gamePanel,BorderLayout.CENTER);
		
		//Catches keyboard inputs and gives them to client
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent keyCode) {
				try {
				client.updateKeyInput(keyCode.getKeyCode());
				} catch(Exception e) {
					
				}	
			}
		});
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        client.quitGame();
		    }
		});
		
		
		setVisible(true);	
	}
	
	public void updateGame(GameData gameData) {
		//Updating gameData for panel
		gamePanel.updateGameData(gameData);
		//Forces game panel to call paint()
		gamePanel.repaint();
	}

	@Override
	public void setWinState(boolean win) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genericPushMessage(String message) {
		// TODO Auto-generated method stub
		
	}
		

}