class hybrid {
        public void language(){
            System.out.println("namaskaram");
        }
     }
     class english extends  hybrid{
        @Override
        public void language(){
            System.out.println("hello");
        }
     }
     class tamil extends hybrid{
        @Override
        public void language(){
            System.out.println();
        }
     }
     class every extends  english{
        @Override
        public void language(){
            System.out.println("Vanakam");
        }
        public static void main(String[] args) {
            every obj = new every();
            obj.language();
        }
     }

