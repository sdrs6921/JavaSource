package HomeWork2.Factory;

import HomeWork2.Factory.Product;

public class DAOImple implements DAO {
	private Product[] datas;
	private int cnt;

	public DAOImple() {
		// TODO Auto-generated constructor stub
		datas = new Product[30];
	}
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		if (cnt >= datas.length) {
			System.out.println("저장소가 다 찼습니다.");
			return;
		}

		datas[cnt++] = p;
	}

	@Override
	public int getIdByNum(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cnt; i++) {
			if (num == datas[i].getNum()) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		int idx = getIdByNum(num);
		if (idx >= 0) {
			return datas[idx];
		}
		return null;
	}

	@Override
	public Product[] selectByName(String name) {
		// TODO Auto-generated method stub
		int j = 0;
		Product[] x = new Product[cnt];
		for (int i = 0; i < cnt; i++) {
			if (datas[i].getName().equals(name)) {
				x[j++] = datas[i];
			}
		}
		Product[] y = new Product[j];
		System.arraycopy(x, 0, y, 0, j);
		return y;
	}

	@Override
	public Product[] selectAll() {
		// TODO Auto-generated method stub
		Product[] x = new Product[cnt];
		System.arraycopy(datas, 0, x, 0, cnt);
		return x;
	}

	@Override
	public void updatePrice(Product p) {
		// TODO Auto-generated method stub
		Product p2 = selectByNum(p.getNum());

		if (p2 == null) {
			System.out.println("없는 제품입니다.");
		} else {
			p2.setPrice(p.getPrice());
		}
	}

	@Override
	public boolean in_out(Product p) {
		// TODO Auto-generated method stub
		Product p2 = selectByNum(p.getNum());
		if (p2 == null) {
			System.out.println("없는 제품입니다." + p.getName() + " 제품을 취소 합니다.");
			return false;
		} else {
			switch (p.getName()) {
			case "in":
				p2.setAmount(p2.getAmount() + p.getAmount());
				break;
			case "out":
				if (p2.getAmount() > p.getAmount()) {
					p2.setAmount(p2.getAmount() - p.getAmount());
				} else {
					System.out.println("수량이 부족합니다.\n"+ p2.getName() +"제품의 출고를 취소합니다.\n");
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		int idx = getIdByNum(num);
		
		if (idx < 0) {
			System.out.println("없는 제품 입니다. 삭제를  취소합니다.");
		} else {
			for (int i = idx; i < cnt - 1; i++) {
				datas[i] = datas[i + 1];
			}
			cnt--;
		}
	}

}
