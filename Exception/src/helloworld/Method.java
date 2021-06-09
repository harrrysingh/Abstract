package helloworld;

public class Method {
	private static final Method Method = null;

	@SuppressWarnings("unused")
	private static Method getEquals() {
		  java.lang.reflect.Method equalsMth = null;
		if (equalsMth == null) {
		    try {
		      equalsMth = Object.class.getMethod("equals", Object.class); // NOI18N
		    } catch (NoSuchMethodException e) {
		      e.printStackTrace();
		    }
		  }
		  return Method;
		}
}
