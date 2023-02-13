package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열깊은복사2 {
	public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(500,400);
	Random r = new Random(100);
	
	String header[] = {"컴퓨터","영어","수학","체육"};
	String contents[][] = {
			{"1","2","3","4"},
			{"1","2","3","4"},
			{"1","2","3","4"}
	};
	
//	Integer[][] contents = { //int로 넣고 싶은 경우 integer로 변경
//			{"1","2","3","4"},
//			{"1","2","3","4"},
//			{"1","2","3","4"}
//	};
	
	for (int i = 0; i < header.length; i++) {
		
	}
	
	
	
	JTable table = new JTable(contents, header);
	JScrollPane scroll = new JScrollPane(table); //스크롤 생기는 것
	
	f.add(scroll);
	
	f.setVisible(true);
	}
}
