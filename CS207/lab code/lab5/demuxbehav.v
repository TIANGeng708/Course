module demuxbehav(Y, E, A, B);
output  [3:0] Y; 
input E,A,B;
reg [3:0] Y;


always @(A or B)//第一次
case (A)
1:case (B)
    0:Y[2]<=E;
    1:Y[3]<=E;
    endcase

0:case (B)
      0: Y[0]<=E;
      1: Y[1]<=E;
endcase
endcase
always @(A or B)//第二次
case (A)
1:case (B)
    0:Y[0]<=0;
    1:Y[0]<=0;
    endcase

0:case (B)
      0: Y[1]<=0;
      1: Y[0]<=0;
endcase
endcase
always @(A or B)//第三次
case (A)
1:case (B)
    0:Y[1]<=0;
    1:Y[1]<=0;
    endcase

0:case (B)
      0: Y[2]<=0;
      1: Y[2]<=0;
endcase
endcase

always @(A or B)//第四次
case (A)
1:case (B)
    0:Y[3]<=0;
    1:Y[2]<=0;
    endcase

0:case (B)
      0: Y[3]<=0;
      1: Y[3]<=0;
endcase
endcase
endmodule


