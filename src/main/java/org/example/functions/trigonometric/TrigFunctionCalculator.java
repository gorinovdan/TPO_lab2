package org.example.functions.trigonometric;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TrigFunctionCalculator extends TrigFunction {
    private final Sin sin;
    private final Cos cos;
    private final Cot cot;

    public TrigFunctionCalculator() {
        this.sin = new Sin();
        this.cos = new Cos();
        this.cot = new Cot();
    }

    @Override
    public Double calculateValue(Double x, Double eps) {
        double sinResult = sin.checkAndCalculate(x, eps);
        double cosResult = cos.checkAndCalculate(x, eps);
        double cotResult = cot.checkAndCalculate(x, eps);

        double result = cotResult * cotResult;
        if (Double.isNaN(result)) throw new IllegalArgumentException("ODZ exception!");

        return result;
    }
}
