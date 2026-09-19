# Two Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of two distinct elements whose sum equals `target`. Assume exactly one valid answer exists.

## Example

```text
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
```

## Brute-Force Approach

Check every pair. This takes `O(n²)` time and `O(1)` auxiliary space.

## Optimized Approach

Store each visited value and its index in a hash map. For the current value `x`, look for `target - x` before inserting `x`.

### Dry Run

| Index | Value | Needed | Map before check | Result |
|---:|---:|---:|---|---|
| 0 | 2 | 7 | `{}` | Store `2 → 0` |
| 1 | 7 | 2 | `{2=0}` | Return `[0, 1]` |

## Complexity

- Time: `O(n)` average
- Auxiliary space: `O(n)`

## Implementation

- [Java solution](Solution.java)

## Edge Cases

- Negative values
- Duplicate values
- Answer located at the beginning or end

## Interview Follow-ups

1. How would you solve this if the array were sorted?
2. How would you return all unique pairs?
3. What changes if no solution is guaranteed?
