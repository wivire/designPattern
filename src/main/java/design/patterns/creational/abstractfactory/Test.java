package design.patterns.creational.abstractfactory;

import org.sqlite.SQLiteConnection;

import java.sql.SQLException;

/**
 * Date: 2019/3/27
 * Time: 22:16
 * User: Driss.
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Vedio vedio = javaCourseFactory.getVedio();
        Article article = javaCourseFactory.getArticle();
        vedio.produce();
        article.produce();


        SQLiteConnection sqLiteConnection = new SQLiteConnection("", "");
        sqLiteConnection.createStatement();
    }
}
