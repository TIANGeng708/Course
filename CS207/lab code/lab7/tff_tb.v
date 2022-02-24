module tff_tb;
reg CLK; 
reg T; 
//re Q; 
//reg Q;
initial CLK <= 1'b1;
//initial Q<= 1'b0;

always @(CLK) 
begin 
#1 CLK<=!CLK; 
end

tff mysr(Q, T, CLK);
initial begin 
$dumpfile("tff.vcd"); 
$dumpvars(0,tff_tb); 
end

initial begin 
$monitor("%3t: T=%b, Q = %b", $time, T, Q); 
#5 T <= 1'b0; //K <= 1'b0;
#5 T <= 1'b1; //K <= 1'b0; 
#5 T <= 1'b0; //K <= 1'b0; 
#5 T <= 1'b0; //K <= 1'b1; 
#5 T <= 1'b0; //K <= 1'b0; 
#5 T <= 1'b1; //K <= 1'b0; 
#5 T <= 1'b0; //K <= 1'b0;
#5 T <= 1'b1; //K <= 1'b1; 
#5 T <= 1'b1; //K <= 1'b1; 
#5 $finish; 
end 
 endmodule

 /*module tff_tb;

 reg T;
 reg CLK;
 wire Q;

 always
 begin
 #10 CLK=~CLK;
 end
 initial begin
    
 CLK=1'b0;
 T=1'b0;
 #30 T=1'b1;
 #40 T=1'b0;
 end
 tff u1(.CLK(CLK),.T(T),.Q(Q));
 endmodule*/
 
