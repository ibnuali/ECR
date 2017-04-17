package jboos.common;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.JavaUnit;
import org.jboss.forge.roaster.model.source.JavaClassSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roaster.parse(JavaClassSource.class, "public class HelloWorld {}");
		System.out.println(Roaster.class.getName());
		
		String javaCode = "public class MyClass{ private String field, String price;} public class AnotherClass {}";

		JavaUnit unit = Roaster.parseUnit(javaCode);
		System.out.println();
	}

}
