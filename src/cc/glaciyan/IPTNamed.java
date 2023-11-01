package cc.glaciyan;

public abstract class IPTNamed<T extends IPTAny> implements IPTAny, IPTHasValue<T> {
    private final java.lang.String name;
    public Class<T> type;
    protected final T value;

    public IPTNamed(java.lang.String name, Class<T> type, T value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public java.lang.String toString() {
        return name + " = " + value;
    }

    public java.lang.String getName() {
        return name;
    }

    public static class String extends IPTNamed<IPTString> {
        public String(java.lang.String name, IPTString value) {
            super(name, IPTString.class, value);
        }

        @Override
        public IPTString getValue() {
            return value;
        }
    }

    public static class Number extends IPTNamed<IPTNumber> {
        public Number(java.lang.String name, IPTNumber value) {
            super(name, IPTNumber.class, value);
        }

        @Override
        public IPTNumber getValue() {
            return value;
        }
    }

    public static class List extends IPTNamed<IPTList> {
        public List(java.lang.String name, IPTList value) {
            super(name, IPTList.class, value);
        }


        @Override
        public IPTList getValue() {
            return value;
        }
    }
}
