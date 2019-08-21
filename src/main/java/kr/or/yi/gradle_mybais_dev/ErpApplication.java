package kr.or.yi.gradle_mybais_dev;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.ui.AbstractFrameUI;
import kr.or.yi.gradle_mybatis_dev.ui.DepartmentFrameUI;
import kr.or.yi.gradle_mybatis_dev.ui.TitleFrameUI;


@SuppressWarnings("serial")
public class ErpApplication extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JButton btnTitle;
	private JButton btnDepartment;

	public ErpApplication() {
		initComponents();
	}
	private void initComponents() {
		setTitle("ERP 관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 10, 0));
		
		btnTitle = new JButton("직책관리");
		btnTitle.addActionListener(this);
		contentPane.add(btnTitle);
		
		btnDepartment = new JButton("부서관리");
		btnDepartment.addActionListener(this);
		contentPane.add(btnDepartment);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(e);
		}
		if (e.getSource() == btnTitle) {
			actionPerformedBtnTitle(e);
		}

	}

	protected void actionPerformedBtnTitle(ActionEvent e) {
		AbstractFrameUI<Title> frame = new TitleFrameUI("직책관리");
		frame.setVisible(true);
	}
	protected void actionPerformedBtnDepartment(ActionEvent e) {
		DepartmentFrameUI frame = new DepartmentFrameUI();
		frame.setVisible(true);
	}
}
