module add_sub_tb; 
reg A, B,X,CI; 
wire D,CO;
 add_sub myadd(D, CO, X, A, B, CI);

initial begin 
$monitor("%3t: A is %b, B is %b, CI is %b, X is %b, D is %b, CO is %b",$time,A,B,CI,X,D,CO); 
# 5 A=0;B=0;CI=0;X=0; 
# 5 A=0;B=0;CI=1;X=0; 
# 5 A=0;B=1;CI=0;X=0; 
# 5 A=0;B=1;CI=1;X=0; 
# 5 A=1;B=0;CI=0;X=0; 
# 5 A=1;B=0;CI=1;X=0; 
# 5 A=1;B=1;CI=0;X=0; 
# 5 A=1;B=1;CI=1;X=0; 
# 5 A=0;B=0;CI=0;X=1; 
# 5 A=0;B=0;CI=1;X=1; 
# 5 A=0;B=1;CI=0;X=1; 
# 5 A=0;B=1;CI=1;X=1; 
# 5 A=1;B=0;CI=0;X=1; 
# 5 A=1;B=0;CI=1;X=1; 
# 5 A=1;B=1;CI=0;X=1; 
# 5 A=1;B=1;CI=1;X=1; 
 # 10 $finish;
  end 
  endmodule