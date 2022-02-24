module demorgan(and_lhs, and_rhs, or_lhs, or_rhs, x, y);
input x, y;
output and_lhs, and_rhs, or_lhs, or_rhs;

nand nand_1 (and_lhs, x, y); 
//计算出了and_lhs(xy)'
not not_1 (a_1, x);
not not_2 (b_1, y);
or or_1 (and_rhs, a_1, b_1);
//计算出了and_rhs  x'+y'
nor nor_2 (or_lhs, x, y);
//计算出了or_lhs(x+y)'
and or_2 (or_rhs, a_1, b_1);
//计算出了or_rhs  x'y'
endmodule
module commutative_tb;
reg x, y;
wire AL, AR, OL, OR;

demorgan com_1(AL, AR, OL, OR, x, y);

initial begin
 $monitor("%3t: x is %b, y is %b, LHS of AND is %b, RHS of AND is %b, LHS of OR is %b , RHS of OR is %b.", $time, x, y, AL, AR, OL, OR);
  # 5 x = 0; y = 0;
  # 5 x = 1; y = 0;
  # 5 x = 0; y = 1; 
  # 5 x = 1; y = 1; 
  # 10 $finish; 
 end 
 endmodule