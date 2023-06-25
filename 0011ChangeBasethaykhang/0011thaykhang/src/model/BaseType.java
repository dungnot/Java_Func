package model;

public enum BaseType {
    BINARY, DECIMAL, HEXADECIMAL, OCTAL;

    public int getIntValue() {
        switch (this) {
            case BINARY:
                return 2;
            case DECIMAL:
                return 10;
            case OCTAL:
                return 8;
            case HEXADECIMAL:
                return 16;
            default:
                throw new UnsupportedOperationException();

        }
    }
}
