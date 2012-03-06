package inf122c.yes.no;

public class Foo implements FooInterface {
	
	private Cheese cheese;

	@Override
	public int foo() {
		return 1;
	}

	@Override
	public String returnCheese() {
		return cheese.getCheese();
	}

	@Override
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
		
	}
	
}
