public class VariableScoping {
    public static void main(String[] args) {
        int a = 6;
        {
            int b = 23;
            {
                int c = 42;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c); //Fehler
        }
        System.out.println(a);
        System.out.println(b); //Fehler
        System.out.println(c); //Fehler
    }
}