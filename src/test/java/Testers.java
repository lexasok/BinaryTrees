public class Testers {

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

    public static void main(String[] args) throws Exception {
        EmptyBST emptyBST = new EmptyBST();
        NonEmptyBST nonEmptyBST = new NonEmptyBST(34);
        checkIsEmpty(emptyBST);
        checkIsEmpty(nonEmptyBST);
    }
}
