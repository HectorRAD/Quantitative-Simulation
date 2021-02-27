public class GeneradorLineal{

    public static void generar(int sem, int a, int c, int m, int iter){
        for(int i = 0; i < iter; i++){
            sem= nuevaSem(sem, a, c, m);
        }
        System.out.println(sem);
    }

    public static int nuevaSem(int sem, int a, int c, int m){
        int nuevaSem = 0;
        int temp = sem*a+c; 
        nuevaSem = temp % m;

        System.out.println("Valor intermedio: "+ temp);

        return nuevaSem;
    }

    public static void main(String[] args) {
        generar(7,1,7,13,16);
    }

}