module test (a,b,yshang,yyushu);
input [31:0]a;
input [31:0]b;
output [31:0]yshang;
output [31:0]yyushu;



reg[31:0] yshang;
reg [31:0] yyushu;
reg[31:0] tempa;  
reg[31:0] tempb;  
reg[63:0] temp_a;  
reg[63:0] temp_b;  
  
integer i;  
  
always @(a or b)  
begin  
    tempa <= a;  
    tempb <= b;  
end  
  
always @(tempa or tempb)  
begin  
    temp_a = {32'h00000000,tempa};  
    temp_b = {tempb,32'h00000000};   
    for(i = 0;i < 32;i = i + 1)  
        begin  
            temp_a = {temp_a[62:0],1'b0};  
            if(temp_a[63:32] >= tempb)  
                temp_a = temp_a - temp_b + 1'b1;  
            else  
                temp_a = temp_a;  
        end  
  
    yshang <= temp_a[31:0];  
    yyushu <= temp_a[63:32];  
end  
  
endmodule  







module test_tb; 

wire [31:0]yshang;
wire  [31:0]yyushu;
reg [31:0]a;
reg [31:0]b;



test myadd(a, b,yshang, yyushu );



initial begin 
$monitor("%3t:%b   %b   %b   %b ",$time,a,b,yshang,yyushu); 
# 5 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000000100;
# 5 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000000010;
# 5 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000100000;
# 3 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000000100;
# 3 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000000010;
# 3 a=32'b00000010000000000000000000000000;b=32'b00000000000000000000000000100000;
# 3 a=32'b00000010000000000000011100000000;b=32'b00000000000000000000000000000110;
# 3 a=32'b00110010000000000000000000000100;b=32'b00000000000000000011111110000010;
# 3 a=32'b00000011010000000000011100000000;b=32'b00000000000000000000011100100000;
# 100 $finish;
  end 
  endmodule