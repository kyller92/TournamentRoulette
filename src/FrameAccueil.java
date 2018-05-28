import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameAccueil extends JFrame{
	public FrameAccueil(){
		this.setVisible(true);
		this.setTitle("Ecran d'accueil");
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		
		JPanel panelAccueil = new JPanel();
		panelAccueil.setBackground(new Color(102, 178, 255));
		this.setContentPane(panelAccueil);
	}
}