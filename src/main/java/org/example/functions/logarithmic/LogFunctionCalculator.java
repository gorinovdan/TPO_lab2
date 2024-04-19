package org.example.functions.logarithmic;

import org.example.utils.AbstractFunction;

public class LogFunctionCalculator extends AbstractFunction {
    private final Ln ln;
    private final Log2 log2;
    private final Log3 log3;
    private final Log5 log5;

    public LogFunctionCalculator(Ln ln, Log2 log2, Log3 log3, Log5 log5) {
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
    }

    public LogFunctionCalculator() {
        this.ln = new Ln();
        this.log2 = new Log2(ln);
        this.log3 = new Log3(ln);
        this.log5 = new Log5(ln);
    }

    @Override
    public Double calculateValue(Double x, Double eps) {
        double lnResult = ln.checkAndCalculate(x, eps);
        double log2Result = log2.checkAndCalculate(x, eps);
        double log3Result = log3.checkAndCalculate(x, eps);
        double log5Result = log5.checkAndCalculate(x, eps);
        double result = Math.pow((Math.pow((lnResult / log3Result), 2) / log5Result), 2) * (log2Result + Math.pow((log5Result + log2Result), 2));
        if (Double.isNaN(result)) throw new IllegalArgumentException("ODZ exception!");
        return result;
    }
}
