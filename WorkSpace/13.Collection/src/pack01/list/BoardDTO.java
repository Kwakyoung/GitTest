package pack01.list;

public class BoardDTO {  // 데이터베이스의 한행
	private int iNum;
	private String title, text;
	
	public BoardDTO(int iNum, String title, String text) {
		super();
		this.iNum = iNum;
		this.title = title;
		this.text = text;
	}
	public int getiNum() {
		return iNum;
	}
	public void setiNum(int iNum) {
		this.iNum = iNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
