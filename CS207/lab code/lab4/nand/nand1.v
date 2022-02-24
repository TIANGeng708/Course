module nand1(F, A, B, C, D);
input A,B,C,D;
output F;

not not_1 (notC,C);
//这里生成了C'
and and_1(and1,C,D);
and and_2(and2,B,notC);

or or_1(or1,and1,B);

and and_3(and3,or1,A);
or or_2(F,and3,and2);

endmodule