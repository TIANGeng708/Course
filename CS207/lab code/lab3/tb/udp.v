primitive udp(f, a, b, c, d); 
input a, b, c, d;
output f; 
  
   
 //f=(b + d)(a′ + b′ + c).  
  table 
  // a b c d : f 
     1 1 1 1 : 1; 
     1 0 1 1 : 1;
     1 1 0 1 : 0;
     1 1 1 0 : 1;
     1 0 0 1 : 1;
     1 0 1 0 : 0;
     1 1 0 0 : 0;
     1 0 0 0 : 0;
     0 1 1 1 : 1;
     0 0 1 1 : 1;
     0 1 0 1 : 1;
     0 1 1 0 : 1;
     0 0 0 1 : 1;
     0 0 1 0 : 0;
     0 1 0 0 : 1;
     0 0 0 0 : 0;
endtable 
endprimitive
module testbench;
reg a, b, c, d;
wire f;

udp u(f, a, b, c, d);

initial
begin
 $monitor("%3t: a is %b, b is %b, c is %b, d %b, f is %b.", $time, a, b, c, d, f);
# 5 a = 1; b = 0; c=0; d=0;
  # 5 a = 1; b = 1; c=0; d=0;
  # 5 a = 1; b = 0; c=1; d=0;
  # 5 a = 1; b = 0; c=0; d=1;
  # 5 a = 1; b = 1; c=1; d=0;
  # 5 a = 1; b = 1; c=0; d=1;
  # 5 a = 1; b = 0; c=1; d=1;
  # 5 a = 1; b = 1; c=1; d=1;
  # 5 a = 0; b = 0; c=0; d=0;
  # 5 a = 0; b = 1; c=0; d=0;
  # 5 a = 0; b = 0; c=1; d=0;
  # 5 a = 0; b = 0; c=0; d=1;
  # 5 a = 0; b = 1; c=1; d=0;
  # 5 a = 0; b = 1; c=0; d=1;
  # 5 a = 0; b = 0; c=1; d=1;
  # 5 a = 0; b = 1; c=1; d=1;
  # 10 $finish; 
# 5 $finish;
end
endmodule


