// abstract class bike{
//     abstract void brand();
// }
// class ns extends bike{
//     void brand(){
//         System.out.println("kaushik bike"); 
//     }
 
// }

// class pulsar{
//     public static void main(String[] args) {
//         ns nakwolf = new ns();
//         nakwolf.brand();
//     }
// }



abstract class trello {
    abstract void projectReso();
    abstract void QNA();
    abstract void todo();
    abstract void pending();
    abstract void blocked();
    abstract void done();
}

class templets extends trello {
    void projectReso(){
        System.out.println("select lables ,time line ,stakeholders ,weekly updates");
    }
    void QNA(){
        System.out.println("lable:trello trip ,asking douts ,requesting");
    }
    void todo(){
        System.out.println("lable:trello trip - working on due ,lable:design team ,edit email draft ,checking cust ,set font");
    }

    void pending(){
        System.out.println("lable:trello trip waitng last step ,review ,lable:design team -social media asst");
    }

    void blocked(){
        System.out.println("lable:trello trip splash slowing team ,freelancer contracts ,budjet approval");
    }

    void done(){
        System.out.println("lable:trello trip ,finalize wrk ,submit Q1 report ,propsal");
    }
}

class team extends trello{
    void projectReso(){
        System.out.println("Process");
    }
    void QNA(){
        System.out.println("On-prosess");
    }
    void todo(){
        System.out.println("Desined");
    }
    void pending(){
        System.out.println("Done");
    }
    void blocked(){
        System.out.println("Finished");
    }
    void done(){
        System.out.println("aproved");
    }
}

class Mobiles{
    public static void main(String[] args) {
        templets direct = new templets();
        direct.blocked();
        direct.done();
        team trel = new team();
        trel.done();
    }
}



// project manaj , kanban template , simple prj , remote team hub