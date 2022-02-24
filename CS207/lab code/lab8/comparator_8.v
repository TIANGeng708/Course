module comparator_8(F, A, B);
input [7:0]A;
input [7:0]B;
output [2:0]F;
reg [2:0]F;

always@(A or B)
if (A>B) begin
    F=100;
end
else if (A==B) begin
    F=010;
end 
else begin
    F=001;
end
endmodule



