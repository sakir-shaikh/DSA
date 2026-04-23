# Two Edit Words (2452)

## Problem Statement
You are given two string arrays, `queries` and `dictionary`. All words in each array comprise of lowercase English letters and have the same length.

In one edit you can take a word from `queries`, and change any letter in it to any other letter. Find all words from `queries` that, after a maximum of two edits, equal some word from `dictionary`.

Return a list of all words from `queries`, that match with some word from `dictionary` after a maximum of two edits. Return the words in the same order they appear in `queries`.

**Constraints:**
- `n == queries.length`
- `m == dictionary.length`
- `1 <= n, m <= 100`
- `w == queries[i].length == dictionary[j].length`
- `1 <= w <= 100`
- All words consist of lowercase English letters.

## Approach & Intuition
The problem asks us to find words in the `queries` array that are at most 2 edits away from *any* word in the `dictionary` array. Since the constraints are relatively small (up to 100 queries, 100 dictionary words, and 100 characters per word), a brute-force approach is efficient enough.

### Step-by-Step Logic:
1. Iterate through each word in the `queries` array.
2. For each query word, compare it with every word in the `dictionary` array.
3. To compare two words, iterate through their characters and count the mismatches.
4. If at any point the mismatch count exceeds 2, the current dictionary word cannot be a match; move to the next dictionary word.
5. If a dictionary word is found with 2 or fewer mismatches, the query word is valid. Add it to the result list and move to the next query word (to avoid duplicate entries and save time).
6. Return the list of valid query words.

### Intuition
Since all words have the same length $w$, the "edit" distance here is specifically the Hamming distance (number of positions at which the corresponding characters are different). We just need to check if $HammingDistance(query, dict\_word) \le 2$ for any $dict\_word$ in the dictionary.

## Complexity Analysis
- **Time Complexity:** $O(n \cdot m \cdot w)$ - Where $n$ is the number of queries, $m$ is the number of dictionary words, and $w$ is the length of each word. We perform a nested loop over queries and dictionary, and for each pair, we iterate through the characters.
- **Space Complexity:** $O(1)$ - Excluding the space required for the result list, we only use a few integer variables for counting and indexing.

## Edge Cases
- **0 Edits:** The query word exists exactly in the dictionary.
- **1 or 2 Edits:** The query word needs exactly one or two changes to match a dictionary word.
- **No Match:** No dictionary word is within 2 edits of the query.
- **Single Character Words:** Words of length 1 will always match if the dictionary is not empty (max edits is 1).

## Common Mistakes
- **Redundant Comparisons:** Not breaking the character loop early once the difference exceeds 2.
- **Duplicate Additions:** Not breaking the dictionary loop once a match for a query word is found.
- **Order of Results:** Not maintaining the original order of `queries` in the result list.
