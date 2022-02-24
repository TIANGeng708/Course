module half_adder(A,B,S,C); 
input A,B;
output S,C;
and and1(C, A, B); 
xor xor1(S, A, B); 
endmodule 


module half_                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    adder_tb; 
reg A, B; 
wire SUM, COUT;
 half_adder myadd(A,B,SUM,COUT);

initial begin 
$monitor("%3t: A is %b, B is %b, SUM is %b, COUT is %b",$time,A,B,SUM,COUT); 
# 5 A=0;B=0;
# 5 A=0;B=1; 
 # 5 A=1;B=0;
 # 5 A=1;B=1; 
 # 10 $finish;
  end 
  endmodule