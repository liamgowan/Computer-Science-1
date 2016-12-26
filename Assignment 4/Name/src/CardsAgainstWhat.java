import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class CardsAgainstWhat extends JFrame implements ActionListener, KeyListener {
	private JPanel panel1, panel2, panel3;
	private JLabel label, turnTeller, label1;
	private JButton next, OK;
	private TextField field;
	private static ArrayList<String> cards = new ArrayList<String>();
	private static ArrayList<String> starcards = new ArrayList<String>();
	private static ArrayList<String> names = new ArrayList<String>();
   private static ArrayList<String> namesSelected = new ArrayList<String>();
	boolean nameStarted = false;
	boolean gameStarted = false;
	private int playerCount = 0;
	private int numPlayers;
	
	public CardsAgainstWhat(){
		setFocusable(true);
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		next = new JButton("Next Card");
		next.addActionListener(this);
		next.setVisible(false);
		OK = new JButton("Enter");
		OK.addActionListener(this);
		OK.setVisible(true);
		label1 = new JLabel("How many people are playing?");
		label = new JLabel("");
		field = new TextField(20);
		field.addActionListener(this);
		field.addKeyListener(this);
		turnTeller = new JLabel("");
		panel1.add(next);
		panel1.add(OK);
		panel2.add(label);
		panel3.add(label1);
		panel3.add(turnTeller);
		panel2.add(field);
		add(panel1, BorderLayout.SOUTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.NORTH);
		setTitle("Cards Against Who, brought to you by Liam Gowan");
		setSize(900,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
      panel1.setBackground(Color.BLACK); 
      panel2.setBackground(Color.BLACK);
      panel3.setBackground(Color.BLACK);
      label.setForeground(Color.white);
      label1.setForeground(Color.white);
      turnTeller.setForeground(Color.white);	
      label.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
      label1.setFont(new Font("Helvetica Neue", Font.BOLD, 12));
      turnTeller.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
	}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_ENTER&&nameStarted==false){
			String numPlayersText = field.getText();
			numPlayers = Integer.parseInt(numPlayersText);
			nameStarted = true;
			field.setText("");
		}
		if(key==KeyEvent.VK_ENTER&&gameStarted==false){
			label1.setText("Player " + (playerCount+1) + " enter your name");
			String name = field.getText();
			if(name.length()>0)
				names.add(name);
			field.setText("");
			if(numPlayers==playerCount){
				OK.setVisible(false);
				next.setVisible(true);
				field.setVisible(false);
				next.setText("Click to begin");
				label1.setText("");
			}
			playerCount++;
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==OK&& nameStarted==false){
			String numPlayersText = field.getText();
			numPlayers = Integer.parseInt(numPlayersText);
			nameStarted = true;
			field.setText("");
		}
		if(e.getSource()==OK&&nameStarted==true){
			label1.setText("Player " + (playerCount+1) + " enter your name");
			String name = field.getText();
			if(name.length()>0)
				names.add(name);
			field.setText("");
			if(numPlayers==playerCount){
				OK.setVisible(false);
				next.setVisible(true);
				field.setVisible(false);
				next.setText("Click to begin");
				label1.setText("");
				gameStarted=true;
			}
			playerCount++;
		}
		if(e.getSource()==next){
			int turnName = (int)(Math.random()*names.size());
         if(namesSelected.size()==0){
            while(namesSelected.size()!=names.size()){
               if(!namesSelected.contains(names.get(turnName)))
                  namesSelected.add(names.get(turnName));
               turnName = (int)(Math.random()*names.size());
            }
         }
			turnTeller.setText(namesSelected.remove(0)+", it is your turn.\n");
			next.setText("Next Card");
			int num = (int)(Math.random()*cards.size());
			int num2 = (int)(Math.random()*starcards.size());
			int num3 =(int)(Math.random()*100);
			int num4 = (int)(Math.random()*names.size());
			while(num4!=turnName)
				num4 = (int)(Math.random()*names.size());
			if(starcards.isEmpty()&&cards.isEmpty())
				label.setText("Out of cards. Stop playing this game and get a life.");
			else if(num3<85||starcards.isEmpty())
				label.setText(cards.remove(num));
			else if(num3>85||cards.isEmpty()){
				String starName = names.get(num4);
				String x = starcards.remove(num2);
				String result ="";
				int m = x.length();
				for(int i=0; i<m; i++){
					if(x.charAt(i)=='*'){
						result = result + starName + "";
					}
					else
						result = result + x.charAt(i);
				}
				label.setText(result);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		String s = "";
		File file = new File("CAW.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		s = br.readLine();
		while(s!=null){
			cards.add(s);
			s=br.readLine();
		}
		br.close();
		s="";
		File file2 = new File("starCAW.txt");
		FileInputStream fis2 = new FileInputStream(file2);
		InputStreamReader isr2 = new InputStreamReader(fis2);
		BufferedReader br2 = new BufferedReader(isr2);
		s = br2.readLine();
		while(s!=null){
			starcards.add(s);
			s = br2.readLine();
		}
		br2.close();
		CardsAgainstWhat game = new CardsAgainstWhat();
      
	}
}
