package HomeWork1.Factory;

import java.util.Scanner;

public class FactoryService {
	private DAO dao;
	
	public FactoryService() {
		dao = new DAO();
	}
	
	public void addProduct(Scanner sc) {
		//제품의 이름, 가격, 수량을 입력 받아서 Product 객체에 담음
		//dao.inert(p);
	}
	
	public void getProductByNum(Scanner sc) {
		//제품 번호로 검색해서 출력
	}
	
	public void getProductByName(Scanner sc) {
		//제품 명을 입력받아 출력
	}
	
	public void editProduct(Scanner sc) {
		//수정할 제품의 번호와 새 가격을 입력받아 Product 객체에 담아서
		//dao.updatePrice(p);
	}
	
	public void in_out(Scanner sc) {
		//입출고할 제품번호와 수량을 입력받아서
		//dao.updateAmount() 호추
	}
	
	public void deleteProduct(Scanner sc) {
		//삭제할 제품의 번호를 입력바아서
		//dao.delete()호출
	}
	
	public void printAll() {
		//dao.selectAll();
	}
	
	public Product[] getAll() {
		//주문 쪽에서 사용하도록 제품 목록 반환
		//dao.selectAll() 호출
		return null;
	}
}
