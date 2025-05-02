# Debugging repository
This mini repository has been setup to help clojure Calva development by reproducing an issue: [REPL fails to connect #2806](https://github.com/BetterThanTomorrow/calva/issues/2806)

## Steps to reproduce:
1. Clone repository
2. cd <path to repo>
3. run `clojure -M:test:frontend:dev`
4. Open the project directory with calva compatible editor
5. run calva command `Calva: Connect to running REPL server in the project`
6. select shadow-cljs

**Expected:**
Connection succeeds

**Actual:**
Connection fails with
```
; Connecting using "shadow-cljs" project type.
; You can make Calva auto-select this.
;   - See https://calva.io/connect-sequences/
; 
; Connecting ...
; Reading port file: file:///Users/tommimartin/Projects/calva-test/.shadow-cljs/nrepl.port ...
; Using host:port localhost:7000 ...
; Hooking up nREPL sessions ...
; Failed connecting.
; nREPL Connection was closed
```

Calva extension reports: 
![Calva extension error](calva-ext-error.png)
