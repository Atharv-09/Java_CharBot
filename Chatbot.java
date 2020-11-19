import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
public class Chatbot extends JFrame {

	static JTextArea txt = new JTextArea();
	static JTextField field = new JTextField();
	public static void main(String[] args) {
		
		String name = "Hey My name is Eliza, How can I help you ?";
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setTitle("Chat Bot");
		frame.add(field);
		frame.add(txt);
		txt.setLocation(1,1);
		txt.setSize(400,300);
		field.setLocation(1,300);
		field.setSize(400,60);
		//System.out.print("What is  your name : ");
		//String name = field.getText();
		txt.append(name);
		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = field.getText();
				txt.append("\n You : " + msg+"\n");
				field.setText("");
				if(msg.toLowerCase().contains("hi")) {
					txt.append("Eliza : Hello,Buddy! What's your name?\n");
				}else if(msg.toLowerCase().contains("how are you")) {
					txt.append("Eliza : I am great! What about you?\n");
				}else if(msg.toLowerCase().contains("fine")) {
					txt.append("Eliza : Great to hear that.\n");
				}else if(msg.toLowerCase().contains("sad")) {
					txt.append("Eliza : Sorry to hear that.\n");
				}else if(msg.toLowerCase().contains("help")) {
					txt.append("Eliza : How can I help you?\n");
				}else if(msg.toLowerCase().contains("name")) {
					txt.append("Eliza : Nice name. And my name is Eliza\n");
				}else if(msg.toLowerCase().contains("look")) {
					txt.append("Eliza : You looks pretty Cool! \n");
				}else if(msg.toLowerCase().contains("name")) {
					txt.append("Eliza : Nice name. And my name is Eliza");
				}
				
				else {
					txt.append("Eliza : I Don't understand. Can you please type Again ? \n ");
				}
			}
			
			
		});
	}

}
