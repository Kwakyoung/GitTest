package pack03_oop1;

public class PrductMain {
	public static void main(String[] args) {
		// 상품 두개를 생성하기.
		// 1. 컴퓨터, 2.노트북
		// display()메소드를 이용해서 내용 출력해보기.
		
//		Product po = new Product(1,"컴퓨터");
//		po.display();
//		Product po2 = new Product(2, "노트북");
//		po2.display();
//		
		
		ProductDTO dto = new ProductDTO();
		dto.num = 1;
		dto.name = "컴퓨터";
		
		ProductDAO ato = new ProductDAO();
		ato.display(dto);
	}
}
