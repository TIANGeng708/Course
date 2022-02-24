module xhalways;
reg clock;
//Initialize clock at time zero
initial
        clock = 1'b 0;
//Toggle clock every half cycle (time period = 20)
always
        #30 clock = ~clock;
always
        #10 clock = ~clock;
     
endmodule
 