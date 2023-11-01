package cc.glaciyan;

import java.util.ArrayList;
import java.util.Optional;

public class IPTList implements IPTAny {
    public final ArrayList<IPTAny> values = new ArrayList<>();

    public void add(IPTAny value) {
        if (value == null) return;
        values.add(value);
    }

    public IPTAny get(int index) {
        return values.get(index);
    }

    public Optional<IPTNamed.String> getNamedString(String name) {
        return getNamed(name, IPTString.class).map(iptAny -> (IPTNamed.String) iptAny);
    }

    public Optional<IPTNamed.Number> getNamedNumber(String name) {
        return getNamed(name, IPTNumber.class).map(iptAny -> (IPTNamed.Number) iptAny);
    }

    public Optional<IPTNamed.List> getNamedList(String name) {
        return getNamed(name, IPTList.class).map(iptAny -> (IPTNamed.List) iptAny);
    }

    private <T> Optional<IPTAny> getNamed(String name, Class<T> tClass) {
        return values.stream()
                .filter(any ->
                        any instanceof IPTNamed<?> named
                                && named.getName().equals(name)
                                && named.type == tClass).findFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        values.forEach(val -> builder.append(val).append(", "));
        return builder.append("}").toString();
    }
}
