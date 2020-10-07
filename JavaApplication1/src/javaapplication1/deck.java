package javaapplication1;
import java.util.Random;
import javaapplication1.card;
/**
 *
 * @author babis
 */
public final class deck{
    card[][] array;
    int arrayI[],i,j,x;
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
    public void shuffleDeck(){
        int N = array.length;
        card temp;
        for (int i = 0; i < 4; i++) 
            { 
        for (int j = 0; j < 13; j++) 
            {
                int r = i + (int) (Math.random() * (4-i));
                int t= j+ (int) (Math.random()* (13-j));
                temp = array[r][t]; 
                array[r][t] = array[i][j]; 
                array[i][j] = temp; 
            }
         }
    }
}

