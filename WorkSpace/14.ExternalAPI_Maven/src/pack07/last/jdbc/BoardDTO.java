package pack07.last.jdbc;

public class BoardDTO {
	private int board_num;
	private String board_title, boad_content, writer, wirter_date;
	
	
	public BoardDTO(int board_num, String board_title, String boad_content, String writer, String wirter_date) {
		super();
		this.board_num = board_num;
		this.board_title = board_title;
		this.boad_content = boad_content;
		this.writer = writer;
		this.wirter_date = wirter_date;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoad_content() {
		return boad_content;
	}
	public void setBoad_content(String boad_content) {
		this.boad_content = boad_content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWirter_date() {
		return wirter_date;
	}
	public void setWirter_date(String wirter_date) {
		this.wirter_date = wirter_date;
	}
	
	
	
}
