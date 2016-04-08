import java.util.ArrayList;

public class Treesort {

    public static void main(String[] args) {

        DictBinTree dbt = new DictBinTree(new Element(5));

        dbt.insert( new Element(10) );
        dbt.insert( new Element(4) );

        dbt.insert( new Element(3) );
        dbt.insert( new Element(1) );

        dbt.insert( new Element(-124) );
        dbt.insert( new Element(6) );

        dbt.insert( new Element(8) );
        dbt.insert( new Element(4) );

        dbt.insert( new Element(56) );
        dbt.insert( new Element(124) );

        dbt.insert( new Element(11) );
        dbt.insert( new Element(-56) );


        //Printer selve elementerne
        //System.out.println(dbt.orderedTraversal(dbt.header));

        //Printer elemternes keys
        ArrayList<Element> listOfElements = dbt.orderedTraversal(dbt.header);

        for ( int i = 0; i < dbt.size; i++) {
            System.out.print(listOfElements.get(i).getKey() + ", ");
        }

        //Printer size på tree
        System.out.println("\nSize: " + dbt.size);

    }

}
