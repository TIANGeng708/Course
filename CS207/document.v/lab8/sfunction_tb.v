module sfunction_tb;
reg [3:0]X;
wire[3:0]Y;

sfunction com_1(Y,X);

initial begin
 $monitor("%3t: X is %b, Y is %b.", $time, X,Y);
  //# 5 X <= 0000; 
  //# 5 X <= 0001; 
  # 5 X <= 4'b0000;
  # 5 X <= 4'b0001;
  # 5 X <= 4'b0010;
  # 5 X <= 4'b0011;
  # 5 X <= 4'b0100;
  # 5 X <= 4'b0101;
  # 5 X <= 4'b0110;
  # 5 X <= 4'b0111;
  # 5 X <= 4'b1000;
  # 5 X <= 4'b1001;
  # 5 X <= 4'b1010;
  # 5 X <= 4'b1011;
  # 5 X <= 4'b1100;
  # 5 X <= 4'b1101;
  # 5 X <= 4'b1110;
  # 5 X <= 4'b1111;



  # 10 $finish; 
 end 
 endmodule