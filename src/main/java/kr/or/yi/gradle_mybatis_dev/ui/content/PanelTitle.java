package kr.or.yi.gradle_mybatis_dev.ui.content;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import kr.or.yi.gradle_mybatis_dev.dto.Title;



@SuppressWarnings("serial")
public class PanelTitle extends AbstractPanel<Title> {
	private JTextField tfTitleNo;
	private JTextField tfTitleName;

	public PanelTitle(String title) {
		super(title);
	}

	@Override
	protected void initComponents(String title) {
		setBorder(new TitledBorder(null, title + " 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblTitleNo = new JLabel("직책 번호");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);

		tfTitleNo = new JTextField();
		add(tfTitleNo);
		tfTitleNo.setColumns(10);

		JLabel lblTitleName = new JLabel("직책명");
		lblTitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleName);

		tfTitleName = new JTextField();
		tfTitleName.setColumns(10);
		add(tfTitleName);
	}

	@Override
	public void setItem(Title Title) {
		tfTitleNo.setText(String.format("T%03d", Title.getTitleCode()));
		tfTitleName.setText(Title.getTitleName());
		tfTitleNo.setEditable(false);
	}

	@Override
	public Title getItem() {
		int titleNo = Integer.parseInt(tfTitleNo.getText().trim().substring(1));
		String titleName = tfTitleName.getText().trim();
		return new Title(titleNo, titleName);
	}

	@Override
	public void clearComponent(int nextNo) {
		tfTitleNo.setText(String.format("T%03d", nextNo));
		tfTitleName.setText("");
		tfTitleNo.setEditable(false);
	}

}
