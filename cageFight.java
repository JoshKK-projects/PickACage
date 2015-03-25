import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class cageFight{

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		final String [] cageList = new String[28];
		
		cageList[0] = "Vampires Kiss";
		cageList[1] = "Raising Arizona";
		cageList[2] = "The Rock";
		cageList[3] = "National Treasure- 1";
		cageList[4] = "National Treasure - the seconding";
		cageList[5] ="Bangkok Dangerous";
		cageList[6] = "The Wicker Man";
		cageList[7] ="Ghost Rider";
		cageList[8] = "Ghost Rider: Spirit of Vengance";
		cageList[9] = "8mm";
		cageList[10]="Adaptation";
		cageList[11]="Face Off";
		cageList[12]="Kick Ass";
		cageList[13]="Kick Ass 2";
		cageList[14] = "Lord of War";
		cageList[15]="Match Stick Men";
		cageList[16]= "The Frozen Ground";
		cageList[17]="Con Air";
		cageList[18]="Dead Fall";
		cageList[19]="Tome 4";
		cageList[20]="Fast Times at Ridgemont High";
		cageList[21]="Tempo di uccidere";
		cageList[22]="Bad Lieutenant";
		cageList[23]="Stolen";
		cageList[24]="Season of the Witch";
		cageList[25]="G-Force";
		cageList[26]="World Trade Center";
		cageList[27]="Wild at Heart";
		
		final String [] reasons = new String[26];
		
		reasons[0] =": Do it coward";
		reasons[1]=": No Way!";
		reasons[2]=": Lick a shoe to escape";
		reasons[3]=": Gurney can't even pronouce this title";
		reasons[4]=": DANGER LEVEL ORANGE";
		reasons[5]=": CAGE CONTAINMENT BREACH";
		reasons[6]=": Touch the Cage";
		reasons[7]=": Your family is ashamed of you for this";
		reasons[8]=": tome 4";
		reasons[9]=": Hipster Slosh";
		reasons[10]=":...You would.Dirty";
		reasons[11]=": Fun for the whole family";
		reasons[12]=": Fun sucking good time";
		reasons[13]=": For your errotic enjoyment";
		reasons[14]=": Cause your goldfish died in a family fire";
		reasons[15]=": Face Head";
		reasons[16]=": The Purple Guiltening";
		reasons[17]=": Lets dance to this";
		reasons[18]=": Pacific Farce";
		reasons[19]=": I'd consume the cast";
		reasons[20]=": Goes good with chedder";
		reasons[21]=": I want a tatoo of this";
		reasons[22]=": Cause your uncle likes cats";
		reasons[23]=": This says alot about you";
		reasons[24]=": Cunderbuns";
		reasons[25]=": This makes me violently ill";
		
		final JFrame frame = new JFrame("Cage Movie Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(600,200));
		frame.setBackground(Color.WHITE);
		frame.setTitle("Cage Match");
		frame.setLayout(new FlowLayout());
		
		final JButton cageGo = new JButton();
		cageGo.setText("Cageify");
		frame.add(cageGo);
		
		final JButton miscSHIT = new JButton();
		miscSHIT.setText("PickAPoison");
		frame.add(miscSHIT);
		
		final JTextField disp = new JTextField(50);
		frame.add(disp);
		
		/*JButton cagehead = null;
		ImageIcon cageFace = new ImageIcon("C:\\Users\\ursinewalrus\\Pictures\\cage head.png");
		cagehead.setIcon(cageFace);
		
		frame.add(cagehead);*/
		
		frame.setVisible(true);
		
		cageGo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Random cageToucher = new Random();
				int cageJunk = cageToucher.nextInt(28);
				int thereason = cageToucher.nextInt(26);
				disp.setText(cageList[cageJunk]+" "+reasons[thereason]);
				
			}
		});
		
		final String [] m = new String [41]; 
		m[0] ="Cyberbully";
		m[1]="Fear.com";
		m[2]="Hostel 4 Electric Boogaloo";
		m[3]="tome 4";
		m[4]="Labyrinth";
		m[5]="Ghosts of Mars";
		m[6]="Parker";
		m[7]="Dead Alive";
		m[8]="Ghost Shark";
		m[9]="SharkNado";
		m[10]="The Passion of the Christ";
		m[11]="Jesus Camp";
		m[12]="The Zookeeper";
		m[13]="Tokoyo Gore Police";
		m[14]="Hard Target";
		m[15]="Howard the Duck";
		m[16]="Dungeons and Dragons";
		m[17]="Eregon";
		m[18]="House of the Dead";
		m[19]="The Pink Panther";
		m[20]="Mullet to the Head";
		m[21]="Transformers Dark of Shia";
		m[22]="Gigli";
		m[23]="Beowolf";
		m[24]="Batman and Robin";
		m[25]="Hally Berry Catwoman";
		m[26]="Norbit";
		m[27]="The Room";
		m[28]="The Happening";
		m[29]="The Holey Mountain";
		m[30]="Zardoz";
		m[31]="Epic Movie";
		m[32]="BattleField Earth";
		m[33]="Birdemic";
		m[34]="Green Lantern";
		m[35]="Manos the Hands of Fate";
		m[36]="Live Action Dragon Ball Movie";
		m[37]="Dicks";
		m[38]="Third Twilight Movie";
		m[39]="Jack and Jill";
		m[40]="Fantastic 4";
		
		miscSHIT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Random misctoucher = new Random();
				int choice = misctoucher.nextInt(41);
				int thereason = misctoucher.nextInt(26);
				disp.setText(m[choice]+" "+reasons[thereason]);
				
			}
		});
	}
}
