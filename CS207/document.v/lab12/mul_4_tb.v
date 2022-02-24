module mul_4_tb; 
reg [3:0]X;
reg [3:0]Y; 
//wire S0,S1,S2,S3;
wire [7:0]Z;
mul_4 myadd(X, Y, Z);

initial begin 
$monitor("%3t:%b %b %b",$time,X,Y,Z); 
# 5 X=4'b1111;Y=4'b1111;
# 5 X=4'b0101;Y=4'b1010;
# 5 X=4'b0100;Y=4'b1001;
# 5 X=4'b1001;Y=4'b1001;
# 5 X=4'b1100;Y=4'b0111;

# 10 $finish;
  end 
  endmodule