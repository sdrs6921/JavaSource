package HomeWork1.Factory;

import java.util.Scanner;

public class FactoryService {
	private DAO dao;
	
	public FactoryService() {
		dao = new DAO();
	}
	
	public void addProduct(Scanner sc) {
		//��ǰ�� �̸�, ����, ������ �Է� �޾Ƽ� Product ��ü�� ����
		//dao.inert(p);
	}
	
	public void getProductByNum(Scanner sc) {
		//��ǰ ��ȣ�� �˻��ؼ� ���
	}
	
	public void getProductByName(Scanner sc) {
		//��ǰ ���� �Է¹޾� ���
	}
	
	public void editProduct(Scanner sc) {
		//������ ��ǰ�� ��ȣ�� �� ������ �Է¹޾� Product ��ü�� ��Ƽ�
		//dao.updatePrice(p);
	}
	
	public void in_out(Scanner sc) {
		//������� ��ǰ��ȣ�� ������ �Է¹޾Ƽ�
		//dao.updateAmount() ȣ��
	}
	
	public void deleteProduct(Scanner sc) {
		//������ ��ǰ�� ��ȣ�� �Է¹پƼ�
		//dao.delete()ȣ��
	}
	
	public void printAll() {
		//dao.selectAll();
	}
	
	public Product[] getAll() {
		//�ֹ� �ʿ��� ����ϵ��� ��ǰ ��� ��ȯ
		//dao.selectAll() ȣ��
		return null;
	}
}
