class insta{
    void profilename(){
        System.out.println("kaushik_08_");
    }
}

class profile extends insta{
    void bio(){
        System.out.println("Unlucky$");
    }
}

class mesg extends profile{
    void status(){
        System.out.println("public_figure");
    }
}

class account{
    public static void main(String[] args) {
        mesg obj = new mesg();
        obj.profilename();
        obj.bio();
        obj.status();
    }
}
