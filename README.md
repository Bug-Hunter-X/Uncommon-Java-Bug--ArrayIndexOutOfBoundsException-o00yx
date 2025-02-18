# Uncommon Java Bug: ArrayIndexOutOfBoundsException

This repository demonstrates an uncommon error in Java programming: an `ArrayIndexOutOfBoundsException`. This exception occurs when the program tries to access an array element using an index that is outside the valid range of indices for that array.

The provided code attempts to access an element at index 5 of an array with length 5.  Since array indices start at 0, the valid indices are 0, 1, 2, 3, and 4.  Therefore, attempting to access index 5 throws an `ArrayIndexOutOfBoundsException`.

The solution demonstrates how to properly handle array accesses and avoid this type of error.