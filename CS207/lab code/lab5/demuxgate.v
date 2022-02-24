module demuxgate(Y, E, A, B);
output  [3:0] Y; 
input E,A,B;
wire not0,not1;

not not_0(not0,A);
not not_1(not1,B);
and and_0(Y[0], E, not0, not1);
and and_1(Y[1], E, not0, B);
and and_2(Y[2], E, A, not1);
and and_3(Y[3], E, A, B);
endmodule






