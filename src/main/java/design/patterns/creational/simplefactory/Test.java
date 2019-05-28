package design.patterns.creational.simplefactory;

/**
 * Date: 2019/3/22
 * Time: 11:03
 * User: Driss.
 */
public class Test {
    public static void main(String[] args) {
//        VedioFactory vedioFactory = new VedioFactory();
//        Vedio javaVedio = vedioFactory.getVedio("java");
//        if(javaVedio == null)
//            return;
//        javaVedio.produce();

        VedioFactory vedioFactory = new VedioFactory();
        Vedio javaVedio = vedioFactory.getVedio(JavaVedio.class);

        if (javaVedio == null)
            return;
        javaVedio.produce();
    }
}
