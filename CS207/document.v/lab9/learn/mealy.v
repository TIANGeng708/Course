 module mealy(Y, A, B, X, clk); 
 output reg Y;
 output reg A, B; 
 input X; 
 input clk;

always @(X or A or B)
case({A, B, X}) 
 2, 4, 6: Y <= 1'd1;
 default: Y <= 1'd0; 
 endcase


always @(posedge clk) 
case({A, B, X}) 
 0, 2, 4, 6: {A, B} <= 2'b00;
 1: {A, B} <= 2'b01; 
 5, 7: {A, B} <= 2'b10; 
 3: {A, B} <= 2'b11; 
 default: {A, B} <= 2'b00; 
 endcase 
 endmodule



  module mealy_tb; 
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
  #1 CLK<=!CLK;
   end
 mealy mealy1(y, Q[1], Q[0], X, CLK);
initial begin 
$dumpfile("mealy.vcd"); 
$dumpvars(0, mealy_tb);
 end
initial begin
$monitor("%3t: X = %b, y = %b, Q[1] = %b, Q[0] = %b", $time, X, y, Q[0], Q[1]);
#2 X <= 1'b0; //00 48 
#2 X <= 1'b1; //01 49 
#2 X <= 1'b1; //11 50 
#2 X <= 1'b1; //10 51 
#2 X <= 1'b0; //10 52 
#2 X <= 1'b0; //00 53 
#2 X <= 1'b1; //01 54 
#2 X <= 1'b0; //00 55 
#2 X <= 1'b1; //01 56 
#2 X <= 1'b1; //11 57 
#2 X <= 1'b0; //00 58 
#2 $finish;
 end
  endmodule


