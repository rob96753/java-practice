package tech.robnelson.demo;

public class StringEquality {
    public static void main(String[] args) {
        String literalA = "abc";
        String literalB = "abc";
        String objectA = new String("abc");
        String objectB = new String("abc");

        System.out.println("Literal A == Literal B " + (literalA == literalB)  + " true because the literals are compared."    );

        System.out.println("Object A == Object B " + (objectA == objectB) + " this will be false becaue the memory location is different."      );

        System.out.println("Object A .equals Object B " + (objectA.equals(objectB)) + " this will be true becaue the literal value is checked."      );
    }

}