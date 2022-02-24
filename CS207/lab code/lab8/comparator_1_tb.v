module comparator_1_tb;
reg A, B;
wire  [2:0]F;

comparator_1 com_1(F, A,B);

initial begin
 $monitor("%3t: A is %b, B is %b, F0 is %b, F1 is %b, F2 is %b.", $time, A,B,F[0],F[1],F[2]);
  # 5 A = 0; B = 0;  
  # 5 A = 0; B = 1; 
  # 5 A = 1; B = 0; 
  # 5 A = 1; B = 1; 

  # 10 $finish; 
 end 
 endmodule