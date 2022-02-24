module moore(Y, A, B, X, clk); 
output reg Y; 
output reg A, B; 
input X; 
input clk;

always @(A or B) 
case({A, B}) 
3: Y <= 1'd1;  
default: Y <= 1'd0;
endcase 
always @(posedge clk) 
case({A, B, X}) 
0, 7: {A, B} <= 2'b00; 
1, 2: {A, B} <= 2'b01; 
3, 4: {A, B} <= 2'b10; 
5, 6: {A, B} <= 2'b11; 
default: {A, B} <= 2'b00; 
endcase 
endmodule


 module moore_tb; 
 reg CLK; 
 reg X;
  wire y; 
  wire [1:0] Q;
initial begin 
CLK <= 1'b0; 
X <= 1'b0; 
end
always @(CLK) 
begin 
#1 CLK <= !CLK; 
end
moore moore1(y, Q[1], Q[0], X, CLK);
initial begin 
$dumpfile("moore.vcd"); 
$dumpvars(0, moore_tb); 
end
initial begin 
$monitor("%3t: X = %b, y = %b, Q[1] = %b, Q[0] = %b", $time, X, y, Q[0], Q[1]); 
#2 X <= 1'b0; 
#2 X <= 1'b1; 
#2 X <= 1'b1; 
#2 X <= 1'b1; 
#2 X <= 1'b0; 
#2 X <= 1'b0; 
#2 X <= 1'b1; 
#2 X <= 1'b0; 
#2 X <= 1'b1; 
#2 X <= 1'b1; 
#2 X <= 1'b0; 
#2 $finish; 
end 
endmodule


