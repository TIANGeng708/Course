module moore(Z, Q, X, clk);
output reg Z; 
output reg [1:0]Q;
input [1:0]X;
input clk;

always @(Q[0] or Q[1])
case({Q[1], Q[0]})
1, 2: Z <= 1'd1;  
default: Z <= 1'd0;
endcase   

always @(posedge clk) 
case({Q[1], Q[0], X[1], X[0]}) 
0, 3, 7, 11, 12, 15: {Q[1], Q[0]} <= 2'b00; 
1, 4, 5: {Q[1], Q[0]} <= 2'b01; 
2, 8, 10: {Q[1], Q[0]} <= 2'b10; 
6, 9, 13, 14: {Q[1], Q[0]} <= 2'b11; 
default: {Q[1], Q[0]} <= 2'b00; 
endcase 
endmodule