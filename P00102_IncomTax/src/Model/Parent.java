/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Parent {
    private int sex;
    private int age;
    private int deduction;

    public Parent() {
    }

    public Parent(int sex, int age, int deduction) {
        this.sex = sex;
        this.age = age;
        this.deduction = deduction;
    }

    public int getSex() {
        return sex;
    }

    public void setIsSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }
    
    
}