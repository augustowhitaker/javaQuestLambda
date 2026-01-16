package exercicio01.src;

public class Cachorro implements Animal {
    
   public void comer(){
        System.out.println("Comendo ração");
    }
    
    @Override
    public void dormir() {
        System.out.println("Dormindo");
        
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au");
        
   }
}
