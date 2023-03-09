package aoptest.aspectcl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class aspectfst {

    @Before("aoptest.aspectcl.MyPointcut.allGetMethodsFromBook()")
    public void beforeGetBookAdvice(JoinPoint joinPoint){
        MethodSignature argJP = (MethodSignature) joinPoint.getSignature();
        System.out.println("Signature : " + argJP);

//        Object[] argumetnts = joinPoint.getArgs();    //масив обьеектов с аргументами

        System.out.println("Name: " + argJP.getName());
        System.out.println("Method : " + argJP.getMethod());
        System.out.println("Parametrs name + type : " + argJP.getParameterNames() + " " + argJP.getParameterTypes());
        System.out.println("----------------------------------------------------------------");
    }


    @AfterReturning("aoptest.aspectcl.MyPointcut.allGetMethodsFromBook()")
    public void beforeAllBookAdvice(){
        System.out.println("Log after complete method");
    }


}
