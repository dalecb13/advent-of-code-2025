# Day 01

## Part 2

Like Part 1, but count whenever any click causes the dial to get set to 0.

I can use the solution from Part 1, but I have to test each increment if it sets the dial to 0.

Likely I would use a for loop to check if the dial gets set to 0.

For example, for `.rotateRight(int distance)`, I would use:

```java
for (let i = 0; i < distance; i++) {
    dialPosition++;

    if (dialPosition == 100) {
        dialPosition = 0;
        numZeroes++;
    }
}
```

I would also use a static variable for `numZeroes` so that I do not have to return it at the end of either `.rotateRight()` or `.rotateLeft()` methods. However, that would make testing more difficult, so I could return a `Pair` instead. That `Pair` would contain both the dial's updated position as well as the number of times the dial got set to 0.

### First Attempt

I did some simple changes and I got 6504, which is too large.

I even wrote a unit test that walks through the sample, and it ran successfully.

However I realize I haven't considered certain edge cases, such as when the instruction is to turn the dial larger `Math.abs(100)` clicks.
