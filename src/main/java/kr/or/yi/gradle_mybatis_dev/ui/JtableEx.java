package kr.or.yi.gradle_mybatis_dev.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import kr.or.yi.gradle_mybatis_dev.dao.TitleDao;
import kr.or.yi.gradle_mybatis_dev.dto.Title;

public class JtableEx extends JFrame {

	JFrame jFrame = new JFrame("JTable 예제");
	Object record[] = new Object[3];
	 String [] field = {"code", "name", "floor"};
		
	//DefaultTableModel을 선언하고 데이터 담기
	DefaultTableModel tableModel = new DefaultTableModel(field, 0);

	//JTable에 DefaultTableModel을 담기
	JTable table = new JTable(tableModel);
	
	//JScrollPane에 JTable을 담기
	JScrollPane sp = new JScrollPane(table);
	protected TitleDao TitleDao;

	public JtableEx(){
	
		 setSize(400, 300);
		  setVisible(true);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  add(sp, "Center");
		
		 }
		
}

