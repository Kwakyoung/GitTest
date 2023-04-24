package pack03_oop1;

public class ProductDAO {
	// 기능만 있음.
	// 필요에 따라서 필드에 변수 (DAO에 필요한것) 만들기도함

	void display(ProductDTO dto) {
		System.out.println("번호 : " + dto.num);
		System.out.println("상품명 : " + dto.name);
	}
}
