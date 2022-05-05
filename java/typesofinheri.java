public class typesofinheri {
    String nature = "feed me water";
}

class leafe extends typesofinheri{
    String water = "I wont give water to you";
}

class air{
    public static void main(String[] args) {
        leafe obj = new leafe();
        System.out.println(obj.nature);
        System.out.println(obj.water);
    }
}


 