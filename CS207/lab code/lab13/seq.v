module seq(Z, CLK);
output Z;
input CLK;
reg Z;
reg [3:0]count;


always @(posedge CLK)
case (count)
    4'b0000:count<=4'b0001;
    4'b0001:count<=4'b0010;
    4'b0010:count<=4'b0011;
    4'b0011:count<=4'b0100;
    4'b0100:count<=4'b0101;
    4'b0101:count<=4'b0110;
    4'b0110:count<=4'b0111;
    4'b0111:count<=4'b1000;
    4'b1000:count<=4'b1001;
    4'b1001:count<=4'b0000;
    4'b1111:count<=4'b0010;
    default: count<=4'b1111;
endcase


always@(posedge CLK)
case (count)
    4'b0000: Z<=1;
    4'b0001: Z<=1;
    4'b0010: Z<=0;
    4'b0011: Z<=1;
    4'b0100: Z<=0;
    4'b0101: Z<=0;
    4'b0110: Z<=0;
    4'b0111: Z<=1;
    4'b1000: Z<=0;
    4'b1001: Z<=1;
    default:Z<=1; 
endcase
endmodule


