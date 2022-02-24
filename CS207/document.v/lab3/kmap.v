module kmap(F, A, B, C, D);
input A, B, C, D;
output F;
wire notA, notB, notC, notD;
wire and1, and2, and3;
//F=B'D'+CD'+ABC'D
not not_1 (notA, A);
not not_1 (notB, B);
not not_1 (notC, C);
not not_1 (notD, D);
and and_1 (anda, C, notD);
and and_2 (andb, notB, notD);
and and_3 (andc, A, B, notC, D);
or or_1 (F, anda, andb, andc);


endmodule
