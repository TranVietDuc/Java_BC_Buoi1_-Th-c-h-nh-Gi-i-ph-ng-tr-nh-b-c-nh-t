import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolve");
        System.out.println("Given a equation as 'a* x + b = c',Please enter constant");
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if(a!= 0){
            double solution  = c-b/a;
            System.out.println("The solution is:" + solution);
        }
        else{
            if(b ==0){
                System.out.println("The solution is all x!");

            }
            else {
                System.out.println("No solution!");
            }
        }

    }
}
