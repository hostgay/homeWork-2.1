final class Son extends Father {
    private EnumType enumField;

    public Son(int age, ComplexTypeField complexField, EnumType enumField) {
        super(age, complexField);
        this.enumField = enumField;
    }

    public EnumType getEnumField() {
        return enumField;
    }

    @Override
    public void overloadedMethod(int param) {
        System.out.println("Overridden method with int param in Son: " + param);
    }
}
