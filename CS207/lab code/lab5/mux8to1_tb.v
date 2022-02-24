module mux8to1_tb; 
   reg [7:0] IN; 
   reg [2:0] S; 
   wire OUT;
 mux8to1 mux(OUT, S,IN);
  initial begin
  IN[0]=0; IN[1]=1; IN[2]=0; IN[3]=0;IN[4]=0; IN[5]=0; IN[6]=0; IN[7]=0;
  $display("IN0 = %b, IN1 = %b, IN2 = %b, IN3 = %b, IN4 = %b, IN5 = %b, IN6 = %b, IN7 = %b", IN[0], IN[1], IN[2], IN[3],IN[4], IN[5], IN[6], IN[7] );
   $monitor("%3t: S1=%b, S1 = %b, S0 = %b, OUT = %b", $time,S[2], S[1], S[0], OUT);
    #5 S[0]=0; S[1]=0; S[2]=0;
    #5 S[0]=1; S[1]=0; S[2]=0;
    #5 S[0]=0; S[1]=1; S[2]=0;
    #5 S[0]=1; S[1]=1; S[2]=0;
    #5 S[0]=0; S[1]=0; S[2]=1;
    #5 S[0]=1; S[1]=0; S[2]=1;
    #5 S[0]=0; S[1]=1; S[2]=1;
    #5 S[0]=1; S[1]=1; S[2]=1;
    #10 $finish;
    end
   endmodule