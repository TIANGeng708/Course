 module dec2to4(Y, E, A, B); 
input E; 
input A, B; 
 output [3:0] Y;
 reg [3:0] Y;
always @(E or A or B) 
 if (E) 
 Y <= 4'b1111; 
  else begin  
  case({B, A}) 
  0: Y <= 4'b1111; 
  1: Y <= 4'b1101; 
   2: Y <= 4'b1011;
 3: Y <= 4'b0111;
    endcase
    end 
    endmodule

    module dec2to4_tb; 
    wire [3:0] IN; 
    reg A,B;
    reg E; 
    dec2to4 dec(IN, E, A, B);
initial E=0;
initial begin
$monitor("A=%b, B=%b, IN0 = %b, IN1 = %b, IN2 = %b, IN3 = %b",A,B,IN[0],IN[1],IN[2],IN[3]); 
$display("%3t: B = %b, A = %b, E = %b",$time,B,A,E); 
 #5 B=0; A=0; 
  #5 B=0; A=1; 
  #5 B=1; A=0; 
  #5 B=1; A=1; 
  #10 $finish; 
  end 
   endmodule