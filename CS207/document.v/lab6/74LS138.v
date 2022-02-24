module dec3to8(nY, E1, nE2, nE3, A);
input E1;
input nE2, nE3;
input [2:0]A;
output [7:0]nY;
reg [7:0]nY;
//not not_1(not1,nE2);
//not not_2(not2,nE3);
always @(E1 or nE2 or nE3 or A)
if (E1==0)
nY<=8'b11111111;
 else if(nE2==1)
nY<=8'b11111111;
else if(nE3==1)
nY<=8'b11111111;

else begin
    case (A)
        0:nY<=8'b11111110;
        1:nY<=8'b11101111;
        2:nY<=8'b11111011;
        3:nY<=8'b10111111;
        4:nY<=8'b11111101;
        5:nY<=8'b11011111;  
        6:nY<=8'b11110111;
        7:nY<=8'b01111111; 
      
    endcase
  end
 endmodule


