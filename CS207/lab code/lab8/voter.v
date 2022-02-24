module voter(F, A, B, C);
input A,B,C;
output F;

and and_1(and1,B,C);
and and_2(and2,A,C);
and and_3(and3,A,B);

or or_1(F,and1,and2,and3);
endmodule


