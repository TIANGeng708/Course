module dff_tb;
reg CLK; 
reg D; 
wire Q, nQ; 
initial CLK <= 1'b1;

always @(CLK) 
begin 
#1 CLK<=!CLK; 
end

dff mysr(Q, D, CLK);
initial begin 
$dumpfile("dff.vcd"); 
$dumpvars(0,dff_tb); 
end

initial begin 
$monitor("%3t: D=%b, Q = %b", $time, D,Q); 
#5 D <= 1'b0; //R <= 1'b0; 
//#5 S <= 1'b1; R <= 1'b1;
#4 D <= 1'b1; //R <= 1'b0; 
#6 D <= 1'b0; //R <= 1'b0; 
#5 D <= 1'b0; //R <= 1'b1; 
#5 D <= 1'b0; //R <= 1'b0; 
#5 D <= 1'b1; //R <= 1'b0; 
#5 D <= 1'b0; //R <= 1'b0; 
#5 $finish; 
end 
 endmodule