package design.patterns.creational.abstractfactory;

/**
 * Date: 2019/3/27
 * Time: 22:02
 * User: Driss.
 */
public class JavaCourseFactory implements CourseFactory {
    public Vedio getVedio() {
        return new JavaVedio();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
