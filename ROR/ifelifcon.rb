class IFELIFCON
    def kaushik
        puts "Enter a value "
        age = gets.chomp.to_i
        if age <60
            puts "valid"            
        elsif age >= 18 & age!=0
             puts "not valid"        
        else
            "there no num"
        end
        
    end
end
obj = IFELIFCON.new
obj.kaushik