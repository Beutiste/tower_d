package com.towerdefense.display;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;

public class Window extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private static String title = "Tower Defense";
    private static Dimension sizeDimension = new Dimension(800, 600);
    public static MouseHandler mouseEvent = new MouseHandler();
    public static MouseHandler mouseMotionEvent = new MouseHandler();
    public static Point mouse = new Point(0, 0);
    private static CardLayout cardManager;

    public static JPanel main;

    public static JMenuItem pause = new JMenuItem("Pause");

    public static JMenuItem menu = new JMenuItem("Menu");

    public static JMenuItem save = new JMenuItem("Save");

    public static JMenuItem exit = new JMenuItem("Exit");

    public static void changePanel(String name) {
        cardManager.show(main, name);
    }

    private int nbrOfPanels = 4;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu game = new JMenu("Game");
    private JMenu window = new JMenu("Window");

    public Window() {

        this.initPanels();
        this.initMenuBar();
        this.setJMenuBar(this.menuBar);
        this.init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void init() {
        this.setTitle(Window.title);
        this.setSize(Window.sizeDimension);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(main);
        this.setVisible(true);
    }

    private void initMenuBar() {
        Window.pause.setEnabled(false);
        Window.save.setEnabled(false);
        this.game.add(Window.pause);
        this.game.addSeparator();
        this.game.add(Window.save);

        this.menuBar.add(this.game);

        Window.menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window.changePanel("panelMenu");
            }
        });
        this.window.add(Window.menu);
        Window.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        this.window.add(Window.exit);

        this.menuBar.add(this.window);
    }

    private void initPanels() {
        main = new JPanel(cardManager = new CardLayout());
        JPanel[] panels = new JPanel[this.nbrOfPanels];

        panels[0] = new PanelMenu();
        main.add(panels[0], "panelMenu");

        panels[1] = new PanelGame();
        main.add(panels[1], "panelGame");

        panels[2] = new PanelLoad();
        main.add(panels[2], "panelLoad");

        panels[3] = new PanelLeaderBoard();
        main.add(panels[3], "panelLeaderBoard");

        this.add(main, BorderLayout.CENTER);
    }
}
