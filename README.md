************** The Investment Problem Algorithms**************
•	Sort the set of investments S based on the returns r each item in the set brings using the quick sort algorithm. 
•	Create variables totalReturns and i and initialize them to zero.
•	Compare the total amount to be invested A first to the investment item in the set with the highest amount required ai. (This would be the first for a sorted set).
•	If A is greater than or equal to ai, find a quotient Q, such that the product of Q and ai will be less than or equal to A.
•	 Compute A= A-(Q×ai ) and totalReturns= totalReturns+(Q× ri)
•	 Else move to the next investment package in the sorted set by incrementing i.
•	Repeat steps three, four, five and six as long as the total amount to be invested A, is still less than the smallest required amount an in the set.
•	Return totalReturns when the looping is over.
