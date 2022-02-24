module mul_8(X, Y, Z);
input [7:0]X;
input [7:0]Y;
output [15:0]Z;

and and_1(B0_1,X[0],Y[7]);
and and_2(B1_1,X[1],Y[7]);
and and_3(B2_1,X[2],Y[7]);
and and_4(B3_1,X[3],Y[7]);
and and_5(B4_1,X[4],Y[7]);
and and_6(B5_1,X[5],Y[7]);
and and_7(B6_1,X[6],Y[7]);
and and_8(B7_1,X[7],Y[7]);

and and_9(B0_2,X[0],Y[6]);
and and_10(B1_2,X[1],Y[6]);
and and_11(B2_2,X[2],Y[6]);
and and_12(B3_2,X[3],Y[6]);
and and_13(B4_2,X[4],Y[6]);
and and_14(B5_2,X[5],Y[6]);
and and_15(B6_2,X[6],Y[6]);
and and_16(B7_2,X[7],Y[6]);

and and_17(B0_3,X[0],Y[5]);
and and_18(B1_3,X[1],Y[5]);
and and_19(B2_3,X[2],Y[5]);
and and_20(B3_3,X[3],Y[5]);
and and_21(B4_3,X[4],Y[5]);
and and_22(B5_3,X[5],Y[5]);
and and_23(B6_3,X[6],Y[5]);
and and_24(B7_3,X[7],Y[5]);

and and_25(B0_4,X[0],Y[4]);
and and_26(B1_4,X[1],Y[4]);
and and_27(B2_4,X[2],Y[4]);
and and_28(B3_4,X[3],Y[4]);
and and_29(B4_4,X[4],Y[4]);
and and_30(B5_4,X[5],Y[4]);
and and_31(B6_4,X[6],Y[4]);
and and_32(B7_4,X[7],Y[4]);

and and_33(B0_5,X[0],Y[3]);
and and_34(B1_5,X[1],Y[3]);
and and_35(B2_5,X[2],Y[3]);
and and_36(B3_5,X[3],Y[3]);
and and_37(B4_5,X[4],Y[3]);
and and_38(B5_5,X[5],Y[3]);
and and_39(B6_5,X[6],Y[3]);
and and_40(B7_5,X[7],Y[3]);

and and_41(B0_6,X[0],Y[2]);
and and_42(B1_6,X[1],Y[2]);
and and_43(B2_6,X[2],Y[2]);
and and_44(B3_6,X[3],Y[2]);
and and_45(B4_6,X[4],Y[2]);
and and_46(B5_6,X[5],Y[2]);
and and_47(B6_6,X[6],Y[2]);
and and_48(B7_6,X[7],Y[2]);

and and_49(A0_7,X[0],Y[1]);
and and_50(A1_7,X[1],Y[1]);
and and_51(A2_7,X[2],Y[1]);
and and_52(A3_7,X[3],Y[1]);
and and_53(A4_7,X[4],Y[1]);
and and_54(A5_7,X[5],Y[1]);
and and_55(A6_7,X[6],Y[1]);
and and_56(A7_7,X[7],Y[1]);

and and_57(B0_7,X[1],Y[0]);
and and_58(B1_7,X[2],Y[0]);
and and_59(B2_7,X[3],Y[0]);
and and_60(B3_7,X[4],Y[0]);
and and_61(B4_7,X[5],Y[0]);
and and_62(B5_7,X[6],Y[0]);
and and_63(B6_7,X[7],Y[0]);
and and_64(B7_7,1'b0);
and and_65(Z[0],X[0],Y[0]);








eight_bit_adder eight_bit_adder_1(Z[7],Z[8],Z[9],Z[10],Z[11],Z[12],Z[13],Z[14],Z[15],S1_2,S2_2,S3_2,S4_2,S5_2,S6_2,S7_2,C_2,B0_1,B1_1,B2_1,B3_1,B4_1,B5_1,B6_1,B7_1,1'b0);
eight_bit_adder eight_bit_adder_2(Z[6],S1_2,S2_2,S3_2,S4_2,S5_2,S6_2,S7_2,C_2,S1_3,S2_3,S3_3,S4_3,S5_3,S6_3,S7_3,C_3,B0_2,B1_2,B2_2,B3_2,B4_2,B5_2,B6_2,B7_2,1'b0);
eight_bit_adder eight_bit_adder_3(Z[5],S1_3,S2_3,S3_3,S4_3,S5_3,S6_3,S7_3,C_3,S1_4,S2_4,S3_4,S4_4,S5_4,S6_4,S7_4,C_4,B0_3,B1_3,B2_3,B3_3,B4_3,B5_3,B6_3,B7_3,1'b0);
eight_bit_adder eight_bit_adder_4(Z[4],S1_4,S2_4,S3_4,S4_4,S5_4,S6_4,S7_4,C_4,S1_5,S2_5,S3_5,S4_5,S5_5,S6_5,S7_5,C_5,B0_4,B1_4,B2_4,B3_4,B4_4,B5_4,B6_4,B7_4,1'b0);
eight_bit_adder eight_bit_adder_5(Z[3],S1_5,S2_5,S3_5,S4_5,S5_5,S6_5,S7_5,C_5,S1_6,S2_6,S3_6,S4_6,S5_6,S6_6,S7_6,C_6,B0_5,B1_5,B2_5,B3_5,B4_5,B5_5,B6_5,B7_5,1'b0);
eight_bit_adder eight_bit_adder_6(Z[2],S1_6,S2_6,S3_6,S4_6,S5_6,S6_6,S7_6,C_6,S1_7,S2_7,S3_7,S4_7,S5_7,S6_7,S7_7,C_7,B0_6,B1_6,B2_6,B3_6,B4_6,B5_6,B6_6,B7_6,1'b0);
eight_bit_adder eight_bit_adder_7(Z[1],S1_7,S2_7,S3_7,S4_7,S5_7,S6_7,S7_7,C_7,A0_7,A1_7,A2_7,A3_7,A4_7,A5_7,A6_7,A7_7,B0_7,B1_7,B2_7,B3_7,B4_7,B5_7,B6_7,B7_7,1'b0);


endmodule







module eight_bit_adder(S0,S1,S2,S3,S4,S5,S6,S7,C,A0,A1,A2,A3,A4,A5,A6,A7,B0,B1,B2,B3,B4,B5,B6,B7,C0);
input C0;
input A0,A1,A2,A3,A4,A5,A6,A7;
input B0,B1,B2,B3,B4,B5,B6,B7;
output C;
output S0,S1,S2,S3,S4,S5,S6,S7;
fulladder fulladder_1(S0,C1,A0,B0,C0);
fulladder fulladder_2(S1,C2,A1,B1,C1);
fulladder fulladder_3(S2,C3,A2,B2,C2);
fulladder fulladder_4(S3,C4,A3,B3,C3);
fulladder fulladder_5(S4,C5,A4,B4,C4);
fulladder fulladder_6(S5,C6,A5,B5,C5);
fulladder fulladder_7(S6,C7,A6,B6,C6);
fulladder fulladder_8(S7,C,A7,B7,C7);
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

