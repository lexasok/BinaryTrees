import java.util.Random;

public class Testers {

    //random ints
    public static int randomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + 1;
    }

    //random BinarySearchTreas

    public static void checkIsEmpty(Tree tree) throws Exception {
        if (tree instanceof EmptyBST) {
            if (!tree.isEmpty()) {
                throw new Exception("Something wrong!");
            }
        } else if (tree instanceof NonEmptyBST) {
            if (tree.isEmpty()) {
                throw new Exception("Something wrong!");
            }
        }
    }

    public static void checkAddMemberCardinality(Tree tree, int x) throws Exception {
        int nT = tree.add(x).cardinality();
        if (nT == tree.cardinality() + 1) {
            if (tree.member(x)) {
                throw new Exception("Shit! The cardinality increased by 1, but it should not have been!");
            }
        } else if (nT == tree.cardinality()) {
            if (!tree.member(x)) {
                throw new Exception("F@ck! The cardinality didn't increased by 1, but it had to!");
            }
        } else {
            throw new Exception("Schize! Something wrong!");
        }
        System.out.println("Test passed");
    }

    public static void main(String[] args) throws Exception {
        EmptyBST emptyBST = new EmptyBST();
        NonEmptyBST nonEmptyBST = new NonEmptyBST(34);
        checkIsEmpty(emptyBST);
        checkIsEmpty(nonEmptyBST);

        checkAddMemberCardinality(emptyBST, 5);
        checkAddMemberCardinality(nonEmptyBST,5);
        checkAddMemberCardinality(nonEmptyBST,34);


    }
}
