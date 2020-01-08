import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class VerQuantasVezesSaiuJunto{
   public void comparar(List numerosPossiveis){
        int vezesQueSaiuJunto = 0;
        for(int i = 0; i < numerosPossiveis.size(); i++){
           
            if(numerosPossiveis.contains(1)){
                int saiuJunto = 1;
                vezesQueSaiuJunto += saiuJunto; 
            }
           
        }
        System.out.println("Vezes: " + vezesQueSaiuJunto + " - " + numerosPossiveis);
   }
   
    public void comparar2(List numerosPossiveis){
        int vezesQueSaiuJunto = 0;
        Iterator t = numerosPossiveis.iterator();
        while(t.hasNext()){
            Object element = t.next();
            System.out.println(element + " ");
        }
   }
}
