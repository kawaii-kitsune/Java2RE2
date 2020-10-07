package javaapplication1;
import javaapplication1.card;
/**
 *
 * @author babis
 */
public final class deck{
    card[][] array;
    int arrayI[],i,j;
    public deck(){
    Construct();
    }
    public void Construct(){
        array = new card[4][13];
        for(i=0;i<4;i++){
         for(j=0;j<13;j++){
             switch(i){
                case 0:
                        array[i][j]= new card(j,"$");
                        break;                   
                case 1:
                        array[i][j]= new card(j,"&");
                        break;                    
                case 2:
                        array[i][j]= new card(j,"#"); 
                        break;                    
                case 3:
                        array[i][j]= new card(j,"%");
                        break;                    
                default:

                }  
            }
        }
    }
}

