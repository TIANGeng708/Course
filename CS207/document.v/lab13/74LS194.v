module universal(Q, CLR, CLK, S, D, SR, SL);
output [3:0]Q;
input CLR;
input CLK;
input [1:0]S;
input [3:0]D;
input SR;
input SL;
reg [3:0]Q;

always@(posedge CLK or negedge CLR)
if (!CLR)begin
       Q<=4'b0000;
end
else begin
    case (S)
    0:Q<=Q;
    1:Q<={Q[2],Q[1],Q[0],SR};
    2:Q<={SL,Q[3],Q[2],Q[1]};
    3:Q<={D[3],D[2],D[1],D[0]}; 
endcase
end

endmodule

