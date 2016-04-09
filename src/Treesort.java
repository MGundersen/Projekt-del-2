/*
        MADE BY MATHIAS GUNDERSEN, D3 AND DANIEL JØRGENSEN, D3
*/
import java.util.Scanner;

public class Treesort {

    //Instantiates our DictBinTree for the use of the methods etc.
    private static DictBinTree dbt = new DictBinTree();

    public static void main(String[] args) {

        int n;
        //Scans our our input for integers, and inserts them into our tree
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            insert(n);
        }

        //Call our outer method orderedTraversal
        orderedTraversal();


    }


    //Calls our DictBinTree insert and thereby inserts and element with the inputted key
    public static void insert(Integer key) {
        dbt.insert( new Element(key));
    }

    //Calls our inner method orderedTraversal and gets an array of Integers in return, which is the keys from all the elemnts in our list
    public static void orderedTraversal() {
        //Prints size of our tree
        System.out.println("\nSize: " + dbt.size);

        //Creates an array for the inner orderedTraversal to use with the same size as our tree(nr. of elements)
        dbt.anArray = new int[dbt.size];

        //Calls our inner method orderedTraversal and gives it a start input, so it starts from the top(the header/root)
        dbt.orderedTraversal(dbt.header);

        //Prints the values of the keys that the inner orderedTraversal had just sorted into an array of integers
        for ( int i = 0; i < dbt.size; i++)
            System.out.println(dbt.anArray[i]);
    }

}
