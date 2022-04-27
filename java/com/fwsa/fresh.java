package com.fwsa;

public class fresh {
    private String students;
    private int Idno;
    private int batch;
    private String coach;
    private String director;

  
    public void setstudentsname(String students){
        this.students = students;
    }

    public String getstudentsname(){
        return students;
    }

    public void setidnum(int Idno){
        this.Idno = Idno;
    }

    public int getidnum(){
        return Idno;
    }

    public void setbatchnum(int batch){
        this.batch = batch;
    }

    public int getbatchnum(){
        return batch;
    }

    public void setcoachname(String coach){
        this.coach = coach;
    }

    public String getcoachname(){
        return coach;
    }

    public void setdirector(String director){
        this.director = director;
    }

    public String getdirector(){
        return director;
    }

public class details{
    public static void main(String[] args) {
        fresh obj = new fresh();

        obj.setstudentsname("Kaushik");
        obj.setidnum(29);
        obj.setbatchnum(2);
        obj.setcoachname("chitra (tech)");
        obj.setdirector("shyam");
    
        System.out.println("The student name is " + obj.getstudentsname() + " ID " + obj.getidnum() + " batch " + obj.getbatchnum() + " coach " + obj.getcoachname() + " director " + obj.getdirector());

    }
}

}
