package arrayList;

import java.util.Arrays;

public class MonArrayList<T> {
Object tab[];

int indice;

    public MonArrayList() {
      
    tab = new Object[2];
    }
    
    void ensureCapacity(int newCapacity){ 
    int oldCapacity=tab.length;
        if(oldCapacity==newCapacity){
       newCapacity=(int)(oldCapacity*1.7);
        tab=Arrays.copyOf(tab, newCapacity);
        }
        
    }
    
  
  void ajouter(T t){
      ensureCapacity(indice);
      tab[indice++]=t;
      
  
}
  void affihcerArray(){
  for(int x=0;x<tab.length;x++){
      System.out.println(tab[x]);
      
  }
  } 
}
