module divide(Q, R, A, B, CLK, reset);
input [31:0]A;
input [31:0]B;
input CLK;
input reset;
output [31:0]Q;
output [31:0]R;

reg [31:0]Q;
reg [31:0]R;

reg[31:0] test_1;  
reg[31:0] test_2;  
reg[63:0] go_1;  
reg[63:0] go_2;  
   
  
always @(posedge CLK or negedge reset)
if(!reset)
begin
    Q<=32'b00000000000000000000000000000000;
    R<=32'b00000000000000000000000000000000;
    test_1<=32'b00000000000000000000000000000000;
    test_2<=32'b00000000000000000000000000000010;
end
else begin

if(CLK)
begin  
    test_1 <= A;  
    test_2 <= B;  
end  
end


  integer cov;




always @(test_1 or test_2)  
begin  
    go_1 = {32'b00000000000000000000000000000000,test_1};  
    go_2 = {test_2,32'b00000000000000000000000000000000};   
    for(cov = 0;cov < 32;cov = cov + 1)  
    begin  
    go_1 = {go_1[62:0],1'b0};  
    if(go_1[63:32]>=test_2)  
        go_1=go_1-go_2 + 1'b1;  
    
    if(go_1[63:32]<test_2) 
        go_1=go_1;  
    end  
  
    Q <= go_1[31:0];R <= go_1[63:32];  
end  
  

endmodule



