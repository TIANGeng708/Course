module voter_tb;
reg A, B, C;
wire F;

voter com_1(F, A, B, C);

initial begin
 $monitor("%3t: A is %b, B is %b, C is %b, F is %b.", $time, A,B,C,F);
  # 5 A = 0; B = 0; C=0; 
  # 5 A = 0; B = 0; C=1;
  # 5 A = 0; B = 1; C=0;
  # 5 A = 0; B = 1; C=1;
  # 5 A = 1; B = 0; C=0;
  # 5 A = 1; B = 0; C=1;
  # 5 A = 1; B = 1; C=0;
  # 5 A = 1; B = 1; C=1;

  # 10 $finish; 
 end 
 endmodule