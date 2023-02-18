package solution3

import spock.lang.Specification

class SolutionTest extends Specification {

    def solution = new Solution()

    def "TwoSum"() {
        when:
        def result = solution.lengthOfLongestSubstring("abcabcbb")
        then:
        result == 3

    }
}
