package design.patterns.creational.simplefactory;

/**
 * Date: 2019/3/22
 * Time: 11:13
 * User: Driss.
 */
public class VedioFactory {

//    public Vedio getVedio(String type){
//        if("java".equalsIgnoreCase(type)){
//            return  new JavaVedio();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVedio();
//        }
//        return null;
//    }


    public Vedio getVedio(Class c) {
        Vedio vedio = null;
        try {
            vedio = (Vedio) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return vedio;
    }
}
