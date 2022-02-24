module sop(f, a, b, c, d);
input a, b, c, d;
output f;

and and_1(and1,b,c);//计算bc
and and_2(and2,c,d);//计算cd
not not_1(not1,a);
not not_1(not2,b);
and and_3(and3,not1,b);//计算a'b
and and_4(and4,not1,d);//计算a'd
and and_5(and5,not2,d);//计算b'd
or or_1(f,and1,and2,and3,and4,and5);//计算bc+cd+a'b+a'd+b'd
endmodule
module sop_tb;
reg a, b, c, d;
wire f;

sop com_1(f, a, b, c, d);

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