module absorption(and_lhs, and_rhs, or_lhs, or_rhs, x, y);
input x, y;
output and_lhs, and_rhs, or_lhs, or_rhs;

or or_1 (C, x, y);
and and_1 (and_lhs, x, C);
//这里计算出and_lhs x(x+y)
//and_rhs为x，直接输出x，不进行计算
and and_2 (D, x, y);
or or_2 (or_lhs, x, D);
//这里直接输出or_lhs
//or_rhs为x，直接输出x，不进行计算
endmodule
module absorption_tb;
reg x, y;
wire AL, AR, OL, OR;

absorption com_1(AL, AR, OL, OR, x, y);

initial begin
 $monitor("%3t: x is %b, y is %b, LHS of AND is %b, RHS of AND is %b, LHS of OR is %b , RHS of OR is %b.", $time, x, y, AL, x, OL, x);
  # 5 x = 0; y = 0;
  # 5 x = 1; y = 0;
  # 5 x = 0; y = 1; 
  # 5 x = 1; y = 1; 
  # 10 $finish; 
 end 
 endmodule