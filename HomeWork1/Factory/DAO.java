package HomeWork1.Factory;

public class DAO {
	private Product[] prods;
	private int cnt;
	
	public DAO() {
		prods = new Product[30];
	}
	
	public void insert(Product p) {
		//��ǰ ���
	}
	
	public int getProdIdx(int num) {
		return -1;
	}
	
	public Product selectByNum(int num) {
		
		return null;
	}
	
	public Product[] selectByName(String name) {
		//��ǰ������ �˻�, �̸� �ߺ��� ��� ������ �˻��ǹǷ� �迭�� ��� ��ȯ
		return null;
	}
	
	public void updatePrice(Product p) {
		//���� ����
	}
	
	public void updateAmount(Product p) {
		//����� ó��
	}
	
	public void delete(int num) {
		//��ǰ ����
	}
	
	public Product[] selectAll() {
		Product[] p = new Product[cnt];
		System.arraycopy(prods, 0, p, 0, cnt);
		return p;
	}
}
