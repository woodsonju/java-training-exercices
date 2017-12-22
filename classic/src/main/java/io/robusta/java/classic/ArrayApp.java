package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



    String[] buildEmptyArray(int size){
    	String [] result = new String [size];
        return result;
    }

    int[] buildArray(int a, int b, int c){
    	
    	int [] result = new int[3];
    	result[0] = a;
    	result[1] = b;
    	result[2] = c;

        return result;
    }


    boolean equality(int[] array1, int[] array2){
    	
    	boolean result = false  ;
    	
    	//Si les élements du tableau sont égaux
    	if(array1.length == array2.length)
    	{
    		//On parcours le tableau
    		for(int i = 0; i<array1.length; i++)
    		{	
    			//Si l'élement i du tableau 1  = l'élement i du tableau 2
    			if(array1[i] == array2[i])
    			{
    				result = true; //On retourne true
    			}
    			else 
    				result = false;  //On retourne false
    		}
    		
    	}
    	return result;

    }

    String asString (int [] numbers){
    	String result = "";
     	for(int i = 0; i < numbers.length; i++)
     	{
     		result += numbers[i] + ":";
     	}
        return result;
    }
    

    String asStringJoin (int [] numbers){
    	String result = "";
    	
    	for(int i = 0; i < numbers.length -1 ; i++)
     	{
     		result += numbers[i] + ":";
     	}
    	result += numbers[numbers.length-1]; //J'ajoute la derniere valeur du tableau
        return result;
    }

    String asString (String [] strings){
    	String result = "";
    	
    	for(int i = 0; i < strings.length - 1; i++)
     	{
     		result += strings[i] + " ";
     	}
    	result += strings[strings.length-1]; //J'ajoute la derniere valeur du tableau
        return result;
    }

    String asString (Card [] cards){
        return null;
    }

}
