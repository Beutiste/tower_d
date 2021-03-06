package com.towerdefense.display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;
import com.towerdefense.towerdefense.GlobalVariables;

public class PanelGame extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static Point mouse = new Point(0, 0);
	public String nickname;

	JLabel test = new JLabel("Je suis le panel game");

	public PanelGame() {
		this.addMouseListener(new MouseHandler());
		this.addMouseMotionListener(new MouseHandler());
		this.setBackground(Color.CYAN);
		this.setLayout(new BorderLayout());
		this.add(this.test, BorderLayout.CENTER);

		Window.pause.setEnabled(true);
		Window.save.setEnabled(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        GlobalVariables.selectedMap.drawTerrain(g);
	}

}