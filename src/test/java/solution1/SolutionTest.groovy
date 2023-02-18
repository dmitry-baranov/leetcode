package solution1

import spock.lang.Specification

class SolutionTest extends Specification {

    def solution = new Solution()

    def "TwoSum"() {
        when:
        def result = solution.twoSum([3, 3] as int[], 6)
        then:
        result == [0,1] as int[]

    }
}
