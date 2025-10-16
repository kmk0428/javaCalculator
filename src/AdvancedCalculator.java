public class AdvancedCalculator extends Calculator {
//    계산기 v2.0 개발
//    이슈 : https://github.com/kmk0428/javaCalculator/issues/1

//    곱셈 연산자로 곱셈 구현 완료
//    이슈 : https://github.com/kmk0428/javaCalculator/issues/2
    @Override
    public int multiply() {
        result = num1 * num2;
        return result;
    }

//    나눗셈 연산자로 나눗셈 구현 완료
//    이슈 : https://github.com/kmk0428/javaCalculator/issues/3
    @Override
    public int divide() {
        result = num1 / num2;
        return result;
    }
}
