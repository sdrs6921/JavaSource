package HomeWork2.Factory;

import java.util.ArrayList;

public class DaoImplArrayList implements DAO {
	private ArrayList<Product> datas;

	public DaoImplArrayList() {
		// TODO Auto-generated constructor stub
		datas = new ArrayList<Product>();
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		datas.add(p);
	}

	@Override
	public int getIdByNum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		// return datas.get(num-1);

		Product p = new Product();
		p.setNum(num);
		int idx = datas.indexOf(p);
		if (idx < 0) {
			return null;
		} else {
			return datas.get(idx);
		}
	}

	@Override
	public Product[] selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePrice(Product p) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(p);
		if (idx >= 0) {
			p.setName(datas.get(idx).getName());
			p.setAmount(datas.get(idx).getAmount());
			datas.set(idx, p);
		} else {
			System.out.println("�ش� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}

	@Override
	public boolean in_out(Product p) {
		// TODO Auto-generated method stub
		Product p2 = null;
		int idx = datas.indexOf(p);
		
		if (idx < 0) {
			System.out.println("���� ��ǰ�Դϴ�." + p.getName() + " ��ǰ�� ��� �մϴ�.");
			return false;
		} else {
			p2 = datas.get(idx);
		}
		
		switch (p.getName()) {
		case "in":
			p2.setAmount(p2.getAmount() + p.getAmount());
			break;
		case "out":
			if (p2.getAmount() > p.getAmount()) {
				p2.setAmount(p2.getAmount() - p.getAmount());
			} else {
				System.out.println("������ �����մϴ�.\n"+ p2.getName() +"��ǰ�� ��� ����մϴ�.\n");
				return false;
			}
			break;
		}
		return true;	
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setNum(num);
		if (datas.remove(p)) {
			System.out.println(num + "�� ��ǰ ���� �Ϸ�");
		} else {
			System.out.println(num + "�� ��ǰ ���� ����");
		}
	}

	@Override
	public ArrayList<Product> selectByName2(String name) {
		// TODO Auto-generated method stub
		ArrayList<Product> dat = new ArrayList<Product>();
		for (Product p : datas) {
			if (p.getName().equals(name)) {
				dat.add(p);
			}
		}
		return dat;
	}

	@Override
	public ArrayList<Product> selectAll2() {
		// TODO Auto-generated method stub
		return datas;
	}

}
