module add_sub(D, CO, X, A, B, CI);
output D,CO;
input X,A,B,CI;
reg D,CO;

always@(X,A,B,CI) begin
case ({A,B,CI,X}) 
    4'b0000:D=0; 
    4'b0001:D=0;
    4'b0010:D=1;
    4'b0011:D=1;
    4'b0100:D=1;
    4'b0101:D=1;
    4'b0110:D=0;
    4'b0111:D=0;
    4'b1000:D=1;
    4'b1001:D=1;
    4'b1010:D=0;
    4'b1011:D=0;
    4'b1100:D=0;
    4'b1101:D=0;
    4'b1110:D=1;
    4'b1111:D=1;
    //default:D=1;
endcase
case ({A,B,CI,X}) 
    4'b0000:CO=0; 
    4'b0001:CO=0;
    4'b0010:CO=0; 
    4'b0011:CO=1;
    4'b0100:CO=0; 
    4'b0101:CO=1;
    4'b0110:CO=1; 
    4'b0111:CO=1;
    4'b1000:CO=0; 
    4'b1001:CO=0;
    4'b1010:CO=1; 
    4'b1011:CO=0;
    4'b1100:CO=1; 
    4'b1101:CO=0;
    4'b1110:CO=1; 
    4'b1111:CO=1;
        //default: CO=1;
endcase
end
endmodule

