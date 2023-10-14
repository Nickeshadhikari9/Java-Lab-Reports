 class Method {
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }

        public void instanceMethod() {
            System.out.println("This is an instance method.");
        }
    }
        public class Lab9_staticAndInstanceMethod {
        public static void main(String[] args) {
            Method.staticMethod();
            Method demoObject = new Method();
            demoObject.instanceMethod();
        }
    }


