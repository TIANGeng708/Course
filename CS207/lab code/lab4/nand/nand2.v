module nand2(F, A, B, C, D);
input A,B,C,D;
output F;

nand nand_1(nand1,B);
nand nand_2(nand2,C);
//生成B'和C'，下面进行值的输入

nand nand_3(nand3,C,D);
//表示一个与非门

nand nand_4(nand4,nand3,nand1);
//表示一个与非门

nand nand_5(nand5,nand4,A);
//表示一个与非门

nand nand_6(nand6,B,nand2);
//表示一个与非门

nand nand_7(F,nand5,nand6);
//表示一个与非门


endmodule


