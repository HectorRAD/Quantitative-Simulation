public class ProductoMedio{

    public static void generar(int semX, int semY, int iter){
        for(int i = 0; i < iter; i++){
            int temp = semY;
            semY = nuevaSem(semX, semY);
            semX = temp; 
        }

        System.out.println("Numero final: " + (semX * semY));
    }

    public static int nuevaSem(int semX,int semY){
        int sem2 = semX * semY;
        String semStr = Integer.toString(sem2); 
        StringBuilder sb = new StringBuilder(String.valueOf(sem2).length());
   
        for (int i = 0; i < String.valueOf(sem2).length(); i++){
            if(i!=0 && i<4){
                sb.append(semStr.charAt(i)); 
            }
        }
        String str =  sb.toString();
        int nuevaSem = Integer.parseInt(str);
        System.out.println("Semilla nueva: " + nuevaSem);
        return nuevaSem; 
    }
    
    public static void main(String[] args) {
        generar(151,155,8);
    }
}