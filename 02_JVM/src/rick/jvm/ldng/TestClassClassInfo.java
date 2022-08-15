package rick.jvm.ldng;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClassClassInfo {
	
	public static void main(String[] args) {
		Raghu r=new Raghu();
		Class c=r.getClass();
		System.out.println("Class Class name :"+c.getName());
		Method m[]= c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println("Method ["+i+"] :"+m[i]);
		}
		Field f[]=c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			System.out.println("Field ["+i+"] :"+f[i]);
		}
	}

}
