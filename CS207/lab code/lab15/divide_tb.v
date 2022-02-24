module traffic_tb; 

wire [2:0]rail;
wire  [2:0]road;



reg C;
reg reset;


traffic myadd(road, rail, C, reset);
initial begin
    reset=1;
end
initial begin
    C<=0;
end



initial begin 
$monitor("TIME = %3t   reset = %d  C= %d   road = %d   rail = %d   ",$time,reset,C,road,rail); 
# 100 C<=1;
# 50 C<=0;
//# 2 C<=1;
# 50 C<=1;
# 2 C<=0;
# 48 C<=1;
//# 2 C<=0;

//# 1 C<=1;
//# 1 C<=0;
//# 1 C<=1;
# 46 C<=0;
//# 3 A=32'b00000011010000000000011100000000;B=32'b00000000000000000000011100100000;
# 400 $finish;
  end 
  endmodule