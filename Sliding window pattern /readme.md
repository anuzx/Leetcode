in this concept we form a window and slide it over an array or string to get our desired result 

its of 2 types : fixed sliding window -> maintains a constant length , commanly used if req.window size is known 
and dynamic sliding window -> expands and shrinks as per the nedd , window size is not known , for ques like longest or shortest subarray or substring 

1. fixed window size :

compute 1st window task 
initialise value of first window 
slide the window over the array -> remove element leaving window and add element entering window 
update the value 

2.dynamic window size :

take two pointer to expand and shrink the window 
