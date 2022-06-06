class TERNY
    def fwsa
        # rating = 1
        # assment = rating < 2 ? "need to improve " : "keep rocking "
        # puts assment


        puts "Enter a value "
        batch2 = gets.chomp.to_i;   
        a = (batch2 >= 30 ?  true : false);    
        puts a
    end    
end
obj =TERNY.new
obj.fwsa
