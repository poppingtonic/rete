((Generate-Combinations
   1
   ((?s value ?e))
   =>
   ((retract ?s value ?e)
     (asser 1 ?s ?e)
     (asser 2 ?s ?e)
     (asser 3 ?s ?e)
     (asser 4 ?s ?e)
     (asser 5 ?s ?e)))
  (Find-Solution
    0
    ((?h1 nationality englishman
          color red)
      (?h2 nationality spaniard
           pet dog)
      (?h2 != ?h1)
      (?h3 color ivory)
      (?h4 color green
           drink coffee)
      (?h3 != ?h1)
      (?h4 != ?h1
           != ?h3)
      ((+ 1 ?h3) = ?h4)
      (?h5 drink milk
           = 3)
      (?h5 != ?h4)
      (?h6 smokes old-golds
           pet snails)
      (?h6 != ?h2)
      (?h7 nationality ukrainian
           drink tea)
      (?h7 != ?h1
           != ?h2
           != ?h4
           != ?h5)
      (?h8 nationality norwegian
           = 1)
      (?h8 != ?h1
           != ?h2
           != ?h7)
      (?h9 smokes chesterfields)
      (?h10 pet fox)
      (?h9   != ?h6)
      (?h10 != ?h2
            != ?h6)
      ((= ?h9 (+ ?h10 1)) or (= ?h9 (- ?h10 1)))
      (?h11 smokes lucky-strikes
            drink orange-juice)
      (?h11 != ?h6
            != ?h9
            != ?h4
            != ?h5
            != ?h7)
      (?h12 nationality japanese
            smokes parliaments)
      (?h12 != ?h1
            != ?h2
            != ?h7
            != ?h8
            != ?h6
            != ?h9
            != ?h11)
      (?h13 pet horse)
      (?h14 smokes kools
            color yellow)
      (?h13 != ?h2
            != ?h6
            != ?h10)
      (?h14 != ?h6
            != ?h9
            != ?h11
            != ?h12
            != ?h1
            != ?h3
            != ?h4)
      ((= ?h13 (+ ?h14 1)) or (= ?h13 (- ?h14 1)))
      (?h15 color blue)
      (?h15 != ?h1
            != ?h3
            != ?h4
            != ?h14)
      ((= ?h8 (+ ?h15 1)) or (= ?h8 (- ?h15 1)))
      (?h16 drink water)
      (?h16 != ?h4
            != ?h5
            != ?h7
            != ?h11)
      (?h17 pet zebra)
      (?h17 != ?h2
            != ?h6
            != ?h10
            != ?h13))
    =>
    ((println [?h1 ?h2 ?h3 ?h4 ?h5 ?h6 ?h7 ?h8 ?h9 ?h10 ?h11 ?h12 ?h13 ?h14 ?h15 ?h16 ?h17]))))

