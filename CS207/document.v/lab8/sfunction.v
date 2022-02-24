module sfunction(Y, X);
input [3:0]X;
output [3:0]Y;

and and_1(Y[3],1'b0);

not not_1(not1,X[3]);
not not_2(not2,X[2]);
and and_2(and2,not1,X[2]);
and and_3(and3,not2,X[3]);
or or_1(Y[2],and2,and3);

not not_3(not3,X[1]);
and and_4(and4,X[3],X[2],not3);
and and_5(and5,not1,not2,X[1]);
or or_2(Y[1],and4,and5);

not not_4(not4,X[0]);
and and_6(and6,X[0],not1);
and and_7(and7,X[2],X[1],not4);
and and_8(and8,X[3],X[1],not4);
and and_9(and9,X[3],not3,not4);
and and_10(and10,X[3],not2,not3);
or or_3(Y[0],and6,and7,and8,and9,and10);
endmodule


