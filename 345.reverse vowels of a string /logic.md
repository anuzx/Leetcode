<h3> since we have to check char by char we will convert the string into array of char by using char [] word = s.toCharArray
<br>
so that now we can point to each char by their idx
<br>
word[start] means “the character at position start in the array.”
word[end] means “the character at position end in the array.”
<br>
now we will take two pointers at first and last idx 

<br>String vowels = "aeiouAEIOU";
<br>
while (start < end && vowels.indexOf(word[start]) == -1) {
<br>
    start++;}
 </h3>

<br>

<img width="978" height="663" alt="image" src="https://github.com/user-attachments/assets/10a10874-c868-49a1-91e8-1790e46a4dea" />
<br>
<img width="949" height="463" alt="image" src="https://github.com/user-attachments/assets/cc81b61a-5b86-47d3-9679-14fdc3dba44e" />
<br>



<h3> this means we will keep moving the start pointer until it is less than end pointer value and also is not a vowel 
<br>
Now, indexOf is a method that belongs to the String class in Java. It checks whether a given character (or substring) exists inside that <br>string, and if so, it returns the index (position) where it first appears. If it doesn’t find it, it returns -1.
<br>
vowels.indexOf(word[start]) looks for that character inside "aeiouAEIOU".
<br>
If it returns -1, that means it’s not a vowel, so you move start forward until you actually land on a vowel.
<br>
and here we are not using <= as it will not give us the desired result because it will swap one more time due to the fact that even tho 
<br>outer while loop says start <= end but it will only check this for initial condition of start and end , and not after they have 
<br>advanced to find the vowel so in case start becomes > end they will still swap </h3>

