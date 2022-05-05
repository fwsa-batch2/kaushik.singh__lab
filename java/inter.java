interface inter {
    final String ruin = "Java is a programming language";

    void qus();
}

class num1 implements inter {
    public void qus(){
        System.out.println("What is java?");
    }
}    

class ans {
    public static void main(String[] args) {
        num1 obj = new num1();
        obj.qus();
        System.out.println(obj.ruin);
    }
}

