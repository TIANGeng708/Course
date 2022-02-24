module countm_tb; 
  reg CLK; 
  reg [7:0]M;
  wire [7:0]Q;

initial begin 
CLK<=1'b0; 
 end
initial begin
M<=8'b11111111;
end
 always @(CLK)
  begin 
  #1 CLK<=!CLK;
   end

 countm countm_1(Q, M,CLK);

 initial begin 
 $dumpfile("countm.vcd"); 
  $dumpvars(0, countm_tb); 
   end

 initial begin 
 #550 $finish; 
  end 
   endmodule