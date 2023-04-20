package pack06_oop3;

public class ProductMain {
	public static void main(String[] args) {
		
//		String strArr[] = new String[5];
//		strArr[0] = "1";
//		System.out.println(strArr.length);
		
		
		ProductDTO[] dtoArr = new ProductDTO[5];
		ProductDAO dao = new ProductDAO();
		// 1. 처음보는 타입을 배열로 묶을때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해보기.
		// 2. 생성한 객체를 배열의 임의의 인덱스에 넣어보기.
		// 3. 객체 생성시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수정.
		
		dtoArr[0] = new ProductDTO(1, "컴퓨터", 1000, 5);
		dtoArr[1] = new ProductDTO(2, "노트북", 2000, 4);
		dtoArr[2] = new ProductDTO(3, "김  밥", 2500, 4);
		dtoArr[3] = new ProductDTO(4, "자동차", 9000, 4);
		dtoArr[4] = new ProductDTO(5, "아바라", 3000, 4);
		for(int i=0; i<dtoArr.length; i++) {
		System.out.println(dtoArr[i].getNum());
		}
//		dao.display(dtoArr);
		
		
		
		
		
		// 매번 dto의 내용을 하나씩 getter로 불러오는게 아니라 display()라는 메소드를 DAO구현하고
		// 해당하는 메소드 호출시 dto의 내용을 보여줄수있게 해보기.
		// 번호 : 1, 이름 : 컴퓨터, 가격 : 1000, 수량 : 5
//		dao.display(dto);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);
	
	}
}
