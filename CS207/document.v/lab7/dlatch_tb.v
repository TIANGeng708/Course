module dlatch_tb;
reg CLK; 
reg D; 
wire Q, nQ; 
initial CLK <= 1'b1;

always @(CLK) 
begin 
#1 CLK<=!CLK; 
end

dlatch mysr(Q, nQ, D, CLK);
initial begin 
$dumpfile("dl.vcd"); 
$dumpvars(0,dlatch_tb); 
end

initial begin 
$monitor("%3t: Q = %b, nQ = %b", $time, Q, nQ); 
#5 D <= 1'b0; //R <= 1'b0; 
//#5 S <= 1'b1; R <= 1'b1;
#5 D <= 1'b1; //R <= 1'b0; 
#5 D <= 1'b0; //R <= 1'b0; 
#5 D <= 1'b0; //R <= 1'b1; 
#5 D <= 1'b0; //R <= 1'b0; 
#5 D <= 1'b1; //R <= 1'b0; 
#5 D <= 1'b0; //R <= 1'b0; 
#5 $finish; 
end 
 endmodule