module comparator_1(F, A, B);
 input A,B;
 output [2:0]F;
wire not1,not2;
wire and1,and2,and3;

 not not_1(not1,A);
 and and_1(F[0],not1,B);

 not not_2(not2,B);
 and and_2(and2,not1,not2);
 and and_3(and3,A,B);
 or or_1(F[1],and2,and3);

 and andd_4(F[2],A,not2);
 endmodule

