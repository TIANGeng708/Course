module universal_tb; 
reg CLR;
reg CLK;
reg [1:0]S;
reg [3:0]D;
reg SR;
reg SL;
wire [3:0]Q;
universal myadd(Q, CLR, CLK, S, D, SR, SL);

initial begin
    CLK<=0;
end
initial begin
    CLR<=0;
end
initial begin
    S[0]<=0;
end
initial begin
    S[1]<=0;
end
initial begin
    SL<=0;
end
initial begin
    SR<=1;
end
initial begin
    D<=4'b0011;
end
always@(CLK)
begin
    #1 CLK<=!CLK;
end

always@(CLR)
begin
    #4 CLR<=!CLR;
end

always@(S[0])
begin
    #3 S[0]<=!S[0];
end

always@(S[1])
begin
    #5 S[1]<=!S[1];
end



initial begin 
$monitor("%3t:%b   %b   %b   %b %b   %b %b %b %b   %b %b %b %b",$time,CLR,S,CLK,SL,SR,D[0],D[1],D[2],D[3],Q[0],Q[1],Q[2],Q[3]); 
//# 5 CLR=0;S=2'b01;

# 100 $finish;
  end 
  endmodule

