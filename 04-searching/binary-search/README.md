# Binary Search

## Problem Statement

Given a sorted integer array and a target, return the target's index or `-1` when it is absent.

## Approach

Maintain an inclusive search range `[left, right]`. Compare the middle element with the target and discard the half that cannot contain the target.

Use `left + (right - left) / 2` to calculate the midpoint safely.

## Complexity

- Time: `O(log n)`
- Auxiliary space: `O(1)`

## Implementation

- [Java solution](Solution.java)

## Edge Cases

- Empty array
- Single element
- Target at either boundary
- Target is absent
- Duplicate elements when a specific occurrence is required
