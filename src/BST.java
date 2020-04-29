import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BST {
    public static void main(String[] args) throws FileNotFoundException {
        BinaryTree tree = new BinaryTree();
        readSets(tree);

        System.out.print("PostOrder: ");
        tree.printPostOrder();
        System.out.println();
        System.out.print("InOrder: ");
        tree.printInOrder();
        System.out.println();
        System.out.print("PreOrder: ");
        tree.printPreOrder();
    }
    public static void readSets(BinaryTree tree) throws FileNotFoundException {

        Scanner readData = new Scanner(System.in);

        System.out.println("Please enter a set of numbers: ");

        while(readData.hasNext()){
            int numbers = readData.nextInt();
            if(numbers != -999){
                tree.insertNode(numbers);
            }else{
                return;
            }
        }
        readData.close();

        /* String line;
         File data = new File("data.txt");
         Scanner readFile = new Scanner(data);

         while(readFile.hasNext()){

            line = readFile.nextLine();
            String[] tokens = line.split(" ");

            for (String token : tokens) {
                System.out.println(token);
                if(Integer.parseInt(token) != -999){
                    tree.insert(Integer.parseInt(token));
                }
          }
        }
        readFile.close();*/
    }

}
