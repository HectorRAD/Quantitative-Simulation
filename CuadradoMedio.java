public class CuadradoMedio{

    public static void generar(int sem, int iter){
        for(int i = 0; i < iter; i++){
            sem = nuevaSem(sem);
        }

        System.out.println("Numero final: " + Math.pow(sem, 2));
        
    }

    public static int nuevaSem(int sem){
        int sem2 = (int)Math.pow(sem,2);
        String semStr = Integer.toString(sem2); 
        StringBuilder sb = new StringBuilder(String.valueOf(sem2).length());
   
        for (int i = 0; i < String.valueOf(sem2).length(); i++){
            if(i!=0 && i<4){
                sb.append(semStr.charAt(i)); 
            }
        }
        String str =  sb.toString();
        int nuevaSem = Integer.parseInt(str);
        System.out.println("Semilla: " + nuevaSem);
        return nuevaSem; 
    }
    
    public static void main(String[] args) {
        generar(154,11);
    }
    

}