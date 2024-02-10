class Father extends Grandfather {
    private ComplexTypeField complexField;

    public Father(int age, ComplexTypeField complexField) {
        super(age);
        this.complexField = complexField;
    }

    public ComplexTypeField getComplexField() {
        return complexField;
    }

    public void overloadedMethod(int param) {
        System.out.println("Overloaded method with int param in Father: " + param);
    }

    public final void nonOverrideableMethod() {
        System.out.println("Non-overrideable method in Father");
    }
}
