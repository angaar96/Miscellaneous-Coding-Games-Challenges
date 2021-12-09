# Valid Parentheses

You’re working with an intern that keeps coming to you with JavaScript code that won’t run because the braces, brackets, and parentheses are off. To save you both some time, you decide to write a braces/brackets/parentheses validator.

Let’s say:

‘(‘, ‘{‘, ‘[‘ are called “openers.”
‘)’, ‘}’, ‘]’ are called “closers.”

Write an efficient function that tells us whether or not an input string’s openers and closers are properly nested.

### Examples


Example 1:
```
Input: s = "()"
Output: true
```
Example 2:

```
Input: s = "()[]{}"
Output: true
```
Example 3:
```
Input: s = "(]"
Output: false
```
Example 4:
```
Input: s = "([)]"
Output: false
```
Example 5:
```
Input: s = "{[]}"
Output: true
```

### Constraints:
```
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
```