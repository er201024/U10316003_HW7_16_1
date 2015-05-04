import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Deck extends JFrame{
	//create list store cards
	int[] card = new int[52];

	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	private JLabel card4;
	//"Refresh" on the panel
	private JButton jbtRefresh = new JButton("Refresh");
	//create two panel
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	//52 cards
	ImageIcon[] cardx = {new ImageIcon("card/1.png"),new ImageIcon("card/2.png"),
						new ImageIcon("card/3.png"),new ImageIcon("card/4.png"),
						new ImageIcon("card/5.png"),new ImageIcon("card/6.png"),
						new ImageIcon("card/7.png"),new ImageIcon("card/8.png"),
						new ImageIcon("card/9.png"),new ImageIcon("card/10.png"),
						new ImageIcon("card/11.png"),new ImageIcon("card/12.png"),
						new ImageIcon("card/13.png"),new ImageIcon("card/14.png"),
						new ImageIcon("card/15.png"),new ImageIcon("card/16.png"),
						new ImageIcon("card/17.png"),new ImageIcon("card/18.png"),
						new ImageIcon("card/19.png"),new ImageIcon("card/20.png"),
						new ImageIcon("card/21.png"),new ImageIcon("card/22.png"),
						new ImageIcon("card/23.png"),new ImageIcon("card/24.png"),
						new ImageIcon("card/25.png"),new ImageIcon("card/26.png"),
						new ImageIcon("card/27.png"),new ImageIcon("card/28.png"),
						new ImageIcon("card/29.png"),new ImageIcon("card/30.png"),
						new ImageIcon("card/31.png"),new ImageIcon("card/32.png"),
						new ImageIcon("card/31.png"),new ImageIcon("card/34.png"),
						new ImageIcon("card/35.png"),new ImageIcon("card/36.png"),
						new ImageIcon("card/37.png"),new ImageIcon("card/38.png"),
						new ImageIcon("card/39.png"),new ImageIcon("card/40.png"),
						new ImageIcon("card/41.png"),new ImageIcon("card/42.png"),
						new ImageIcon("card/43.png"),new ImageIcon("card/44.png"),
						new ImageIcon("card/45.png"),new ImageIcon("card/46.png"),
						new ImageIcon("card/47.png"),new ImageIcon("card/48.png"),
						new ImageIcon("card/49.png"),new ImageIcon("card/50.png"),
						new ImageIcon("card/51.png"),new ImageIcon("card/52.png")
						};
	public Deck(){
		
		
		//add Refresh on the panel
		p2.add(jbtRefresh);
		//type
		p1.setLayout(new GridLayout(1,4,1,1));
		
		for(int i = 0; i < card.length; i++)
			card[i] = i;
			
		//refresh cards  
		for(int i = 0; i < card.length; i++){
			int index = (int)(Math.random() * card.length);
			int temp = card[i];
			card[i] = card[index];
			card[index] = temp;
		}
		//store first 4 cards
		card1 = new JLabel(cardx[card[0]]);
		card2 = new JLabel(cardx[card[1]]);
		card3 = new JLabel(cardx[card[2]]);
		card4 = new JLabel(cardx[card[3]]);
		
		p1.add(card1);
		p1.add(card2);
		p1.add(card3);
		p1.add(card4);
		
		this.add(p2,BorderLayout.SOUTH);
		this.add(p1,BorderLayout.CENTER);
		//click "refresh" , refresh card 
		jbtRefresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			p2.repaint();
			for(int i = 0; i < card.length; i++)
				card[i] = i;
			
				  
			for(int i = 0; i < card.length; i++){
				int index = (int)(Math.random() * card.length);
				int temp = card[i];
				card[i] = card[index];
				card[index] = temp;
			}	
			
			card1.setIcon(cardx[card[0]]);
			card2.setIcon(cardx[card[1]]);
			card3.setIcon(cardx[card[2]]);
			card4.setIcon(cardx[card[3]]);

			}
		});
		
	}
	
	public static void main(String args[]){
		//main method
		JFrame frame = new Deck();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}