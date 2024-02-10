public class Main {
    public static void main(String[] args) {
        ComplexTypeField complexField = new ComplexTypeField();
        EnumType enumField = EnumType.VALUE1;

        Father objectA = new Father(40, complexField);
        Son objectB = new Son(20, complexField, enumField);
        Son objectC = new Son(25, complexField, enumField);

        System.out.println("ObjectA properties: Age=" + objectA.getAge());
        System.out.println("ObjectB properties: Age=" + objectB.getAge() + ", EnumField=" + objectB.getEnumField());
        System.out.println("ObjectC properties: Age=" + objectC.getAge() + ", EnumField=" + objectC.getEnumField());

        objectA.overloadedMethod(10);
        objectB.overloadedMethod(15);
        objectC.overloadedMethod(20);
        objectA.nonOverrideableMethod();
    }
}