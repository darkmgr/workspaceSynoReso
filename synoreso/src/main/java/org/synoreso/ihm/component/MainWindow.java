package org.synoreso.ihm.component;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.synoreso.synoreso.SynoReso;

/**
 * Component of the MainWindow
 * 
 * @author JF
 * @since 1.0
 */
public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8341180691260274894L;

	/**
	 * MainWindow constructor
	 */
	public MainWindow() {
		super("SynoReso v" + SynoReso.getVersion());
		init();
	}

	/**
	 * Initialization of the component
	 */
	private void init() {
		// Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setPreferredSize(new Dimension(1280, 1024));
	    setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		pack();
		setVisible(true);
	}
}
