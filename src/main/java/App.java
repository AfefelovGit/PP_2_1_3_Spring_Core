import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHello1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.printf("beanHello1.\"%s\"\n", beanHello1.getMessage());
        HelloWorld beanHello2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.printf("beanHello2.\"%s\"\n", beanHello2.getMessage());
        System.out.printf("(beanHello1 == beanHello2) = %s\n\n", (beanHello1 == beanHello2));

        Cat catOne = applicationContext.getBean("cat", Cat.class);
        System.out.printf("catOne.\"%s\"\n", catOne.getName());
        Cat catTwo = applicationContext.getBean("cat", Cat.class);
        System.out.printf("catTwo.\"%s\"\n", catTwo.getName());
        System.out.printf("(catOne == catTwo) = %s\n", (catOne == catTwo));
    }
}