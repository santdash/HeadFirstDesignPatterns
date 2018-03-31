package san.doubt.misc;

public class EqualsPrivateField {
    private int targetVal = 5;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqualsPrivateField that = (EqualsPrivateField) o;

        return targetVal == that.targetVal;
    }

    @Override
    public int hashCode() {
        return targetVal;
    }

}
