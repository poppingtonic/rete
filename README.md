Rete for Triples
====

Clojure RETE implementation for triples.
Better performance on CLIPS benchmarks gives [Rete for Frames] (https://github.com/rururu/rete4frames).

Benchmark table
----

<table>
<tr><td>Test</td><td>CLIPS (msec)</td><td>rete (msec)</td><td>factor</td></tr>
<tr><td>manners8</td><td>1.47</td><td>161</td><td>x 110</td></tr>
<tr><td>manners16</td><td>18</td><td>859</td><td>x 48</td></tr>
<tr><td>manners32</td><td>270</td><td>11100</td><td>x 41</td></tr>
<tr><td>manners64</td><td>8686</td><td>166253</td><td>x 19</td></tr>
<tr><td>manners128</td><td>317384</td><td>4223090</td><td>x 13</td></tr>
</table>

Test results obtained on the same hardware.
As can be seen from the results, rete initially far behind and then starts to catch up CLIPS.

To get the results run in REPL:

```
(require 'clips.like)
(in-ns 'clips.like)
(-main "run:asynch" "examples/manners_pset.clj" "examples/manners_fset8.clj")
```
For further information see [Documentation] (https://github.com/rururu/rete/blob/master/doc/intro.md)

Copyright and license
----

Copyright © 2013 Ruslan Sorokin.

Licensed under the EPL (see the file epl.html).
