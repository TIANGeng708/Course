module mul_8_tb; 
reg [7:0]X;
reg [7:0]Y; 
//wire S0,S1,S2,S3;
wire [15:0]Z;
mul_8 myadd(X, Y, Z);

initial begin 
$monitor("%3t:%b %b %b",$time,X,Y,Z); 
# 5 X=8'b11111111;Y=8'b00000001;
# 5 X=8'b11111111;Y=8'b11111111;
# 5 X=8'b10100101;Y=8'b01000110;
# 5 X=8'b11110111;Y=8'b11100010;
# 5 X=8'b01000001;Y=8'b00011101;
# 10 $finish;
  end 
  endmodule