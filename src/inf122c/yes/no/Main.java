package inf122c.yes.no;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
	    Injector injector = Guice.createInjector(new FooModule());
	    Bar bar = injector.getInstance(Bar.class);
	    System.out.println(bar.fooMe());
	    System.out.println(bar.seeCheese());
		}
	

}
