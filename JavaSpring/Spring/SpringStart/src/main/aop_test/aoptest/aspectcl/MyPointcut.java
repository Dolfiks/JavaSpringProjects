package aoptest.aspectcl;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* aoptest.Book.*(..))")
    public void allGetMethodsFromBook(){
    }


}
