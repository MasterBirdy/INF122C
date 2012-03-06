package inf122c.yes.no;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class FooProvider implements Provider<Foo>{
	private final Cheese cheese;

	  @Inject
	  public FooProvider (Cheese cheese) {
	    this.cheese = cheese;
	  }

	@Override
	public Foo get() {
		Foo foo = new Foo();
		foo.setCheese(cheese);
		return foo;
	}

}
