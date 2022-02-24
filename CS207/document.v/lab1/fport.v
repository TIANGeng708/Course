module fport(output [3:0] data);
//‐‐ Module output is a 4 wire bus.
wire [3:0] data;
//‐‐ Output the value through that 4‐bit bus.
assign data = 4'b1010; //‐‐ 4'hA
endmodule
module fport_tb;
//‐‐ 4‐wire bus, to connect it to the Fport component output.
wire [3:0] DATA;
//‐‐Instantiating the component. Connect output to DATA.
fport FP1 (.data (DATA));

//‐‐ Begin the test
initial begin
//‐‐ After 10 time units we check
//‐‐ whether the cable has the previously given pattern or not.
# 10 if (DATA != 4'b1010)
$display("‐‐‐‐>ERROR!");
else
$display("Component works!");
//‐‐ Finish the simulation 10 time units after that.
# 10 $finish;
end

endmodule