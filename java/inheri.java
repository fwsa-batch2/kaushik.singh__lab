public class inheri {
    String shyam = "Hello design team we have an new mentor so be ready with your portfolio";
}

class fwsa extends inheri{
    String designers = "yes anna we will be ready for everything anna";
}

class fresh {
    public static void main(String[] args) {
        fwsa obj = new fwsa();
        System.out.println(obj.shyam);
        System.out.println(obj.designers);
    }
}

// using extends..


// public class inheri {
//     String shyam = "Hello design team we have an new mentor so be ready with your portfolio";
// }

// class fwsa extends inheri{
//     String designers = "yes anna we will be ready for everything anna";

//     public void mentor(){
//         System.out.println(super.shyam);
//     }
// }

// class fresh {
//     public static void main(String[] args) {
//         fwsa obj = new fwsa();
//         // System.out.println(obj.shyam);
//         // System.out.println(obj.designers);

//         obj.mentor();
//     }
// }

// super class..