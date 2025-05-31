package oop.annotationx.method;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class B {
  @SuppressWarnings(value = "unchecked")
  public static <T> T createProxy(T object1) {
    return (T) Proxy.newProxyInstance(
        object1.getClass().getClassLoader(),
        object1.getClass().getInterfaces(),
        (proxy, method, args) -> {
          Method realMethod = object1.getClass().getMethod(method.getName(), method.getParameterTypes());
          Object result = method.invoke(object1, args);
          if (realMethod.isAnnotationPresent(A.class)) {
            A annotation = realMethod.getAnnotation(A.class);
            System.out.println(annotation.param1());
          }
          return result;
        }
    );
  }
}