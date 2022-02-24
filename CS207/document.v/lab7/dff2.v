module dff2(F,X,Y);
input X;
input Y;
output F;
//reg F;
//wire q2;
//wire nq2;
dff dff_1(F,1'b1,X,nq2);
dff dff_2(q2,1'b1,Y,F);
not not_1(nq2,q2);


endmodule

module dff(Q,D,CLK,R);
input R;
input CLK;
input D;
output Q;
reg Q;

//always@(negedge R) begin
//Q<=0;
//end


always@(posedge CLK or negedge R) begin
if (~R) begin
    Q<=0;
end
else begin
case(D)
0 : Q<=0;
1 : Q<=1;
endcase
end end

//always@(negedge R) begin
//Q<=0;
//end
endmodule

























