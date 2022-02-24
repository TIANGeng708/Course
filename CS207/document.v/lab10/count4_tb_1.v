module count4_tb; 
  reg clk;
  reg [3:0]data; 
  reg load;
  reg reset;
  wire [3:0] Q;

initial begin 
clk<=1'b0; 
 end
initial begin 
reset<=1'b0; 
 end
initial begin 
load<=1'b0; 
 end
initial begin 
data<=4'b1000; 
 end

 always @(clk)
  begin 
  #1 clk<=!clk;
   end

 always @(reset)
  begin 
  #17 reset<=!reset;
  #2 reset<=!reset;

   end

 always @(load)
  begin 
  #20 load<=!load;
  #2 load<=!load;
   end

 count4 count_1(Q, data, load, reset, clk);

 initial begin 
 $dumpfile("count4.vcd"); 
  $dumpvars(0, count4_tb); 
   end

 initial begin 
 #80 $finish; 
  end 
   endmodule