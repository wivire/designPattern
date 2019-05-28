package design.patterns.creational.factorymethod;

/**
 * Date: 2019/3/22
 * Time: 11:03
 * User: Driss.
 */
public class Test {
    public static void main(String[] args) {
        VedioFactory vedioFactory = new JavaVedioFactory();
        Vedio vedio = vedioFactory.getVedio();
        vedio.produce();


    }
}
