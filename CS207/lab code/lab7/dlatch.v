module dlatch(Q, nQ, D, G);
input G;
input D;
output Q, nQ;
reg Q;
reg nQ;
always @(G) begin
    if(G) begin
    case(D) 
    0 : {Q,nQ}<=2'b01;
    1 : {Q,nQ}<=2'b10;
    endcase
    end
    
end
endmodule















































