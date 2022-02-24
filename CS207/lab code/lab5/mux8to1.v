module mux8to1(Y, A, D);
output Y; 
input [2:0] A; 
input [7:0] D;
wire na0, na1, notA; 
wire y0, y1, y2, y3;
wire Y1, Y2;
wire Y11,Y22;

mux4to1 aaa(Y1,D[3:0],A[1:0]);
mux4to1 bbb(Y2,D[7:4],A[1:0]);
not notaa(notA,A[2]);
and andx(Y11,Y1,notA);
and andy(Y22,Y2,A[2]);
or orxx(Y,Y11,Y22);
endmodule

  module mux4to1(Y, D, A); 
 output Y; 
  input [1:0] A; 
  input [3:0] D;
   wire na0, na1; 
   wire y0, y1, y2, y3;
  not n_0(na0, A[0]);
  not n_1(na1, A[1]); 
  and and_0(y0, D[0], na1, na0);
  and and_1(y1, D[1], na1, A[0]);
  and and_2(y2, D[2], A[1], na0);
  and and_3(y3, D[3], A[1], A[0]);
  or or_0(Y, y0, y1, y2, y3);
  endmodule




  






