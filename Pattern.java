// Renee Rosenheim
// 11/13/25
// This program creates different patterns based on an input value
public class Pattern{
// An integer must be input
// Integer must be greater than zero
// A triangle of stars will be printed
public static void stars(int rows){
    int i = 0;
    String star = "*";
    while (i < rows){
        System.out.println(star);
        star = star + "**";
        i++;
}
}
// An integer must be input
// Integer must be greater than zero
// A triangle of numbers one through the input integer will be printed
public static void triangle(int rows){
        int i = 0;
    while (i < rows){
        int j = 0;
        while (j <= i){
        System.out.print(i + 1);
        j++;    
    }
    System.out.println();
        i++;
}
}
// An integer must be input
// Integer must be greater than zero
// A triangle of the odd numbers from the input integer through one will be printed
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
// An integer must be input
// Integer must be greater than zero
// A triangle that switches between E and O each line will be printer
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
        if(letter == "O"){
            letter = "E";
        }
        else{
            letter = "O";
        }
        i--;
    }
    }
// An integer must be input
// Integer must be greater than zero
// A centered triangle from one through the input integer will be printer
public static void pyramid(int rows){
                int i = rows;
                int num = 1;
                String space = "";
        while (i - 1 < rows && i > 0){
        int j = 0;
        System.out.print(space);
        space = space + " ";
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
public static void main(String[]args){
    stars(7);
    triangle(9);
    odds(9);
    eo(5);
    eo(6);
    pyramid(5);
}
}