package gui.view;

import javax.swing.*;
import java.awt.Color;
import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{
	private GUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	public FirstPanel(GUIController baseController) 
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.colorButton = new JButton("colors!");
		this.randomButton = new JButton("random colors!!");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 135, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 153, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -21, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.GREEN);
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
	
	
	
	
	
}