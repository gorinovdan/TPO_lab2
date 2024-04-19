package org.example;

import lombok.AllArgsConstructor;
import org.example.functions.logarithmic.LogFunctionCalculator;
import org.example.functions.trigonometric.TrigFunctionCalculator;
import org.example.utils.AbstractFunction;

@AllArgsConstructor
public class MainFunction extends AbstractFunction {

    private final LogFunctionCalculator logCalculator;
    private final TrigFunctionCalculator trigCalculator;


    @Override
    public Double calculateValue(Double x, Double eps) {
        if (x > 0) {
            return logCalculator.checkAndCalculate(x, eps);
        } else {
            return trigCalculator.checkAndCalculate(x, eps);
        }
    }

}
