Consider the number 8, which is a power of 2. In binary representation, 8 is `1000`. Now, let's subtract 1 from 8:

```
  1000 (8)
- 0001 (1)
-------
  0111 (7)
```

As you can see, when you subtract 1 from 8, all the bits to the right of the rightmost set bit (the bit representing 2^3) become 1. This is because when you subtract 1 from a number, if there are trailing 0s, they become 1s, and the rightmost set bit becomes 0. 

Now, let's perform a bitwise AND operation between 8 and 7:

```
  1000 (8)
& 0111 (7)
-------
  0000 (0)
```

The result is 0. This is because in binary representation, the bitwise AND operation between two numbers results in a number where each bit is set to 1 only if both corresponding bits in the original numbers are 1. Since 8 and 7 have no common set bits, the result is 0.

So, when you perform a bitwise AND operation between a number and that number subtracted by 1, the result will be 0 if the original number is a power of 2. This is because a power of 2 in binary representation has only one bit set to 1, and subtracting 1 from it creates a number with all the bits to the right of the set bit set to 1. Therefore, the bitwise AND operation between the original number and the number subtracted by 1 will result in 0.
