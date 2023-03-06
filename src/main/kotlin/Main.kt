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

/**
 * 중복제거, 가장 첫번째 데이터 기준으로 중복 검사
 */
fun testDistinct() {
    val exCollection = listOf(0, 0, 0, 1, 1, 2, 2)
    val test = exCollection.distinct()

    test.forEach { println(">>>  $it") }
}

/**
 * 중복제거, 가장 첫번째 데이터 기준으로 중복 검사, 특정 케이스만을 대상으로 중복 제거 가능
 */
fun testDistinctBy() {
    val ex1 = TestDto(1, "test1")
    val ex2 = TestDto(1, "test2")
    val ex3 = TestDto(1, "test3")
    val ex4 = TestDto(2, "test3")

    val exCollection = listOf(ex1, ex2, ex3, ex4)

    val test = exCollection.distinctBy { it.value1 }

    test.forEach { println(">>>    " + it.value1 + " " + it.value2) }
}

class TestDto(
    val value1: Long,
    val value2: String
)
