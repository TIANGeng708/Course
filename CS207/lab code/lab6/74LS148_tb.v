module tb_74LS138; 
    wire [2:0] Y; 
    wire ES,EO;
    reg [7:0]I;
    reg EI; 
   enc8to3 dec(Y, ES, EO, EI, I);
   initial EI=0;
initial begin
 //EI=0;
$monitor("%b,%b,%b,%b,%b,%b,%b,%b  %b,%b,%b   %b,%b",I[0],I[1],I[2],I[3],I[4],I[5],I[6],I[7],Y[2],Y[1],Y[0],ES,EO); 
$display("%3t: I0 = %b, I1 = %b, I2=%b, I3=%b, I4=%b, I5=%b, I6=%b, I7=%b, ES = %b, EO=%b, EI=%b",$time,I[0],I[1],I[2],I[3],I[4],I[5],I[6],I[7],ES,EO,EI); 
 #5 I[0]=1; I[1]=1; I[2]=1; I[3]=1; I[4]=1; I[5]=1; I[6]=1; I[7]=1; 

 
  #10 $finish; 
  end 
   endmodule