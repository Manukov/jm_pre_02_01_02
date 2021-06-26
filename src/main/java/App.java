import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =(HelloWorld) applicationContext.getBean("helloworld");
        if(bean == bean2) {
            System.out.println("bean и bean2: ссылки равны");
        } else {
            System.out.println("bean и bean2: ссылки не равны");
        }

        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");

        if(catBeanOne == catBeanTwo) {
            System.out.println("Это один и тот же кот");
        } else {
            System.out.println("Это разные коты");
        }
    }
}