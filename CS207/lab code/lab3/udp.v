primitive udp(f, a, b, c, d); 
 output f; 
 input a, b, c, d; 
   
 //f=(b + d)(a′ + b′ + c).  
  table 
  // a b c d : f 
     1 1 1 1 : 1; 
     1 0 1 1 : 1;
     1 1 0 1 : 0;
     1 1 1 0 : 1;
     1 0 0 1 : 1;
     1 0 1 0 : 0;
     1 1 0 0 : 0;
     1 0 0 0 : 0;
     0 1 1 1 : 1;
     0 0 1 1 : 1;
     0 1 0 1 : 1;
     0 1 1 0 : 1;
     0 0 0 1 : 1;
     0 0 1 0 : 0;
     0 1 0 0 : 1;
     0 0 0 0 : 0;
endtable 
endprimitive
