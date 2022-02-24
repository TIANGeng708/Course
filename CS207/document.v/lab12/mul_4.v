 module mul_4(X, Y, Z); 
 input [3:0]X;
 input [3:0]Y;
 output [7:0]Z;

 and and_1(B0_1,X[0],Y[3]);
 and and_2(B1_1,X[1],Y[3]);
 and and_3(B2_1,X[2],Y[3]);
 and and_4(B3_1,X[3],Y[3]);
 and and_5(B0_2,X[0],Y[2]);
 and and_6(B1_2,X[1],Y[2]);
 and and_7(B2_2,X[2],Y[2]);
 and and_8(B3_2,X[3],Y[2]);
 and and_9(A0_3,X[0],Y[1]);
 and and_10(A1_3,X[1],Y[1]);
 and and_11(A2_3,X[2],Y[1]);
 and and_12(A3_3,X[3],Y[1]);
 and and_13(Z[0],X[0],Y[0]);
 and and_14(B0_3,X[1],Y[0]);
 and and_15(B1_3,X[2],Y[0]);
 and and_16(B2_3,X[3],Y[0]);
 and and_17(B3_3,0);

 
 four_bit_adder four_bit_adder_1(Z[3],Z[4],Z[5],Z[6],Z[7],S1_2,S2_2,S3_2,C_2,B0_1,B1_1,B2_1,B3_1,1'b0);
 four_bit_adder four_bit_adder_2(Z[2],S1_2,S2_2,S3_2,C_2,S1_3,S2_3,S3_3,C_3,B0_2,B1_2,B2_2,B3_2,1'b0);
 four_bit_adder four_bit_adder_3(Z[1],S1_3,S2_3,S3_3,C_3,A0_3,A1_3,A2_3,A3_3,B0_3,B1_3,B2_3,B3_3,1'b0);
 endmodule











module four_bit_adder(S0,S1,S2,S3,C,A0,A1,A2,A3,B0,B1,B2,B3,C0);
input C0;
input A0,A1,A2,A3;
input B0,B1,B2,B3;
output C;
output S0,S1,S2,S3;
fulladder fulladder_1(S0,C1,A0,B0,C0);
fulladder fulladder_2(S1,C2,A1,B1,C1);
fulladder fulladder_3(S2,C3,A2,B2,C2);
fulladder fulladder_4(S3,C,A3,B3,C3);
endmodule




module fulladder(S, C, A, B, X); 
input A,B,X;
output S,C;

not not_a(nota,A);
not not_b(notb,B);
not not_x(notx,X);

and and_1(and1,notx,nota,B);
and and_2(and2,notx,A,notb);
and and_3(and3,X,nota,notb);
and and_4(and4,X,A,B);
or or_1(S,and1,and2,and3,and4);

and and_5(and5,A,B);
and and_6(and6,B,X);
and and_7(and7,A,X);
or or_2(C,and5,and6,and7);
endmodule


