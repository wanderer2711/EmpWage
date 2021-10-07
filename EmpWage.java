public class EmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Emp Wage Computation");

        int EMP_CHECK = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(EMP_CHECK);
    }
}