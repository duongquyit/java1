package main1;

class Person{
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return ("Person[name=" + name + ",address=" + address + "]");
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee){
        super(name,address);
        setProgram(program);
        setYear(year);
        setFee(fee);
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public double getFee(){
        return fee;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    @Override
    public String toString(){
        return ("Student[" + super.toString() + "],program=" + program + ",year=" + year + ",fee=" + fee + "]");
    }

    private void setProgram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setFee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        setSchool(school);
        setPay(pay);
    }
    
    public String getSchool(){
        return school;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }

    private void setSchool() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return ("Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]");
    }
}

public class Main1 {

    public static void main(String[] args) {
        Person a = new Person("Nguyen Van A", "Tan Long - Huong Hoa");
        System.out.println(a.toString());
        Student a1 = new Student("Nguyen Van A", "Tan Long - Huong Hoa", "program", 2020, 3.4);
        System.out.println("Student: "
                + "name = " + a1.getName()
                + "address = " + a1.getAddress()
                + "program = " + a1.getProgram()
                + "year = " + a1.getYear()
                + "fee = " + a1.getFee());
    }

}
