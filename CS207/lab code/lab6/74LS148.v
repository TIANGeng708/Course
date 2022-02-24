module enc8to3(Y, ES, EO, EI, I);
input EI;
input [7:0]I;
output [2:0]Y;
output ES,EO;
wire EI;
//reg ES,EO;


not notEI(notEI,EI);
//not notI0(notI0,)
not notI1(notI1,I[6]);
not notI2(notI2,I[5]);
not notI3(notI3,I[4]);
not notI4(notI4,I[3]);
not notI5(notI5,I[2]);
not notI6(notI6,I[1]);
not notI7(notI7,I[0]);

nand nand_0(nand0,I[7],I[6],I[5],I[4],I[3],I[2],I[1],I[0],notEI);
and and_01(EO,nand0);
not notnand0(notnand0,nand0);
//此处将notEI再not回来，仍然为EI;
or or_0(ES,EI,notnand0);
//至此EO,ES输出完毕


and and_1(and1,notEI,notI7);
and and_2(and2,notEI,notI6);
and and_3(and3,notEI,notI5);
and and_4(and4,notEI,notI4);
nor norA2(Y[2],and1,and2,and3,and4);


and and_5(and5,notEI,notI7);
and and_6(and6,notEI,notI6);
and and_7(and7,notEI,I[2],I[3],notI3);
and and_8(and8,notEI,I[2],I[3],notI2);
nor norA1(Y[1],and5,and6,and7,and8);


and and_9(and9,notEI,notI7);
and and_10(and10,notEI,I[1],notI5);
and and_11(and11,notEI,I[1],I[3],notI3);
and and_12(and12,notEI,I[1],I[3],I[5],notI1);
nor norA0(Y[0],and9,and10,and11,and12);



endmodule

  