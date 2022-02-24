 module mul_gate(A, B, C);
  output[3:0] C; 
  input[1:0] A, B;
 wire w1, w2, w3, w4;
 and and1(C[0], A[0], B[0]);
  and and2(w1, A[0], B[1]); 
  and and3(w2, A[1], B[0]);
 half_adder myadd1(w1, w2, C[1], w3); 
 and and4(w4, A[1], B[1]); 
 half_adder myadd2(w4, w3, C[2], C[3]); 
 endmodule

module half_adder(A, B, S, C); 
input A, B; 
output S, C; 
and and1(C, A, B); 
xor xor1(S, A, B); 
endmodule


/*module mul_data(A, B, C); 
output[3:0] C; 
input[1:0] A, B; 
assign C = A * B;
 endmodule*/



 module mul_tb;
 reg [1:0] A, B;
wire [3:0] Z; 
mul_gate mult1(A, B, Z); 
//# mul_behav mult1(A, B, Z); 
//# mul_data mul_data(A, B, Z);
initial begin 
$monitor("%3t: A is %d, B is %d, Z is %d",$time,A,B,Z); 
# 5 A=0;B=0; 
# 5 A=1;B=0; 
# 5 A=2;B=0; 
# 5 A=3;B=0;


# 5 A=0;B=1; 
# 5 A=1;B=1; 
# 5 A=2;B=1; 
# 5 A=3;B=1;
# 5 A=0;B=2; 
# 5 A=1;B=2; 
# 5 A=2;B=2; 
# 5 A=3;B=2;

# 5 A=0;B=3; 
# 5 A=1;B=3; 
# 5 A=2;B=3;
# 5 A=3;B=3; 
# 10 $finish; 
end 
endmodule
