package design.patterns.creational.abstractfactory;

/**
 * Date: 2019/3/27
 * Time: 22:05
 * User: Driss.
 */
public class PythonCourseFactory implements CourseFactory {

    public Vedio getVedio() {
        return new PythonVedio();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
