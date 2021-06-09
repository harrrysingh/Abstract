package helloworld;

import java.text.Format.Field;

@SuppressWarnings("unused")
public class NoSuchFileException {

	public Object getVariableValue(Object clazz, String variableName) {
	    try {
	        java.lang.reflect.Field field = clazz.getClass().getField(variableName);
	        return field.get(clazz);
	    } catch (NoSuchFieldException e) {
	        return "";
	    } catch (IllegalAccessException e) {
	        return "";
	    }

	}
}
