package Week_13.Q_20;

public class test {
    public static void main(String[] args) {
        SolveOfQuadraticEquations solve = new SolveOfQuadraticEquations(1, 3, 1);
        SolveOfQuadraticEquations solve1 = new SolveOfQuadraticEquations(1, 2, 1);
        SolveOfQuadraticEquations solve2 = new SolveOfQuadraticEquations(1, 2, 3);

        System.out.println(solve.findTheRoots());
        System.out.println(solve1.findTheRoots());
        System.out.println(solve2.findTheRoots());

    }
}
