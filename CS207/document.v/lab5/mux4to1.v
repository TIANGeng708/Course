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

   module mux4to1_tb; 
   reg [3:0] IN; 
   reg [1:0] S; 
   wire OUT;
 mux4to1 mux(OUT, IN, S);
  initial begin
  IN[0]=1; IN[1]=1; IN[2]=1; IN[3]=0;
  $display("IN0 = %b, IN1 = %b, IN2 = %b, IN3 = %b", IN[0], IN[1], IN[2], IN[3]);
   $monitor("%3t: S1 = %b, S0 = %b, OUT = %b", $time, S[1], S[0], OUT);
    #5 S[0]=0; S[1]=0; 
    #5 S[0]=1; S[1]=0; 
    #5 S[0]=0; S[1]=1; 
    #5 S[0]=1; S[1]=1;
    #10 $finish;
    end
   endmodule

