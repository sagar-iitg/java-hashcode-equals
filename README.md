

#####  As to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.



### If two objects have the same hashcode then they are NOT necessarily equal. Otherwise you will have discovered the perfect hash function.
### But the opposite is true: if the objects are equal, then they must have the same hashcode.


## hashcode method &&  equals method

```

public native int hashCode();
hashcode method is native method
It does not have implementation
it is implemented in different language(like c, cpp)

Java Native is C or C++
native methods are also known as foreign methods


```
### Does the hashcode method returs integer is the memory address of that object.?
No -- inDirect address
(hashcode method)it is calculating using memory address of object 



Example: 
2234*31+1 = hashcode
2234 is memory address

can not see address of the object -- using java //


```

Each Object has a unique memory address which helps the object class
hashcode() method to generate an unique hashcode for each object

```


```agsl

Does the hashcode() of string always returns a unique integer?

 String str="FB";
 String str2="Ea";
 System.out.println(str.hashCode()+" "+str2.hashCode());
 2236 2236
 why both the string object hashcode is same now.?
 
        
```

###
Two Different Object can also have same hashcode
A Good hashcode() should return a distinct integer for each object.
 (as much as possible)
but we can not gurrantee that the hashcode() method given integer can't 
be repeat for other objects.

##
If two objects are equal their hashcode will be same
if two objects hashcode are same, you can't guaranty that, 
the object are equal


















