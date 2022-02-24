primitive mux(Y, A, B, C, D, S1, S2); 
 output Y;
 input A, B, C, D, S1, S2;

 table
 //A B C D S1S2: Y
   1 ? ? ? 0 0 : 1;
   0 ? ? ? 0 0 : 0;
   ? 1 ? ? 0 1 : 1;
   ? 0 ? ? 0 1 : 0;
   ? ? 1 ? 1 0 : 1;
   ? ? 0 ? 1 0 : 0;
   ? ? ? 1 1 1 : 1;
   ? ? ? 0 1 1 : 0;
   endtable
endprimitive
