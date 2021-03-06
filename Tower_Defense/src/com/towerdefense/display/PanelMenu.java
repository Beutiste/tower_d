package com.towerdefense.display;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenu extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton btnPlay = new JButton("Play");
	JButton btnLoad = new JButton("Load");
	JButton btnLeaderBoard = new JButton("LeaderBoard");
	JButton btnExit = new JButton("Exit");

    public PanelMenu() {
        this.initMenu();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		// TODO : Select nickname only when the game is save.

		if (action.equals("Play")) {
			NicknameAsker asker = new NicknameAsker();
			System.out.println("Ta mere");

			this.repaint();
			this.revalidate();
		}
		else if (action.equals("Load")) {
			Window.changePanel("panelLoad");
			this.repaint();
			this.revalidate();
		}
		else if (action.equals("LeaderBoard")) {
			Window.changePanel("panelLeaderBoard");
			this.repaint();
			this.revalidate();
		}
		else if (action.equals("Exit")) {
			System.exit(0);
		}

	}

    public void initMenu() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        this.setLayout(gridBagLayout);

        GridBagConstraints gbc_btnPlay = new GridBagConstraints();
        gbc_btnPlay.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnPlay.insets = new Insets(0, 0, 5, 5);
        gbc_btnPlay.gridx = 5;
        gbc_btnPlay.gridy = 5;
        this.btnPlay.setActionCommand("Play");
        this.add(this.btnPlay, gbc_btnPlay);
        this.btnPlay.addActionListener(this);

        GridBagConstraints gbc_btnLoad = new GridBagConstraints();
        gbc_btnLoad.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnLoad.insets = new Insets(0, 0, 5, 5);
        gbc_btnLoad.gridx = 5;
        gbc_btnLoad.gridy = 6;
        this.btnLoad.setActionCommand("Load");
        this.add(this.btnLoad, gbc_btnLoad);
        this.btnLoad.addActionListener(this);

        GridBagConstraints gbc_btnLeaderBoard = new GridBagConstraints();
        gbc_btnLeaderBoard.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnLeaderBoard.insets = new Insets(0, 0, 5, 5);
        gbc_btnLeaderBoard.gridx = 5;
        gbc_btnLeaderBoard.gridy = 7;
        this.btnLeaderBoard.setActionCommand("LeaderBord");
        this.add(this.btnLeaderBoard, gbc_btnLeaderBoard);
        this.btnLeaderBoard.addActionListener(this);

        GridBagConstraints gbc_btnExit = new GridBagConstraints();
        gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnExit.insets = new Insets(0, 0, 0, 5);
        gbc_btnExit.gridx = 5;
        gbc_btnExit.gridy = 8;
        this.btnExit.setActionCommand("Exit");
        this.add(this.btnExit, gbc_btnExit);
        this.btnExit.addActionListener(this);
    }
}
