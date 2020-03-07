package sda.JVM;

import java.util.List;
import java.util.Objects;

public class Money {

    private static final Money ZERO = new Money(0);

    private final double value;

    private Money(double value) {
        this.value = value;
    }

    public static Money of(double value) {
        return new Money(value);
    }

    public static Money zero() {
        return ZERO;
    }

    public static Money sum(List<Money> moneys) {
        Money sum = Money.zero();
        for (Money money : moneys) {
            sum = sum.add(money);
        }
        return sum;
    }

    public static Money sum(Money... moneys) {
        Money sum = Money.zero();
        for (Money money : moneys) {
            sum = sum.add(money);
        }
        return sum;
    }

    public Money add(Money other) {
        return new Money(this.value + other.value);
    }

    public Money subtract(Money other) {
        return new Money(this.value - other.value);
    }

    public Money multiply(int scalar) {
        return new Money(this.value * scalar);
    }

    public Money multiply(double scalar) {
        return new Money(this.value * scalar);
    }

    public Money divide(int scalar) throws ArithmeticException {
        if (scalar == 0) {
            throw new ArithmeticException(" / by zero");
        }
        return new Money(this.value / scalar);
    }

    public Money divide(double scalar) {
        return new Money(this.value / scalar);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

