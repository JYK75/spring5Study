package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println("(g1 == g2) = " + (g1 == g2)); // (g1 == g2) = true
        // 별도 설정을 하지 않을 경우 스프링은 한개의 빈 객체만을 생성하며, 빈 객체는 싱글톤(singleton) 범위를 갖는다.
        ctx.close();
    }
}
