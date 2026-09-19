# Time and Space Complexity

Complexity analysis describes how an algorithm's resource usage grows as input size `n` increases.

## Common Time Complexities

| Complexity | Typical example | General scalability |
|---|---|---|
| `O(1)` | Array access | Excellent |
| `O(log n)` | Binary search | Excellent |
| `O(n)` | Linear traversal | Good |
| `O(n log n)` | Merge sort | Good |
| `O(n²)` | Nested full traversal | Limited |
| `O(2ⁿ)` | Subset recursion | Poor for large `n` |

## Example

```java
for (int value : nums) {
    System.out.println(value);
}
```

The loop visits every element once, so its time complexity is `O(n)`. It uses no data structure that grows with `n`, so its auxiliary space is `O(1)`.

## Interview Checklist

- State time and auxiliary-space complexity separately.
- Explain the worst case unless the interviewer requests another case.
- Include recursion-stack space where applicable.
- Use constraints to verify that the solution is practical.
