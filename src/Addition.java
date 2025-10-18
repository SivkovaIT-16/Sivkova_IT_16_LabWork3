public class Addition {
    interface SummVal {
        double toDouble();
    }

    public class FractionVal implements SummVal {
        private Fraction value;

        public FractionVal(int numerator, int denominator) {
            this.value = new Fraction(numerator, denominator);
        }

        @Override
        public double toDouble() {
            return (double) value.getNumerator() / value.getDenominator();
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    class IntegerVal implements SummVal {
        private int value;

        public IntegerVal(int value) {
            this.value = value;
        }

        @Override
        public double toDouble() {
            return (double) value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }

    class DoubleVal implements SummVal {
        private double value;

        public DoubleVal(double value) {
            this.value = value;
        }

        @Override
        public double toDouble() {
            return value;
        }

        @Override
        public String toString() {
            return Double.toString(value);
        }
    }

    public static SummVal createFraction(int numerator, int denominator) {
        Addition addition = new Addition();
        return addition.new FractionVal(numerator, denominator);
    }

    public static SummVal createInteger(int value) {
        Addition addition = new Addition();
        return addition.new IntegerVal(value);
    }

    public static SummVal createDouble(double value) {
        Addition addition = new Addition();
        return addition.new DoubleVal(value);
    }

    public static double sum(SummVal... values) {
        double result = 0;
        for (SummVal val : values) {
            result += val.toDouble();
        }
        return result;
    }
}
