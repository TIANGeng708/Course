module demuxgate_tb; 
   reg  IN; 
   reg S;
   reg T; 
   wire [3:0] OUT;
 demuxbehav mux(OUT, IN, S, T);
  initial begin
  IN=1;
  $display("IN = %b, S = %b, T = %b", IN,S,T);
  $monitor("%3t: A = %b, B = %b, OUT0 = %b,OUT1=%b,OUT2=%b,OUT3=%b", $time, S, T, OUT[0], OUT[1], OUT[2], OUT[3]);
    #5 S=0; T=0; 
    #5 S=1; T=0; 
    #5 S=0; T=1; 
    #5 S=1; T=1;
    #10 $finish;
    end
   endmodule