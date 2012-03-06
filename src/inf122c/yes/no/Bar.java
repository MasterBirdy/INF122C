package inf122c.yes.no;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Bar {
	
	  private final FooInterface foo;
	  
	  @Inject
	  public Bar(FooInterface foo) {
	    this.foo = foo;
	  }

	  public int fooMe(){
		  return foo.foo();
	  }
	  
	  public String seeCheese(){
		  return foo.returnCheese();
	  }
	}