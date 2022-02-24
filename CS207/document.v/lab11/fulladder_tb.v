module fulladder_tb; 
reg A, B,X; 
wire SUM, COUT;
fulladder myadd(S,C,A,B,X);

initial begin 
$monitor("%3t:X is %b, A is %b, B is %b, S is %b, C is %b",$time,X,A,B,S,C); 
# 5 X=0;A=0;B=0;
# 5 X=0;A=0;B=1; 
# 5 X=0;A=1;B=0;
# 5 X=0;A=1;B=1; 
# 5 X=1;A=0;B=0;
# 5 X=1;A=0;B=1; 
# 5 X=1;A=1;B=0;
# 5 X=1;A=1;B=1;
# 10 $finish;
  end 
  endmodule