module traffic(road, rail, C, reset);
input C;
input reset;

output [2:0]rail;
output [2:0]road;

reg [2:0]rail;
reg [2:0]road;
reg sensor;
reg dilingmiao;
reg diyimiao;
reg diermiao;
reg test;

initial begin
    road<=001;
end
initial begin
    rail<=100;
    
    
end
initial begin
    test<=1;
end

always@(C)
begin
    
    if(rail!=2&&road!=2&&($time!=0||($time==0&&C==1))) begin
        sensor<=!C;sensor<=!sensor;
        
    end

   
    if(rail==2||road==2)begin
        if(dilingmiao==1&&diyimiao==0&&diermiao==0)begin
            if (C<=0) begin
        #3 road<=001;rail<=100;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
    else begin
        #3 road<=100;rail<=001;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
        end
        

      
        if(dilingmiao==1&&diyimiao==1&&diermiao==0)begin
            if (C<=0) begin
        #2 road<=001;rail<=100;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
    else begin
        #2 road<=100;rail<=001;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
        end


if(dilingmiao!=0&&diyimiao!=0&&diermiao!=0)begin
    
            if (C<=0) begin
        #1 road<=001;rail<=100;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
    else begin
        #1 road<=100;rail<=001;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
        end


    end

end


    
always@(negedge sensor)

begin
    
    if (road!=001 && rail !=100) begin
    #1 rail<=010;dilingmiao<=1;
    #1 diyimiao<=1;
    #1 diermiao<=1;
    //#1 test=!test;
    if (C<=0) begin
        #1 road<=001;rail<=100;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
    
    else begin
        #1 road<=100;rail<=001;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
 
    end
    
    end 

    

always@(posedge sensor)
begin

  
   
    if (road!=100 && rail!=001) begin
    #1 road<=010;dilingmiao<=1;
    #1 diyimiao<=1;
    #1 diermiao<=1;
    //#1 test=!test;
    if (C<=1) begin
        
    #1 road<=100;rail<=001;dilingmiao<=0;diyimiao<=0;diermiao<=0;
    end
    else begin
        #1 road<=001;rail<=100;dilingmiao<=0;diyimiao<=0;diermiao<=0;

    
    end
    end  
    end 


    


endmodule




