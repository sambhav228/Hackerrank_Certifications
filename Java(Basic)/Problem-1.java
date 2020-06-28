//@sambhav228

//Algorithm Discussion on Problem 1

/* The below problem solving algorithm approach is mine ; it's upto a programmer how efficiently they can optimize the solution. */

/*
The first coding problem in my assessment test was about :
    
                                                        To delete all pairs (), [], and {}. 
                                                        
                                                        Once there are no open-close pairs and string is empty - the expression was correct.

    For example you have string "[][{}({})]". The steps will be:

    1. "[][{}({})]"

    2. "[()]" - because first [] and both {} will be replaced. Length of initial string and result one will be different.

    3. "[]" - only () will be removed. Length of initial string and result one will be different.
    
    4. "" - empty string, the initial expression is correct.

In other words we are interested only in open-close pair. If open does not have close near it - the expression is not correct.*/