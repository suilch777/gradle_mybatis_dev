package kr.or.yi.gradle_mybatis_dev.ui.content;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbstractPanel<T> extends JPanel {

	public AbstractPanel(String title) {
		initComponents(title);
	}

	protected abstract void initComponents(String title);

	public abstract void setItem(T item);

	public abstract T getItem();

	public abstract void clearComponent(int nextNo);

}
