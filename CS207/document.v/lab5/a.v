module a(Y, E, A, B);
output  [3:0] Y; 
input E,A,B;
reg [3:0] Y;

always @(A or B)//第一次
case (A)
1:case (A)//已结束
1:case (A)//已结束
1:case (A)//已结束
1:case (B)//A=1
    0:Y[2]<=E;
    1:Y[3]<=E;
    endcase
    default: 
    case(B)//A=0
    0:Y[1]<=~E;
    1:Y[0]<=~E;
    endcase
    endcase
    default:
    case(B)//A=0
    0:Y[2]<=~E;
    1:Y[2]<=~E;
    endcase
    endcase
    default:
    case(B)//A=0
    0:Y[3]<=~E;
    1:Y[3]<=~E;
    endcase
    endcase
0:case (A)//已结束
0:case (A)//已结束
0:case (A)//已结束
0:case (B)//A=0
      0: Y[0]<=E;
      1: Y[1]<=E;
endcase
default:
case(B)//A=1
      0:Y[0]<=~E;
      1:Y[0]<=~E;
      endcase
      endcase
default:
case(B)//A=1
      0:Y[1]<=~E;
      1:Y[1]<=~E;
      endcase
      endcase
      default:
case(B)//A=1
      0:Y[3]<=~E;
      1:Y[2]<=~E;
      endcase
      endcase

      endmodule

      module a_tb; 
   reg  IN; 
   reg S;
   reg T; 
   wire [3:0] OUT;
 a mux(OUT, IN, S, T);
  initial begin
  IN=1;
  $display("IN = %b, S = %b, T = %b", IN,S,T);
  $monitor("%3t: A = %b, B = %b, OUT0 = %b,OUT1=%b,OUT2=%b,OUT3=%b", $time, S, T, OUT[0], OUT[1], OUT[2], OUT[3]);
    #5 S=0; T=0; 
    #5 S=1; T=0; 
    #5 S=0; T=1; 
    #5 S=1; T=1;
    #10 $finish;
    end
   endmodule
