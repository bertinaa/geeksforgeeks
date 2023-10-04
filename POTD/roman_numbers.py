"""
Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

"""

class Solution:
    def romanToDecimal(self, S):
        # create a hashmap to map Roman numeral characters to their values
        roman_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        result = 0
        prev_value = 0

        # Iterate through the Roman numeral string in reverse order
        for c in S[::-1]:
            value = roman_dict[c]

            if value < prev_value:
                result -= value
            else:
                result += value

            prev_value = value

        return result

# Example usage:
solution = Solution()
s = "V"
print(solution.romanToDecimal(s))  # Output: 5
