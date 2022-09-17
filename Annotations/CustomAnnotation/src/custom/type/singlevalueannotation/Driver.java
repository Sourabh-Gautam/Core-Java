package custom.type.singlevalueannotation;

import java.lang.reflect.Method;

public class Driver {
	public static void main(String[] args) throws Exception {
		Bike bike = new Bike();
		Method[] methods = bike.getClass().getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(RunAfterStart.class)) {
				RunAfterStart ri = method.getAnnotation(RunAfterStart.class);
				int[] speed = ri.speed();
				for (int i = 0; i < ri.times(); i++) {
					method.invoke(bike);
					System.out.println("Current speed : "+speed[i]);
				}
			}
		}
	}
}
