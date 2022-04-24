package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExсeptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обробляємо " +
                "виключення при спробі отримати книгу/журнал");
        System.out.println("----------------------------------");
    }
}
