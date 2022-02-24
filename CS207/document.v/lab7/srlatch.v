module srlatch(output Q, output nQ, input S, input R, input G);

wire Rd,Sd;
nand na0 (Rd, R, G); 
nand na1 (Sd, S, G); 
nand na2 (Q, Sd, nQ);
nand na3 (nQ, Rd, Q);
endmodule


module sr_tb;
reg CLK; 
reg S, R; 
wire Q, nQ; 
initial CLK <= 1'b1;

always @(CLK) 
begin 
#1 CLK<=!CLK; 
end

srlatch mysr(Q, nQ, S, R, CLK);
initial begin 
$dumpfile("sr.vcd"); 
$dumpvars(0,sr_tb); 
end

initial begin 
$monitor("%3t: Q = %b, nQ = %b", $time, Q, nQ); 
#5 S <= 1'b0; R <= 1'b0; 
//#5 S <= 1'b1; R <= 1'b1;
#5 S <= 1'b1; R <= 1'b0; 
#5 S <= 1'b0; R <= 1'b0; 
#5 S <= 1'b0; R <= 1'b1; 
#5 S <= 1'b0; R <= 1'b0; 
#5 S <= 1'b1; R <= 1'b0; 
#5 S <= 1'b0; R <= 1'b0; 
#5 $finish; 
end 
 endmodule