# java-reflex

A practice program for Java coding assessments (HackerRank / LeetCode-style graduate and
junior developer tests). The aim is that each common problem pattern becomes a **reflex**: you can write it from a blank file, correctly and
quickly, without stopping to think about syntax.

**Success = 57 / 57 drills at reflex, and 80+ on every mock.**

## How it works (simple version first)

You learn a problem by **writing it from scratch again and again, spread over several days**,
until it comes out without effort. Rereading a solution feels like learning but isn't. Getting
it out of your head under a clock is what sticks.

- Each drill is a blank Java method plus JUnit tests (including the nasty edge cases and a big
  input that times out slow solutions).
- `./drill` tells you what to do today. Drills you struggle with come back tomorrow; drills you
  nail come back after longer and longer gaps.
- A drill becomes a **reflex** once you pass it **under its target time on 3 different days**.

*The learning-science names: retrieval practice + spaced repetition (a Leitner box system).*

## Setup (once)

```bash
git clone <your repo url> && cd java-reflex
mvn -q test-compile          # downloads JUnit the first time
chmod +x drill               # macOS / Linux / WSL
./drill help
```

You need Java 21+, Maven and Python 3. On Windows, run `python drill <command>` instead of `./drill`.

## Daily routine (45-90 min)

```bash
./drill                  # see today's queue: reviews first, then new drills
./drill start            # resets the next drill to a blank stub and starts the clock
#   ... write it in your editor ...
./drill check            # runs its tests; when they pass, your time is logged
./drill board            # scorecard
git add -A && git commit -m "drills: $(date +%F)" && git push
```

Rules that make this work:

1. **Type it from blank every time.** `start` wipes the file on purpose.
2. **No autocomplete if you can manage it.** HackerRank's editor is bare, so practise like that
   (turn off AI and completion, or use a plain editor).
3. **Stuck for more than 2x the target?** Run `./drill giveup`, read the solution with
   `./drill solution <id>`, close it, and let it come back tomorrow. Peeking counts as a fail.
   That's fine, and it's how the schedule knows to bring it back.
4. **Reviews before new drills.** The queue already orders them that way.
5. **Read the statement in the stub's comment, not the test file**, until you've had a go.

## What's inside

| Area | Drills | What it trains |
|---|---|---|
| Reflex drills | r01-r12 | The syntax you must not think about: `int[26]` counts, `merge`, `computeIfAbsent`, comparators, binary search, BFS, fast input |
| Counting & hashing | k01-k04 | anagrams, two-sum, first unique, grouping |
| Two pointers | k05-k08 | palindromes, in-place dedupe, 3Sum, container |
| Sliding window | k09-k12 | fixed and variable windows |
| Prefix sums | k13-k16 | range queries, pivot, subarray-sum-equals-k |
| Binary search | k17-k20 | classic, first/last, integer sqrt, search on the answer |
| Stack | k21-k24 | brackets, next-greater, RPN, min-stack |
| BFS / grids | k25-k28 | islands, shortest path, multi-source BFS, flood fill |
| Sort + greedy | k29-k32 | intervals, meeting rooms, custom comparators |
| Dynamic programming | k33-k37 | stairs, coins, robber, LCS, grid paths |
| Heap / top-K | k38-k41 | top-k, k-closest, merge-k, simulation |
| Strings | k42-k45 | compression, Caesar, prefixes, rotation (the "easy" assessment question is often string work) |

Many tests include a **performance case**, for example 200,000 inputs with a 3-second limit.
A brute-force answer passes the small cases and fails that one, just like hidden test cases on
HackerRank.

## Mock assessments

Three timed sets in the typical graduate-assessment shape: 75 minutes, three questions (easy 20 pts,
medium 35 pts, hard 45 pts), and stdin/stdout like HackerRank, with partial marks per test case.

```bash
./drill mocks            # list them
./drill mock mock1       # resets mocks/mock1/*/Solution.java and starts the clock
./drill mock-check       # judge what you have so far (as often as you like)
./drill mock-submit      # final score, recorded on your board
```

Each question folder has a `PROBLEM.md` and a `Solution.java` to fill in. Case `01` is the
sample; the others are hidden-style edge cases and large inputs. Previous attempts are backed up
to `.attempts/` when you restart a mock.

## Suggested plan

**Sprint mode (default) - the days before an assessment:**
- `./drill mode sprint` keeps review gaps short (1-4 days).
- 6 new drills a day covers all 57 in about 10 days. If your deadline is sooner, raise it with
  `./drill new 10` and focus on reviews.
- Do one mock every 2-3 days once you've seen each pattern at least once (day 3 or 4 onwards).
- The evening before a real test, do reviews only. No new drills.

**Between assessments:** `./drill mode normal` spreads reviews out (1, 2, 4, 8, 16 days), so the
patterns stay sharp for interview rounds and the next application.

## Layout

```
drill                 the CLI (Python 3, no dependencies)
drills.json           drill list + curriculum order
progress.json         your history (created on first run - commit it)
src/main/java/drills  the files you write in (stubs)
src/test/java/drills  JUnit tests
solutions/            reference answers - only after an honest attempt
mocks/                timed mock sets with judge cases
```

## Troubleshooting

- **`check` says COMPILATION ERROR in a file you aren't working on:** another drill was left
  half-written. Run `./drill start <that id>` to reset it, or `git checkout` the file.
- **Maven is slow on the first `check`:** it's downloading dependencies. Later checks take a few seconds.
- **Want to practise in IntelliJ?** Open the folder as a Maven project. You can still run tests
  in the IDE, but use `./drill check` so your time gets logged.
