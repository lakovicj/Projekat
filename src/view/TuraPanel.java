package view;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import model.Tura;

public class TuraPanel extends JPanel{	
	
	// izdvoji arraylist<TuraGui>
	
	//private ArrayList<TuraGui>
	
	public TuraPanel(ArrayList<Tura> ture){ //arg ArrayList<Tura>
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(50, 20, 0, 0));
		this.setBackground(Color.white);
			    
	    this.addTureGui(ture);
		
	}
	
	public void addTura(Tura t){
			TuraGui turaGui = new TuraGui(t);
			this.add(turaGui);
		    this.add(Box.createRigidArea(new Dimension(0,100)));
			SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void addTureGui(ArrayList<Tura> ture){ // arg ArrayList<Tura>

		
		for(Tura t : ture){
			TuraGui turaGui = new TuraGui(t);
			this.add(turaGui);
		    this.add(Box.createRigidArea(new Dimension(0,100)));
		}
		
		Tura t = new Tura();
		TuraGui turaGui = new TuraGui(t);
	    this.add(turaGui);
	    this.add(Box.createRigidArea(new Dimension(0,100)));
	    Tura t1 = new Tura();
	    TuraGui turaGui2 = new TuraGui(t1);
	    this.add(turaGui2);
	    this.add(Box.createRigidArea(new Dimension(0,100)));
	    
	    Tura t2 = new Tura();
		TuraGui turaGui3 = new TuraGui(t2);
	    this.add(turaGui3);
	    this.add(Box.createRigidArea(new Dimension(0,100)));
	    
	    Tura t3 = new Tura();
		TuraGui turaGui4 = new TuraGui(t3);
	    this.add(turaGui4);
	    this.add(Box.createRigidArea(new Dimension(0,100)));
	    
	    Tura t4 = new Tura();
		TuraGui turaGui5 = new TuraGui(t4);
	    this.add(turaGui5);
	    this.add(Box.createRigidArea(new Dimension(0,100)));
		SwingUtilities.updateComponentTreeUI(this);

	}
}
