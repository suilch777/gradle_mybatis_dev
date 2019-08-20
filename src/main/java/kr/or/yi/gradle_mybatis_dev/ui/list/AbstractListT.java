package kr.or.yi.gradle_mybatis_dev.ui.list;


import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public abstract class AbstractListT<T>extends JPanel {
	private JTable table;
	protected List<T> itemList;
	private JScrollPane scrollPane;
	
	public AbstractListT(String title) {
		initComponents(title);
	}

	private void initComponents(String title) {
		
		setBorder(new TitledBorder(null, title + "목록", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(400, 200));
		add(scrollPane, BorderLayout.CENTER);
		
		
		
		table= new JTable();
		scrollPane.setViewportView(table);
	}
	
	public void setItemList(List<T> itemList) {
		this.itemList = itemList;
	}
	private Object[][]getRows(){
		Object[][] rows = new Object[itemList.size()][];
		for(int i=0;i<itemList.size();i++) {
			rows[i] = toArry(i);
			
		}
		return rows;
	}
	protected abstract void tableAlignmentAndWidth();
	protected abstract Object[] toArry(int idx);
	protected abstract String[] getColumNames();
	
	protected void tableCellAlignment(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		TableColumnModel model = table.getColumnModel();
		for(int i =0; i<idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	protected void tableSetWidth(int... width) {
		TableColumnModel cModel=table.getColumnModel();
		for(int i= 0; i<width.length;i++) {
			cModel.getColumn(i).setPreferredWidth(width[i]);
		}
	}
}
