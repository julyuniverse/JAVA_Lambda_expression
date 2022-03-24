public class AddTest {
    public static void main(String[] args) {
        Add lambdaAdd = (x, y) -> { // 람다식 구현 완료
            return x + y;
        };

        Add lambdaAdd2 = (x, y) -> x + y; // 람다식 구현 완료

        System.out.println(lambdaAdd.add(2, 3)); // 람다식 호출
        System.out.println(lambdaAdd2.add(3, 4)); // 람다식 호출
    }
}
