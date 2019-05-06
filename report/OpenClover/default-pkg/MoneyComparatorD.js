var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":319,"methods":[{"el":18,"sc":5,"sl":14}],"name":"MoneyComparatorD","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_162":{"methods":[{"sl":14}],"name":"test1","pass":true,"statements":[{"sl":15}]},"test_223":{"methods":[{"sl":14}],"name":"test3","pass":true,"statements":[{"sl":15}]},"test_511":{"methods":[{"sl":14}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":16}]},"test_688":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [511, 688, 162, 223], [511, 688, 162, 223], [511, 688], [688], [], []]
