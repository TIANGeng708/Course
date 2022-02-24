module dff2_tb;
reg X; 
reg Y; 
wire F; 
initial begin
X=1'b1;
end
initial begin
Y=1'b1;
end
//always @(X) 
//begin 
//#3 X<=~X; 
//end

always@(Y)
begin
#4 Y<=~Y;
end

always @(X) 
begin 
#3 X<=~X; 
end

dff2 mysr(F, q2,X, Y);
initial begin 
$dumpfile("dff2.vcd"); 
$dumpvars(0,dff2_tb); 
end

initial begin 
$monitor("%3t: X=%b,Y=%b,F =%b,nq2=%b ", $time, X,Y,F,q2); 
/*#5 X <= 1'b1; Y <= 1'b1;
#5 X <= 1'b0; Y <= 1'b0; 
#5 X <= 1'b0; Y <= 1'b1; 
#5 X <= 1'b1; Y <= 1'b1; 
#5 X <= 1'b1; Y <= 1'b0; 
#5 X <= 1'b1; Y <= 1'b1; 
#5 X <= 1'b0; Y <= 1'b1;
#5 X <= 1'b1; Y <= 1'b1; 
#5 X <= 1'b1; Y <= 1'b1; */
#200 $finish; 
end 
 endmodule