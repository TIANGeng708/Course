module multiple8(clk,rst_n,mul_a,mul_b,result
    );

input clk;
input rst_n;
input[7:0] mul_a;
input[7:0] mul_b;
output[15:0] result;
//output [15:0] re;

reg[15:0] result; 
reg[15:0] store7; 
reg[15:0] store6;
reg[15:0] store5;
reg[15:0] store4;
reg[15:0] store3;
reg[15:0] store2;
reg[15:0] store1;
reg[15:0] store0;
reg[15:0] add01;
reg[15:0] add23;
reg[15:0] add45;
reg[15:0] add67;
reg[15:0] add0123;
reg[15:0] add4567;
reg[15:0] re;
always @ (posedge clk or negedge rst_n)


begin
 if(!rst_n)
 begin
  store7 <= 16'b0;
  store6 <= 16'b0;
  store5 <= 16'b0;
  store4 <= 16'b0;
  store6 <= 16'b0;
  store2 <= 16'b0;
  store1 <= 16'b0;
  store0 <= 16'b0;
  add01  <= 16'b0;
  add23  <= 16'b0;
  add45  <= 16'b0;
  add67  <= 16'b0;
  add0123  <= 16'b0;
  add4567  <= 16'b0;
 end
 else


 begin
  store7 <= mul_b[7] ? {1'b0,mul_a,7'b0}:16'b0;
  store6 <= mul_b[6] ? {2'b0,mul_a,6'b0}:16'b0;
  store5 <= mul_b[5] ? {3'b0,mul_a,5'b0}:16'b0;
  store4 <= mul_b[4] ? {4'b0,mul_a,4'b0}:16'b0;
  store3 <= mul_b[3] ? {5'b0,mul_a,3'b0}:16'b0;
  store2 <= mul_b[2] ? {6'b0,mul_a,2'b0}:16'b0;
  store1 <= mul_b[1] ? {7'b0,mul_a,1'b0}:16'b0;
  store0 <= mul_b[0] ? {8'b0,mul_a}:16'b0;
  add67  <= store7+store6;
  add45  <= store5+store4;
  add23  <= store3+store2;
  add01  <= store1+store0;
  add0123  <= add01 + add23;
  add4567  <= add45 + add67;
  result <= add0123 + add4567;
  //re<=result+7'b1;
 end
end

endmodule
