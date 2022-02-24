module counter_sequence(clk, rst, dout);
	input clk, rst;
	output dout;
	reg [2:0] counter;
	always @(posedge clk)
		begin
			if(rst == 1'b1)
				counter <= 3'b000;
			else if(counter == 3'b101)
				counter <= 3'b000;
			else counter <= counter + 1'b1;
		end
	assign dout = ((~counter[0]) & counter[1]) | counter[2];
endmodule


module counter_sequence_tb;
	reg clk, rst;
	wire dout;
    
    counter_sequence U1(clk, rst, dout);
    always
		#10 clk = ~clk;
		
	initial
		begin
			clk = 1'b0;
			rst = 1'b0;
			#10 rst = 1'b1;
			#20 rst = 1'b0;
		end

        initial begin 
$monitor("%3t:%b   %b   %b  ",$time,clk, rst, dout); 
# 100 $finish;
  end 
	
endmodule
