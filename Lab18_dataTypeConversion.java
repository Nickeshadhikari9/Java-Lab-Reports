public class Lab18_dataTypeConversion {
    public static void main(String[] args) {
        int intValue = 42;
        Integer integerValue = intValue;
        System.out.println("Primitive to Object (Boxing): " + integerValue);

        double doubleValue = 3.14;
        Double doubleObject = doubleValue;
        System.out.println("Primitive to Object (Boxing): " + doubleObject);

        int newIntValue = integerValue;
        System.out.println("\nObject to Primitive (Unboxing): " + newIntValue);

        double newDoubleValue = doubleObject;
        System.out.println("Object to Primitive (Unboxing): " + newDoubleValue);
    }
}
