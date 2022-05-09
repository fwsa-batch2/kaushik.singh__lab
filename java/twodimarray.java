class twodi{
    public static void main(String[] args) {  
                int[][] a = {
                    {1, 2, 3}, 
                    {4, 5, 6},
                    {13, 11, 15}
                };
                for (int i=1;i<a.length;i++){
                    for (int j=1;j<a[i].length;j++){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }       
            }
}