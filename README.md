**The Investment Problem Algorithm**<br>

1. Sort the list of investments S based on the return percentage each item in the list brings using the quick sort algorithm. 
2. Create variables totalReturns and i and initialize them to zero.
3. Compare the total amount to be invested A first to the investment item in the list with the highest return percentage required ai. (This would be the first for a sorted list for the first iteration, and then the next item in the list for subsequent iterations).
4. If A is greater than or equal to ai, find a quotient Q, such that the product of Q and ai will be less than or equal to A.
5. Compute A= A-(Q×ai ) and totalReturns= totalReturns+(Q× ri)
6. Else move to the next investment package in the sorted set by incrementing i.
7. Repeat steps three, four, five and six as long as the total amount to be invested A, is still less than the smallest required amount for the next investment item in the  sorted list of investments.
8. Return totalReturns when the looping is over.
