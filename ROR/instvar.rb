class INSTVAR
    def fwsa(id,name,rating,team)
        @stud_id=id
        @stud_name=name
        @stud_rating=rating
        @stud_team=team     
    end
    def squad
        puts "The id of stud is #@stud_id"
        puts "The stud name is #@stud_name"
        puts "Rating of stud is #@stud_rating"
        puts "The stud squad is #@stud_team"
    end    
end
obj = INSTVAR.new 
obj.fwsa(2,"Kaushik",4,"TenDots")
obj.squad
