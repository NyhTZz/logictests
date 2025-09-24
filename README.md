My own understanding

#1. Fibo
  
  -What it does is I initialized x with a value of 0 and y with 1
    
    
    -I did a "for loop" and print out x and initialize z with a value of x + y and after that changes the value of x equal to that of y and y equal to z
      
      
      -So if we visualize this then in 
      
      
      Iteration 1: [0], because x=0 and y=1 and print x(0). Then z = x(0)+y(1)= z(1), now x = y(1), y = z(1);
     
      
      Iteration 2: [1], because x=1 and y=2 and print x(1). Then z = x(1)+y(1) = z(2), now x = y(1), y = z(2);  
      
      
      Iteration 3: [1], because x=1 and y=2 and print x(1). Then z = x(1)+y(2) = z(3), now x = y(2), y = z(3);
      
      
      Iteration 4: [2], because x=2 and y=3 and print x(2). Then z = x(2)+y(3) = z(5), now x = y(3), y = z(5);
      
      
      Iteration 5: [3], because x=3 and y=5 and print x(3). Then z = x(3)+y(5) = z(8), now x = y(5), y = z(8);
      
      
      Iteration 6: [5], because x=5 and y=8 and print x(5). Then z = x(5)+y(8) = z(13), now x = y(8), y = z(13);
      
      
      Iteration 7: [8], because x=8 and y=13 and print x(8). Then z = x(8)+y(13) = z(21), now x = y(13), y = z(21);
      
      
      Iteration 8: [13], because x=13 and y=21 and print x(13). Then z = x(13)+y(21) = z(34), now x = y(21), y = z(34);
      
      
      Iteration 9: [21], because x=21 and y=34 and print x(21). Then z = x(21)+y(34) = z(55), now x = y(34), y = z(55);
      
      
      Iteration 10: [34], because x=34 and y=55 and print x(34). Then z = x(34)+y(55) = z(89), now x = y(55), y = z(89);
     
      
      So on and so forth if you change the value in the for loop higher than 10.
