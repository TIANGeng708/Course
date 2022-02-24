module initial_begin_end();
 reg clk,reset,enable,data;

 initial begin 
 //Output vcd file name, can be specified at will
  $dumpfile("wave.vcd");
  //The parameter needs to set as module name
  $dumpvars(0, initial_begin_end);
  end

initial begin
$monitor("%3t clk=%b reset=%b enable=%b data=%b", $time, clk, reset, enable, data);
#1 clk = 0;
 #10 reset = 0;
 #5 enable = 0;
 #3 data = 0;
 #1 $finish;
 end
 endmodule