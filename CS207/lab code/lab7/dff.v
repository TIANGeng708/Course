module dff(Q, D, CLK);
input CLK;
input D;
output Q;
reg Q;
always@(posedge CLK) begin
case(D)
0 : Q<=0;
1 : Q<=1;
endcase
    end


endmodule








































