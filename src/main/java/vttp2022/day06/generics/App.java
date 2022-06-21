package vttp2022.day06.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main( String[] args ) {

        // This is usually how we set strings
        BoxString boxOfStrings = new BoxString();
        boxOfStrings.setContent("This is a string");
        System.out.println(boxOfStrings.getContent());

        boxOfStrings.setContent("false");
        System.out.println(boxOfStrings.getContent());

        // Box is a type Object hence it can contain anything
        Box boxOfInts = new Box();
        boxOfInts.setContent(3);

        // No type checking for box, because the
        // Content member is Object 
        boxOfInts.setContent(boxOfStrings);

        // Generics
        BoxG<Integer> bInt = new BoxG<>();
        bInt.setContent(10);
        System.out.println(bInt.getContent());

        BoxG<String> bStr = new BoxG<String>();
        bStr.setContent("Potato");
        System.out.println(bStr.getContent());

        // Type List of Strings
        // Box contains just ONE List of Strings
        BoxG<List<String>> bListStr = new BoxG<>();
        List<String> myListOfStr = new ArrayList<>();
        myListOfStr.add("First String");
        myListOfStr.add("Second String");
        bListStr.setContent(myListOfStr);
        System.out.println(bListStr.getContent().toString());

        // Box can contain a List of List of Strings
        BoxG<List<List<String>>> cListStr = new BoxG<>();
        List<String> myListOfStr1 = new ArrayList<>();
        myListOfStr1.add("First List First String");
        myListOfStr1.add("First List Second String");

        List<String> myListOfStr2 = new ArrayList<>();
        myListOfStr2.add("Second List First String");
        myListOfStr2.add("Second List Second String");

        List<List<String>> myListListString = new ArrayList<>();
        myListListString.add(myListOfStr1);
        myListListString.add(myListOfStr2);
        
        // Store everything inside the box
        cListStr.setContent(myListListString);
        System.out.println(cListStr.getContent());

        // Box of Box of Float
        BoxG<BoxG<Float>> bBoxFloat = new BoxG<>();;
        BoxG<Float> boxFloat = new BoxG<>();
        boxFloat.setContent((float) 5.95);
        bBoxFloat.setContent(boxFloat);
        System.out.println(bBoxFloat.getContent());

        // Box has type Object so it can contain any Types
        Box myBox = new Box();
        myBox.setContent("This is a String");
        Utils.printBox(myBox);

        Box myBox2 = new Box();
        myBox2.setContent(30);
        Utils.printBox(myBox2);
        
        // This is incorrect
        //bInt.setContent("contenabct");
    }
}
