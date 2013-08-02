package utils;


public class Assert {
	public static void isTrue(boolean expression, String message) {
		if (!expression)
			throw new IllegalArgumentException(message);
		else
			return;
	}

	public static void isTrue(boolean expression) {
		isTrue(expression, "[Assertion failed] - this expression must be true");
	}

	public static void isNull(Object object, String message) {
		if (object != null)
			throw new IllegalArgumentException(message);
		else
			return;
	}

	public static void isNull(Object object) {
		isNull(object, "[Assertion failed] - the object argument must be null");
	}

	public static void notNull(Object object, String message) {
		if (object == null)
			throw new IllegalArgumentException(message);
		else
			return;
	}

	public static void notNull(Object object) {
		notNull(object, "[Assertion failed] - this argument is required; it must not be null");
	}

	public static void noNullElements(Object array[], String message) {
		if (array != null) {
			for (int i = 0; i < array.length; i++)
				if (array[i] == null)
					throw new IllegalArgumentException(message);

		}
	}

	public static void noNullElements(Object array[]) {
		noNullElements(array, "[Assertion failed] - this array must not contain any null elements");
	}

	public static void isInstanceOf(Class clazz, Object obj) {
		isInstanceOf(clazz, obj, "");
	}

	public static void isInstanceOf(Class type, Object obj, String message) {
		notNull(type, "Type to check against must not be null");
		if (!type.isInstance(obj))
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(message))).append("Object of class [")
					.append(obj == null ? "null" : obj.getClass().getName()).append("] must be an instance of ").append(type).toString());
		else
			return;
	}

	public static void isAssignable(Class superType, Class subType) {
		isAssignable(superType, subType, "");
	}

	public static void isAssignable(Class superType, Class subType, String message) {
		notNull(superType, "Type to check against must not be null");
		if (subType == null || !superType.isAssignableFrom(subType))
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(message))).append(subType).append(" is not assignable to ")
					.append(superType).toString());
		else
			return;
	}

	public static void state(boolean expression, String message) {
		if (!expression)
			throw new IllegalStateException(message);
		else
			return;
	}

	public static void state(boolean expression) {
		state(expression, "[Assertion failed] - this state invariant must be true");
	}
}
