public class HelloWorld{
    public static void main(String args[]){
        printTriangle();
    }
// I added loop 

    private static void printTriangle(){
        for(int i = 1; i<10; i++){
            System.out.format("%"+i+"s%n", "#");
        }
    }
}