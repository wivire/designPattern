package design.patterns.creational.factorymethod;

/**
 * Date: 2019/3/25
 * Time: 10:32
 * User: Driss.
 */
public class FEVedioFactory extends VedioFactory {
    public Vedio getVedio() {
        return new FEVedio();
    }
}
