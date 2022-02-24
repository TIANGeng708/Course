module jkff(Q, J, K, CLK);
input CLK;
input J;
input K;
output Q;
reg Q;

always@(posedge CLK) begin
    case ({J,K})
      0  : Q=Q;
      1  : Q=0;
      2  : Q=1;
      3  : Q=~Q;
        //default: 
    endcase
end
endmodule










































