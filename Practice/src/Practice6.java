package TEN_WEEK;
import javax.swing.*;
import java.awt.*;
public class Practice6 extends JFrame {
	public Practice6() {
		setTitle("Practice 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JButton
		Container c=getContentPane();
		JButton b=new JButton("버튼");
		c.add(b);											
		
		//JCheckBox
		c.setLayout(new FlowLayout());
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JButton cherry = new JButton("체리");
		ImageIcon chep=new ImageIcon("C:\\Users\\Soyoun\\Desktop\\cherry.PNG");
		Dimension d = cherry.getPreferredSize();
		Image img = chep.getImage().getScaledInstance(d.width, d.height, java.awt.Image.SCALE_SMOOTH);
		chep = new ImageIcon(img);
		cherry.setIcon(chep);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		//JRadioButton
		JRadioButton apple1=new JRadioButton("사과");
		JRadioButton pear1=new JRadioButton("배");
		JButton cherry1=new JButton("체리",chep);
		c.add(apple1);
		c.add(pear1);
		c.add(cherry1);
		
		//JSlider
		JSlider s=new JSlider(JSlider.HORIZONTAL,0,200,100);
		s.setMinorTickSpacing(10);
		s.setMajorTickSpacing(50);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		c.add(s);
		
		//JTextField
		JLabel name =new JLabel("이름: ");
		JLabel major =new JLabel("학과: ");
		JLabel address =new JLabel("주소: ");
		
		JTextField n=new JTextField(7);
		JTextField m=new JTextField("컴퓨터공학과(수정)");
		JTextField a=new JTextField("서울시...                                       ");
		
		c.add(name);
		c.add(n);
		c.add(major);
		c.add(m);
		c.add(address);
		c.add(a);
		
		//JPasswordField
		JPasswordField j=new JPasswordField(10);
		JLabel pass=new JLabel("Enter the password:");
		
		c.add(pass);
		c.add(j);
		
		//JSpinner
		String[] i= {"January", "Feburary","March","April","May","June","July","August","September","October","November","December"};
		JLabel input=new JLabel("Month:");
		SpinnerListModel listModel = new SpinnerListModel(i);
		JSpinner spinner = new JSpinner(listModel);
		
		c.add(input);
		c.add(spinner);
		
		//JTextArea
		JTextArea area=new JTextArea("hello",10,20);
		c.add(area);
		
		//JComboBox
		String[] fruit= {"apple","banana","kiwi","mango","pear","peach","berry","Strawberry"};
		String[] nam= {"kitae"};
		JComboBox f=new JComboBox(fruit);
		JComboBox na=new JComboBox(nam);
		
		c.add(f);
		c.add(na);
		
		//JList
		JList list=new JList(fruit);
		ImageIcon[] icon= {new ImageIcon("C:\\Users\\Soyoun\\Desktop\\house.PNG"),new ImageIcon("C:\\Users\\Soyoun\\Desktop\\bulb.PNG"),new ImageIcon("C:\\Users\\Soyoun\\Desktop\\sound.PNG"),new ImageIcon("C:\\Users\\Soyoun\\Desktop\\fan.PNG")};
		JList ic=new JList(icon);
		JList scrollList = new JList(fruit);
		for(int num=0;num<4;num++) {
		img = icon[num].getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon[num] = new ImageIcon(img);
		}
	    
		c.add(list);
		c.add(ic);
		c.add(new JScrollPane(scrollList));
		
		
		
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Practice6();
	}
}
