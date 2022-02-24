  module tb_74LS138; 
    wire [7:0] IN; 
    reg [2:0]A;
    reg E1,nE2,nE3; 
    dec3to8 dec(IN, E1, nE2, nE3, A);
    //initial E1=1;// nE2=1; nE3=1;
initial begin
E1=1; nE2=0; nE3=0;
$monitor("A[0]=%b, A[1]=%b, A[2]=%b,= %b,%b,%b,%b,%b,%b,%b,%b",A[0],A[1],A[2],IN[0],IN[1],IN[2],IN[3],IN[4],IN[5],IN[6],IN[7],); 
$display("%3t: A0 = %b, A1 = %b, A2=%b, E1 = %b, nE2=%b, nE3=%b",$time,A[0],A[1],A[2],E1,nE2,nE3); 
 #5 A[0]=0; A[1]=0; A[2]=0; 
 #5 A[0]=0; A[1]=0; A[2]=1;
 #5 A[0]=0; A[1]=1; A[2]=0;
 #5 A[0]=0; A[1]=1; A[2]=1;
 #5 A[0]=1; A[1]=0; A[2]=0;
 #5 A[0]=1; A[1]=0; A[2]=1;
 #5 A[0]=1; A[1]=1; A[2]=0;
 #5 A[0]=1; A[1]=1; A[2]=1;
 
  #10 $finish; 
  end 
   endmodule