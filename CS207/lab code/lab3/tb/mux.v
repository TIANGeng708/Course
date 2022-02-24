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
module testbench;
reg a, b, c, d, e, p;
wire f;

mux u(f, a, b, c, d, e, p);

initial
begin
 $monitor("%3t: a is %b, b is %b, c is %b, d %b, f is %b.", $time, a, b, c, d, f);

  # 5 a = 0; b = 1; c=0; d=0; e=0; p=0;

  # 10 $finish; 
# 5 $finish;
end
endmodule