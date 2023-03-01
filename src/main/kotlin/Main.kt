/**
 * Kotlin의 다양한 Collection 함수들에 대해 학습
 * - 해당 테스트에서는 Collections.kt, _Collections.kt, CollectionsJVM.kt등에 작성된 메서드에 대해 학습할 예정
 */

fun main(args: Array<String>) {
}

/**
 * 임의의 테스트 데이터 생성
 */
fun generateTestData(): List<String> {
    return (0..100000000).map { it.toString() }.shuffled()
}

/**
 * 특정 Index의 컴포넌트 조회 (_Collections.kt)
 *
 * - component1~5 까지 지원
 * - component뒤에 들어가는 숫자-1로 인덱스 조회
 */
fun testComponentMethod(data: List<String>): String {
    return data.component1()
}
