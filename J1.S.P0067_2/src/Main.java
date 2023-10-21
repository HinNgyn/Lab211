
import Controller.Controller;
import Model.DataModel;
import View.View;

public class Main {

    public static void main(String[] args) {
        DataModel model = new DataModel("");
        View view = new View();
        Controller controller = new Controller(model, view);

        // Sử dụng phương thức processInput với đối số là chuỗi đầu vào
        controller.processInput("321sdhkjDFGH!@#$%^22fdsf3");
    }
}
//32hg321sdhkjDFGH!@#$%^22fdsf3fdgdf/
