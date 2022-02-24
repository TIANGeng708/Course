module tb;
reg a, b, c, d;
wire f;

nand1 com_1(f, a, b, c, d);

initial begin
 $monitor("%3t: a is %b, b is %b, c is %b, d %b, f is %b.", $time, a, b, c, d, f);
  # 5 a = 1; b = 0; c=0; d=0;
  # 5 a = 1; b = 1; c=0; d=0;
  # 5 a = 1; b = 0; c=1; d=0;
  # 5 a = 1; b = 0; c=0; d=1;
  # 5 a = 1; b = 1; c=1; d=0;
  # 5 a = 1; b = 1; c=0; d=1;
  # 5 a = 1; b = 0; c=1; d=1;
  # 5 a = 1; b = 1; c=1; d=1;
  # 5 a = 0; b = 0; c=0; d=0;
  # 5 a = 0; b = 1; c=0; d=0;
  # 5 a = 0; b = 0; c=1; d=0;
  # 5 a = 0; b = 0; c=0; d=1;
  # 5 a = 0; b = 1; c=1; d=0;
  # 5 a = 0; b = 1; c=0; d=1;
  # 5 a = 0; b = 0; c=1; d=1;
  # 5 a = 0; b = 1; c=1; d=1;
  # 10 $finish; 
 end 
 endmodule