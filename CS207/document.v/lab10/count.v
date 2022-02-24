 module count(Q, clk); 
 output reg  Q; 
 input clk;


always @(posedge clk) 
case(Q)
 0: Q <= Q+1; 
 1: Q <= Q+1; 
 2: Q <= Q+1; 
 3: Q <= Q+1; 
 4: Q <= Q+1; 
 5: Q <= Q+1; 
 6: Q <= Q+1; 
 7: Q <= Q+1; 
 default: Q <= 1; 
 endcase 
 endmodule

  module count_tb; 
  reg CLK; 
  wire Q;

initial begin 
CLK<=1'b1; 
 end
 always @(CLK)
  begin 
  #1 CLK<=!CLK;
   end

 count count_1(Q, CLK);

 initial begin 
 $dumpfile("count.vcd"); 
  $dumpvars(0, count_tb); 
   end

 initial begin 
 #20 $finish; 
  end 
   endmodule


