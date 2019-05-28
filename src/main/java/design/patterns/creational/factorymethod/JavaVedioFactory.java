package design.patterns.creational.factorymethod;

/**
 * Date: 2019/3/25
 * Time: 10:29
 * User: Driss.
 */
public class JavaVedioFactory extends VedioFactory {
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
