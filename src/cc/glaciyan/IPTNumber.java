package cc.glaciyan;

public record IPTNumber(int value) implements IPTAny, IPTHasValue<Integer> {
    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue().toString();
    }
}
