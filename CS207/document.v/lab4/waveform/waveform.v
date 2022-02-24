module waveform(a,b,c);
output a,b,c;
reg a,b,c;

initial begin
$dumpfile("waveform.vcd");
$dumpvars(0, waveform);
end

initial begin
    #0  a=0;
    #5  a=1;
    #5 a=0;
    #5 a=1;
    #5 a=0;
    #30 $finish;
    end
    
initial begin
    #0  b=0;
    #20 b=1;
    #5  b=0;
    #15 b=1;
    #10 $finish;
    end

initial begin
    #0  c=0;
    #20 c=1;
    #10 c=0;
    #10 c=1;
    #20 $finish;
    end

//initial begin
//$monitor("TIME= %2t A = %b ",$time, a); 
//#50 $finish;
//end
endmodule