module tff(Q, T, CLK);
input CLK;
input T;
output Q;
reg Q;
//initial begin
  //  Q<=0;
//end

always@(posedge CLK) begin
    case(T)
    0 : Q<=Q;
    1 : Q<=~Q;
    endcase
end
endmodule








































