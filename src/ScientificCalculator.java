public class ScientificCalculator extends AdvancedCalculator{
//    계산기 v3.0 개발
//    잉슈 : https://github.com/kmk0428/javaCalculator/issues/8

//    제곱 연산 기능 개발 완료
//    이슈 : https://github.com/kmk0428/javaCalculator/issues/9
    public int exponentiation() {

        result = num1;
        for (int i = 1; i < num2; i++) {
            result *= num1;
        }

        return result;
    }
}
