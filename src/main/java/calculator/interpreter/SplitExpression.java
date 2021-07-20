package calculator.interpreter;

import calculator.utils.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitExpression {

    private static final Pattern EXPRESSION_PATTERN = Pattern.compile("(.+)\\s([+\\-*/])\\s(-?\\d+)");
    private static final int SUB_EXPRESSION_GROUP_INDEX = 1;
    private static final int OPERATOR_GROUP_INDEX = 2;
    private static final int OPERAND_GROUP_INDEX = 3;

    private final Matcher matcher;

    public SplitExpression(String expression) {
        validate(expression);

        this.matcher = EXPRESSION_PATTERN.matcher(expression);
        this.matcher.matches();
    }

    private void validate(String expression) {
        if (StringUtils.isEmpty(expression)) {
            throw new IllegalArgumentException("Input expression is null or empty");
        }
    }

    public String getSubExpressionString() {
        return matcher.group(SUB_EXPRESSION_GROUP_INDEX);
    }

    public String getOperatorString() {
        return matcher.group(OPERATOR_GROUP_INDEX);
    }

    public String getOperandString() {
        return matcher.group(OPERAND_GROUP_INDEX);
    }

    public boolean isArithmeticExpression() {
        return matcher.matches();
    }
}
