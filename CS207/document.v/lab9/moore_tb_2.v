module moore_tb; 
  reg CLK; 
  reg [1:0]X;
  wire Z;
  wire [1:0] Q;
  initial begin 
  CLK <= 1'b0; 
  X[1] <= 1'b0; 
  X[0] <=1'b0;
  end
  always @(CLK) 
  begin 
  #1 CLK<=!CLK;
   end

 always@(X[1])
 begin
 #2 X[1]<=!X[1];
  end
always@(X[0])
begin
  #5 X[0]<=!X[0];
  end

 moore moore1(Z, Q, X, CLK);
initial begin 
$dumpfile("moore.vcd"); 
$dumpvars(0, moore_tb);
 end
initial begin
$monitor("%3t: %b%b %b%b %b", $time,  Q[1], Q[0],X[1],X[0],Z);
//#2 X <= 2'b00; 
//#2 X <= 2'b00; 
//#2 X <= 2'b01; 
//#2 X <= 2'b01; 
//#2 X <= 2'b10; 
//#2 X <= 2'b10; 
//#2 X <= 2'b11; 
//#2 X <= 2'b11; 
//#2 X <= 2'b00; 
//#2 X <= 2'b00; 

#30 $finish;
 end
  endmodule