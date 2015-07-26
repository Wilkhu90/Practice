package edu.auburn.szw0069.ObserverPattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JButtonObserver {
	JFrame frame;

	public static void main(String[] args) {
		JButtonObserver JObs = new JButtonObserver();
		JObs.go();

	}

	private void go() {
		frame = new JFrame();
		JButton button = new JButton();
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("This is Angel Listener.");
			
		}
		
	}
	class DevilListener  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("This is Devil Listener.");
			
		}
		
	}
}
