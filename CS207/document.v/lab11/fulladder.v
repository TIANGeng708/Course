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

