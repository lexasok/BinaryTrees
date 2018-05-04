public class Testers {

    public static void checkIsEmpty(Tree tree) {
        if (tree instanceof EmptyBST) {
            if (tree.isEmpty()) {
                System.out.println("Good, tree is an EmptyBST and it is empty!\n");
            }
        } else if (tree instanceof NonEmptyBST) {
            if (!tree.isEmpty()) {
                System.out.println("Good, tree is a NonEmptyBST and it is not empty!\n");
            }
        }
    }

    public static void main(String[] args) {

    }
}
