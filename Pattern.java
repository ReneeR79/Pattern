public class Pattern{
public static void stars(int rows){
    int i = 0;
    String star = "*";
    while (i < rows){
        System.out.println(star);
        star = star + "**";
        i++;
}
}

public static void triangle(int rows){
        int i = 0;
    while (i < rows){
        int j = 0;
        while (j < i){
        System.out.print(i + 1);
        j++;    
    }
    System.out.println();
        i++;
}
}

public static void odds(int start){
            int i = start;
        while (i - 1 < start && i > 0){
        int j = 0;
        while (j < i){
        if (i % 2 == 1){
            System.out.print(i);
        }
        j++;    
    }
    if (i % 2 == 1){
            System.out.println();
        }
        i--;
}
}


public static void eo(int maxE){
        int i = 1;
   String letter = "E";
   if(maxE%2==0){
    letter = "O";
   }
    while (i <= maxE){
        for(int j =0; j<i; j++){
            System.out.print(letter);
        }
        System.out.println();
        //swap the letter to the other letter
        if(letter == "O"){
            letter = "E";
        }
        else{
            letter = "O";
        }
        i++;
}
i = maxE - 1;
    while (i > 0){
        for(int j =0; j<i; j++){
            System.out.print(letter);
        }
        System.out.println();
        //swap the letter to the other letter
        if(letter == "O"){
            letter = "E";
        }
        else{
            letter = "O";
        }
        i--;
    }
    }

//Uses  loops of your choice to print out the following pattern (shown here with maxE equal to 6):


//Please note that if given an odd input you’ll need to start the first row with an “E” instead of an “O”, for example maxE = 5



//Create a method with the signature:
public static void pyramid(int rows){
                int i = rows;
                int num = 1;
        while (i - 1 < rows && i > 0){
        int j = 0;
        System.out.print(num);
        while (j < i-1){
            System.out.print(num);
            System.out.print(num);
        j++;    
    }
    System.out.println();
    num = num + 1;
        i--;
}
}

//Using loops of your choice print the pattern below (shown here with five rows):

public static void main(String[]args){
    pyramid(6);
}


}

