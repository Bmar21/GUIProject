package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import gui.controller.GUIController;

public class FirstPanel extends JPanel
{
	private GUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public FirstPanel(GUIController baseController) 
	{
		super();
		this.baseController = baseController;
		
		this.colorButton = new JButton("colors!");
		this.randomButton = new JButton("random colors!!");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
