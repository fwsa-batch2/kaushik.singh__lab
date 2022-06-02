class IFCON
    def kaushik
        puts "Enter a value "
        age = gets.chomp.to_i
        if age >=18 
            puts "valid"
        end  
    end
end
obj = IFCON.new
obj.kaushik

