package HomeWork1.Factory;

public class DAO {
	private Product[] prods;
	private int cnt;
	
	public DAO() {
		prods = new Product[30];
	}
	
	public void insert(Product p) {
		//제품 등록
	}
	
	public int getProdIdx(int num) {
		return -1;
	}
	
	public Product selectByNum(int num) {
		
		return null;
	}
	
	public Product[] selectByName(String name) {
		//제품명으로 검색, 이름 중복인 경우 여러개 검색되므로 배열에 담아 반환
		return null;
	}
	
	public void updatePrice(Product p) {
		//가격 변경
	}
	
	public void updateAmount(Product p) {
		//입출고 처리
	}
	
	public void delete(int num) {
		//제품 삭제
	}
	
	public Product[] selectAll() {
		Product[] p = new Product[cnt];
		System.arraycopy(prods, 0, p, 0, cnt);
		return p;
	}
}
