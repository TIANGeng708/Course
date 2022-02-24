module timer(a, b); 
output a, b;
reg a,b;
initial begin 
  $dumpfile("timer.vcd");
  $dumpvars(0, timer);
  end

  always begin
     #0  a=0;
     #0  a=1;
     #5 a=0;//5
     #5 a=1;//10
     #5 a=0;//15
     #5  a=0;//20
    end
    initial begin
    #0 b=1;
    end

    always @(posedge a) begin
    b=~b;

    end
    initial begin
    #100 $finish;
    end
    
endmodule