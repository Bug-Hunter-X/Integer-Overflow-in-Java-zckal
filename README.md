# Integer Overflow Bug in Java

This repository demonstrates a common yet often overlooked bug in Java: integer overflow.  When you increment a variable that's already at its maximum value, it wraps around to its minimum value. This can lead to unexpected and difficult-to-debug errors.

The `UncommonBug.java` file contains the code exhibiting the problem.  The solution, `UncommonBugSolution.java`, offers strategies to mitigate this issue.

This is a simple example, but integer overflow can have significant consequences in applications dealing with large numerical values or counters.