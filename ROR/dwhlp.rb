class DWHLP
    def dwlp
        loop do   
            puts "Checking for answer"   
            answer = gets.chomp   
            if answer != '5'   
              break   
            end   
         end
    end
end
obj=DWHLP.new
obj.dwlp