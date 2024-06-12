package gui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class GD_ThongTin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	
	
	public static void ThongTinScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 GD_ThongTin window = new  GD_ThongTin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GD_ThongTin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image\\info.png"));
		getContentPane().setBackground(new Color(0, 128, 192));
		setTitle("Th\u00F4ng Tin");
		
		setBounds(100, 100, 774, 410);
		setBackground(new Color(230, 230, 250));
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ph\u1EA7n m\u1EC1m qu\u1EA3n l\u00FD c\u1EEDa h\u00E0ng s\u00E1ch");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(0, 0, 760, 85);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTiMn = new JLabel("Đề tài môn: Lập trình phân tán");
		lblTiMn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiMn.setForeground(SystemColor.info);
		lblTiMn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTiMn.setBounds(0, 61, 760, 85);
		getContentPane().add(lblTiMn);
		
		JLabel lblNhm = new JLabel("Nhóm ");
		lblNhm.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhm.setForeground(Color.YELLOW);
		lblNhm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNhm.setBounds(0, 111, 760, 72);
		getContentPane().add(lblNhm);
		
		JLabel lblVVnLc = new JLabel("Đỗ Hoàng Nhật Nguyên - 20118281");
		lblVVnLc.setHorizontalAlignment(SwingConstants.CENTER);
		lblVVnLc.setForeground(new Color(0, 255, 0));
		lblVVnLc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVVnLc.setBounds(10, 161, 750, 72);
		getContentPane().add(lblVVnLc);
		
		JLabel lblHongNht = new JLabel("Dương Quang Hải - 20072631");
		lblHongNht.setHorizontalAlignment(SwingConstants.CENTER);
		lblHongNht.setForeground(new Color(0, 255, 0));
		lblHongNht.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHongNht.setBounds(0, 218, 760, 63);
		getContentPane().add(lblHongNht);
		
		JLabel lblLSnHi = new JLabel("Trịnh Ngọc Thái - 21096211");
		lblLSnHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblLSnHi.setForeground(new Color(0, 255, 0));
		lblLSnHi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLSnHi.setBounds(0, 276, 760, 63);
		getContentPane().add(lblLSnHi);
		
		JLabel lblVVnLc_2_1 = new JLabel("Nguyễn Huy Hoàng - 21052081");
		lblVVnLc_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVVnLc_2_1.setForeground(new Color(0, 255, 0));
		lblVVnLc_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVVnLc_2_1.setBounds(0, 313, 760, 90);
		getContentPane().add(lblVVnLc_2_1);
		setLocationRelativeTo(null);
		
	}
}
