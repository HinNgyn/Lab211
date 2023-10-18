package view;
public abstract class Menu{
    public abstract void execute();
    
    public void run(){
        System.out.println("======= Calculator Search Program ========");
        execute();
    }
}
