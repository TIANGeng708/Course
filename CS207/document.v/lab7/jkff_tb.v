module jkff_tb;
reg CLK; 
reg J;
reg K; 
wire Q; 
initial CLK <= 1'b1;

always @(CLK) 
begin 
#1 CLK<=!CLK; 
end

jkff mysr(Q, J, K, CLK);
initial begin 
$dumpfile("jkff.vcd"); 
$dumpvars(0,jkff_tb); 
end

initial begin 
$monitor("%3t: J=%b, K=%b, Q = %b", $time,J,K, Q); 
#5 J <= 1'b0; K <= 1'b0;
#5 J <= 1'b1; K <= 1'b0; 
#5 J <= 1'b0; K <= 1'b0; 
#5 J <= 1'b0; K <= 1'b1; 
#5 J <= 1'b0; K <= 1'b0; 
#5 J <= 1'b1; K <= 1'b0; 
#5 J <= 1'b0; K <= 1'b0;
#5 J <= 1'b1; K <= 1'b1; 
#5 J <= 1'b1; K <= 1'b1; 
#5 $finish; 
end 
 endmodule