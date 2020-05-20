# zufall

Aims to be a generator for all sorts of ids and names. For now only a simple name generator is supported. More to come.

## Animal Generator
Don't know what to name your things? Why not name it after some animals! For now you can randomly generator animal names from german mammals. Idea is based on [Docker's name generator](https://github.com/docker/docker/blob/master/pkg/namesgenerator/names-generator.go).

## Usage
Add  to your dependencies:  

[![Clojars Project](http://clojars.org/io.replikativ/zufall/latest-version.svg)](http://clojars.org/io.replikativ/zufall)
  
   
Start a repl and start hacking:

````clojure
(require '[zufall.core :refer [rand-german-mammal]])
(rand-german-mammal)
;; => "psychotic-lesser-mouse-eared-bat"
```

## License

Copyright © 2020 Konrad Kühne

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
