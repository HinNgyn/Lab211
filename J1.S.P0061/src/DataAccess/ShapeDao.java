package DataAccess;

import Common.Validation;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeDao {
    Validation validation = new Validation();

    //khai bao static instance variable 
    //bien nay se luu tru cac doi tuong duy nhat 
    private static ShapeDao instance = null;
    
    //pthuc tinh trả về đối tượng shapeDao
    //được design để access to đối tượng duy nhất 
    public static ShapeDao Instance() {
        if (instance == null) {//nghĩa là ch có đối tượng nào truy cập vào đây
            
            synchronized (ShapeDao.class) {
          //synchronized thực hiện đồng bộ hoá đối tượng
          //điều này đảm bảo một luồng cho phép truy cập cùng lúc tại thời điểm đó
          //còn những truy cập khác sẽ bị chặn 
          
                if (instance == null) {
          //sau khi đã check synchronized 
          //continue check để tạo mới đối tượng
          
                    instance = new ShapeDao();
                }
            }//ko nữa thì chờ để đảm sau này tái sdung
        }
        return instance;
    }
/*
    pthuc nay hữu ích khi ta chia sẽ các different combine
    trong ứng dụng ko cần tạo ra nhìu phiên bản
 */   
    
    
    
    public  Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = validation.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = validation.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = validation.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }
    }

    public Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = validation.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = validation.checkInputDouble();
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = validation.checkInputDouble();
        return new Circle(radius);
    }

    public void display(Rectangle rectangle, Circle circle, Triangle trigle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }
}
