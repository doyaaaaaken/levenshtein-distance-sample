Function to calculate distance between two strings.

This code is sample implementation of Levenshtein distance algorithm.
(https://en.wikipedia.org/wiki/Levenshtein_distance)
Computational complexity: O(mn)

```kotlin
assertEquals(0, checkDistance("", ""))
assertEquals(0, checkDistance("a", "a"))
assertEquals(1, checkDistance("a", "b"))
assertEquals(1, checkDistance("a", "aa"))
assertEquals(4, checkDistance("abcd", "dcba"))
```
