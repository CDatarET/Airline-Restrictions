# Airline-Restrictions
CodeChef Difficulty 1042 Problem

Chef's Flight Bag Constraints
Chef plans to take three bags with her on a flight. Each bag weighs A, B, and C kilograms respectively. According to airline regulations:
- Chef must check in exactly two bags.
- The sum of the weights of the checked-in bags must not exceed D kilograms.
- The remaining bag must be carried as carry-on, which cannot exceed E kilograms.

Your task is to determine whether Chef can take all three bags following these rules.

Input Format
- The first line contains a single integer T, representing the number of test cases.
- Each test case consists of one line containing five space-separated integers:A B C D E
where:- A, B, C → Weights of the three bags.
- D → Maximum weight allowed for checked-in bags.
- E → Maximum weight allowed for the carry-on bag.



Output Format
For each test case:
- Print "YES" if Chef can take all three bags on the flight.
- Otherwise, print "NO".

You may print the answer in uppercase or lowercase (e.g., "yEs", "yes", "Yes", "YES" are all valid responses).

Example
Input
2
1 2 3 3 2
10 20 30 35 10

Output
YES
NO

Explanation
- Test Case 1: Chef chooses to check in bags (1,2), leaving 3 as carry-on. Since 1+2 ≤ 3 and 3 ≤ 2 fail, Chef chooses (2,3), with 1 as carry-on. Both constraints are met → YES.
- Test Case 2: No valid combination satisfies both constraints → NO.
