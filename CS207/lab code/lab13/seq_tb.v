module seq_tb; 

reg [31:0]a;
//wire [3:0]count;
seq myadd(input[31:0] a,   
input[31:0] b,  
  
output reg [31:0] yshang,  
output reg [31:0] yyushu);

initial begin
    CLK<=1;
end

always@(CLK)
begin
    #1 CLK<=!CLK;
end

initial begin 
 $dumpfile("seq.vcd"); 
  $dumpvars(0, seq_tb); 
   end



initial begin 
$monitor("%3t:%b   %b  ",$time,Z,CLK); 
//# 5 CLR=0;S=2'b01;

# 100 $finish;
  end 
  endmodule

