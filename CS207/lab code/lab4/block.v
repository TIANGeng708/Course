module blocking_nonblocking();
reg a,b,c,d;

initial begin
$dumpfile("wave1.vcd");
$dumpvars(0, blocking_nonblocking);
end

initial begin
    #10 a=0;
    #11 a=1;
    #12 a=0;
    #13 a=1;

end

initial begin
    #10 b<=0;
    #11 b<=1;
    #12 b<=0;
    #13 b<=1;
    
end

initial begin
    c=#10 0;
    c=#11 1;
    c=#12 0;
    c=#13 1;
    
end

initial begin
    #10 d<=0;
    #11 d<=1;
    #12 d<=0;
    #13 d<=1;
    
end

initial begin
$monitor("TIME= %2t A = %b B = %b C = %b D = %b",$time, a, b, c , d); 
#50 $finish;
end
endmodule