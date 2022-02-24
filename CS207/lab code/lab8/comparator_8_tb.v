module comparator_8_tb;
reg [7:0]A;
reg [7:0]B;
wire [2:0]F;

comparator_8 com_1(F, A, B);

initial begin
 $monitor("%3t: A is %b, B is %b, F2 is %b, F1 is %b, F0 is %b.", $time, A,B,F[2],F[1],F[0]);
  # 5 A = 8'b00000000; B = 8'b00000001;  
  # 5 A = 8'b00010000; B = 8'b00100001;
  # 5 A = 8'b00000111; B = 8'b00001001;
  # 5 A = 8'b00110000; B = 8'b00000001;
  # 5 A = 8'b00010000; B = 8'b00000101;
  # 5 A = 8'b00100001; B = 8'b00100001;
  # 5 A = 8'b00110000; B = 8'b00100001;
  # 5 A = 8'b00000100; B = 8'b00000001;
  # 5 A = 8'b00011000; B = 8'b00100001;
  # 5 A = 8'b00000100; B = 8'b10000001;
  # 5 A = 8'b00000010; B = 8'b00000001;

  # 10 $finish; 
 end 
 endmodule