package advice;
import java.lang.ref.*;
import java.lang.reflect.Method;
public interface MethodBeforeAdvice {
	void before(Method method, Object[] args, Object target) throws Exception;
}
