module count4(Q, data, load, reset, clk);
output [3:0] Q;
input [3:0] data;

input load;
input reset;
input clk;
reg [3:0] Q;

always @(posedge clk ) begin

if (!load ) begin
case(Q)
4'b0000:Q<=4'b0001;
4'b0001:Q<=4'b0010;
4'b0010:Q<=4'b0011;
4'b0011:Q<=4'b0100;
4'b0100:Q<=4'b0101;
4'b0101:Q<=4'b0110;
4'b0110:Q<=4'b0111;
4'b0111:Q<=4'b1000;
4'b1000:Q<=4'b1001;
4'b1001:Q<=4'b1010;
4'b1010:Q<=4'b1011;
4'b1011:Q<=4'b1100;
4'b1100:Q<=4'b1101;
4'b1101:Q<=4'b1110;
4'b1110:Q<=4'b1111;
4'b1111:Q<=4'b0000;
default:Q<=4'b0000;
endcase
end

if (!reset ) begin
if (!load) begin
    Q=~Q;
    Q=~Q;
end
else begin
case(Q)
4'b0000:Q<=4'b0001;
4'b0001:Q<=4'b0010;
4'b0010:Q<=4'b0011;
4'b0011:Q<=4'b0100;
4'b0100:Q<=4'b0101;
4'b0101:Q<=4'b0110;
4'b0110:Q<=4'b0111;
4'b0111:Q<=4'b1000;
4'b1000:Q<=4'b1001;
4'b1001:Q<=4'b1010;
4'b1010:Q<=4'b1011;
4'b1011:Q<=4'b1100;
4'b1100:Q<=4'b1101;
4'b1101:Q<=4'b1110;
4'b1110:Q<=4'b1111;
4'b1111:Q<=4'b0000;
default:Q<=4'b0000;
endcase
end end


 if (load) begin
    Q <=data;
end
 if (reset) begin
    Q <= 4'b0000; 
end
end
endmodule


