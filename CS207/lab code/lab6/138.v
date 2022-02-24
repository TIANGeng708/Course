module dec3to8(nY, E1, nE2, nE3, A);
input E1,nE2,nE3;
input [2:0] A;
output [7:0] nY;
reg [7:0] nY;
always @ (E1 or nE2 or nE3 or A[0] or A[1] or A[2])
begin
    if(E1==0||(nE2||nE3))
    begin
        nY <= 8'b11111111;
    end
    else
    begin
        case(A)
        0: nY <= 8'b11111110;
        1: nY <= 8'b11111101;
        2: nY <= 8'b11111011;
        3: nY <= 8'b11110111;
        4: nY <= 8'b11101111;
        5: nY <= 8'b11011111;
        6: nY <= 8'b10111111;
        7: nY <= 8'b01111111;
        endcase
    end
end

endmodule