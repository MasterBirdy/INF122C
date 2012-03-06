package inf122c.yes.no;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class FooModule extends AbstractModule {
  @Override 
  protected void configure() {
	  
    bind(FooInterface.class).toProvider(FooProvider.class);
    bind(Cheese.class).to(BleuCheese.class);
  }
}