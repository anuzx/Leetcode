here two binaries are in the form of string and we need to return their sum as a binary string 

for this we will use StringBuilder as string builder is mutable and is used to manipulate strings 

first we will create two pointers i = a.length()-1 and j = b.length()-1 {as addition start from extreme right}
and take carry and sum initially as 0 , therefore int sum=carry=0

now while ( i>=0 || j>=0 || carry > 0)

now from extreme right sum = sum + a.chartAt(i) - '0' { here we are converting string into integer using character code '
character code for 0 is 48 and for 1 is 49 therefore if a.charAt(i) = 1 then this implies '1' - '0' => 49 - 48 = 1 , so we get integer as 1 }
now move to the left character so i-- ;

now we will append this into result => result.append(sum%2)
carry = sum/2

{ because if in binary we are gonna do 1 + 1 then ( 2%2 = 0 this will be written as result and 2/2 = 1 this will be taken as carry)

at last we will reverse the result and change it into string { we will resverse the content becuz append will add the results to the right each time }
