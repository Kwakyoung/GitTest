package pack01.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class BoardDAO {
	
	
	
	List<BoardDTO> getList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();   // 메모리 관리로인한 내부 작성!
		list.add(new BoardDTO(1, "제목1", "내용1"));
		list.add(new BoardDTO(2, "제목2", "내용2"));
		list.add(new BoardDTO(3, "제목3", "내용3"));
		return list;
	}
	
	public void getDisplay(List<BoardDTO> list) {
		for( BoardDTO dto : list ) {
			System.out.println(dto.getiNum());
			System.out.println(dto.getTitle());
			System.out.println(dto.getText());
		}
	}
	
	
	
	
	
}
