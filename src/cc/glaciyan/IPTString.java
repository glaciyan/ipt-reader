package cc.glaciyan;

public record IPTString(String value) implements IPTAny, IPTHasValue<String> {
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
