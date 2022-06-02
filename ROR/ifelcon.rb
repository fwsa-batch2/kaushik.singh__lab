class IFELCON
    def kaushik
        puts "Enter a value "
        age = gets.chomp.to_i
        if age >=18 
            puts "valid"
        else 
            puts "not valid"
        end  
    end
end
obj = IFELCON.new
obj.kaushik