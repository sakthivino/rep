class Private {
	private int data = 5;

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

public class Modifiers {

	public static void main(String[] args) {
		Private p = new Private();
		p.setData(10);
		System.out.print(p.getData());
	}

}
