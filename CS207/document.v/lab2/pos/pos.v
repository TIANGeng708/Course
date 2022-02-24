module pos(f, a, b, c, d);
input a, b, c, d;
output f;

or or_1 (or1, b, d);//b+d
not not_1 (not1, a);
not not_2 (not2, b);
or or_3 (or3, not1, not2,c);//(a'+b'+c)
and and_1 (f, or1, or3);//(b+d)(a'+b'+c)
endmodule
module pos_tb;
reg a, b, c, d;
wire f;

pos com_1(f, a, b, c, d);

initial begin
 $monitor("%3t: a is %b, b is %b, c is %b, d is %b, f is %b.", $time, a, b, c, d, f);
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