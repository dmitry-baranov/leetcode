package solution5

import spock.lang.Specification

class SolutionTest extends Specification {


    def solution = new Solution()

    def "LongestPalindrome"() {
        when:
        def result = solution.longestPalindrome("cbbd")
        then:
        result == "bb"
    }
}
