module kmap(F,inA,inB,inC,inD);
input inA,inB,inC,inD;
output F;
//A'C'D'+CD'+AB'D'+ABC'D
wire notA,notB,notC,notD;
wire  r1,r2,r3,r4;

not not_1(notA,inA);
not not_2(notB,inB);
not not_3(notC,inC);
not not_4(notD,inD);

and and_1(r1,notA,notC,notD);
//A'C'D'
and and_2(r2,inC,notD);
//CD'
and and_3(r3,inA,notB,notD);
//AB'D'
and and_4(r4,inA,inB,notC,inD);
//ABC'D

or or_1(F,r1,r2，r3.r4);
endmodule
module kmap_tb;
reg inA,inB,inC,inD;
wire F;

kmap kmap_1(F,inA,inB,inC,inD);

initial begin
    $monitor("%3t: A is %b,B is %b,C is %b,D is %b,F is %b.",$time,inA,inB,inC,inD,F);
    # 5 A=0;B=0;C=0;D=1;
  # 5 A=0;B=0;C=0;D=0;
  # 5 A=0;B=0;C=1;D=1;
  # 5 A=0;B=0;C=1;D=0;

   # 5 A=0;B=1;C=0;D=1;
   # 5 A=0;B=1;C=0;D=0;
   # 5 A=0;B=1;C=1;D=1;
   # 5 A=0;B=1;C=1;D=0;

  # 5 A=1;B=0;C=0;D=1;
  # 5 A=1;B=0;C=0;D=0;
  # 5 A=1;B=0;C=1;D=1;
  # 5 A=1;B=0;C=1;D=0;

   # 5 A=1;B=1;C=0;D=1;
   # 5 A=1;B=1;C=0;D=0;
   # 5 A=1;B=1;C=1;D=1;
   # 5 A=1;B=1;C=1;D=0;

# 10 $finish;
end
endmodule 
