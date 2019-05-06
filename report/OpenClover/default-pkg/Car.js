var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":329,"methods":[{"el":23,"sc":5,"sl":18},{"el":37,"sc":5,"sl":32},{"el":48,"sc":5,"sl":43},{"el":56,"sc":5,"sl":54},{"el":72,"sc":5,"sl":64}],"name":"Car","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating1","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_100":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"test7","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_122":{"methods":[{"sl":32}],"name":"test011","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_14":{"methods":[{"sl":32}],"name":"test002","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_150":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"closestAvailableTaxi","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_173":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_190":{"methods":[{"sl":32}],"name":"test098","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_193":{"methods":[{"sl":32}],"name":"test020","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_208":{"methods":[{"sl":32}],"name":"test002","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_217":{"methods":[{"sl":32}],"name":"test064","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_230":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue1","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_231":{"methods":[{"sl":32}],"name":"test007","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_235":{"methods":[{"sl":32}],"name":"test003","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_237":{"methods":[{"sl":32}],"name":"test011","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_238":{"methods":[{"sl":32}],"name":"test012","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_243":{"methods":[{"sl":32}],"name":"test012","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_257":{"methods":[{"sl":32}],"name":"test007","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_258":{"methods":[{"sl":32}],"name":"test011","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_269":{"methods":[{"sl":32}],"name":"test064","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_276":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_279":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addVehicle","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_303":{"methods":[{"sl":32},{"sl":43}],"name":"test6","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47}]},"test_32":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"closestAvailableTaxi","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_323":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_330":{"methods":[{"sl":32}],"name":"test012","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_343":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating1","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_35":{"methods":[{"sl":32}],"name":"test098","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_354":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating1","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_355":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue1","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_364":{"methods":[{"sl":32}],"name":"test064","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_365":{"methods":[{"sl":32}],"name":"test000","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_374":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"changeDriverVehicle","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_376":{"methods":[{"sl":32}],"name":"test019","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_377":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue1","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_397":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addVehicle","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_411":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"closestAvailableTaxi","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_413":{"methods":[{"sl":32}],"name":"test098","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_42":{"methods":[{"sl":32}],"name":"test020","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_425":{"methods":[{"sl":32},{"sl":54}],"name":"test2","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":55}]},"test_426":{"methods":[{"sl":32}],"name":"test000","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_443":{"methods":[{"sl":32}],"name":"test019","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_445":{"methods":[{"sl":32}],"name":"test012","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_462":{"methods":[{"sl":32}],"name":"test019","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_475":{"methods":[{"sl":32}],"name":"test007","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_486":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"changeDriverVehicle","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_492":{"methods":[{"sl":32}],"name":"test064","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_496":{"methods":[{"sl":32},{"sl":64}],"name":"test3","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":65},{"sl":66},{"sl":67}]},"test_503":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_506":{"methods":[{"sl":32}],"name":"test002","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_525":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"closestAvailableTaxi","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_532":{"methods":[{"sl":32}],"name":"test000","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_536":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"test1","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_55":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"test0","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_558":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"changeDriverVehicle","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_56":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_575":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue1","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_579":{"methods":[{"sl":32}],"name":"test003","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_59":{"methods":[{"sl":32}],"name":"test020","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_592":{"methods":[{"sl":32}],"name":"test003","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_598":{"methods":[{"sl":32}],"name":"test002","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_602":{"methods":[{"sl":32}],"name":"test000","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_650":{"methods":[{"sl":32}],"name":"test019","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_659":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_661":{"methods":[{"sl":32}],"name":"test020","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_668":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addVehicle","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_685":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"changeDriverVehicle","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_695":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"doTripQueue","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_700":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_704":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addVehicle","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]},"test_705":{"methods":[{"sl":32}],"name":"test011","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_706":{"methods":[{"sl":32}],"name":"test007","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_707":{"methods":[{"sl":32}],"name":"test098","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_79":{"methods":[{"sl":32}],"name":"test003","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_95":{"methods":[{"sl":32},{"sl":43},{"sl":54}],"name":"addRating1","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [598, 532, 659, 32, 193, 35, 525, 536, 704, 56, 443, 707, 14, 122, 258, 355, 475, 602, 411, 486, 650, 100, 279, 462, 579, 55, 445, 413, 397, 208, 95, 575, 685, 217, 426, 506, 276, 706, 231, 364, 503, 79, 59, 190, 323, 243, 354, 700, 238, 257, 237, 42, 705, 365, 230, 150, 173, 558, 343, 269, 492, 235, 330, 425, 376, 695, 303, 0, 377, 374, 496, 668, 592, 661], [598, 532, 659, 32, 193, 35, 525, 536, 704, 56, 443, 707, 14, 122, 258, 355, 475, 602, 411, 486, 650, 100, 279, 462, 579, 55, 445, 413, 397, 208, 95, 575, 685, 217, 426, 506, 276, 706, 231, 364, 503, 79, 59, 190, 323, 243, 354, 700, 238, 257, 237, 42, 705, 365, 230, 150, 173, 558, 343, 269, 492, 235, 330, 425, 376, 695, 303, 0, 377, 374, 496, 668, 592, 661], [598, 532, 659, 32, 193, 35, 525, 536, 704, 56, 443, 707, 14, 122, 258, 355, 475, 602, 411, 486, 650, 100, 279, 462, 579, 55, 445, 413, 397, 208, 95, 575, 685, 217, 426, 506, 276, 706, 231, 364, 503, 79, 59, 190, 323, 243, 354, 700, 238, 257, 237, 42, 705, 365, 230, 150, 173, 558, 343, 269, 492, 235, 330, 425, 376, 695, 303, 0, 377, 374, 496, 668, 592, 661], [598, 532, 659, 32, 193, 35, 525, 536, 704, 56, 443, 707, 14, 122, 258, 355, 475, 602, 411, 486, 650, 100, 279, 462, 579, 55, 445, 413, 397, 208, 95, 575, 685, 217, 426, 506, 276, 706, 231, 364, 503, 79, 59, 190, 323, 243, 354, 700, 238, 257, 237, 42, 705, 365, 230, 150, 173, 558, 343, 269, 492, 235, 330, 425, 376, 695, 303, 0, 377, 374, 496, 668, 592, 661], [598, 532, 659, 32, 193, 35, 525, 536, 704, 56, 443, 707, 14, 122, 258, 355, 475, 602, 411, 486, 650, 100, 279, 462, 579, 55, 445, 413, 397, 208, 95, 575, 685, 217, 426, 506, 276, 706, 231, 364, 503, 79, 59, 190, 323, 243, 354, 700, 238, 257, 237, 42, 705, 365, 230, 150, 173, 558, 343, 269, 492, 235, 330, 425, 376, 695, 303, 0, 377, 374, 496, 668, 592, 661], [], [], [], [], [], [], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 695, 303, 0, 377, 374, 668], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 695, 303, 0, 377, 374, 668], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 695, 303, 0, 377, 374, 668], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 695, 303, 0, 377, 374, 668], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 695, 303, 0, 377, 374, 668], [], [], [], [], [], [], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 425, 695, 0, 377, 374, 668], [659, 32, 525, 536, 704, 56, 355, 411, 486, 100, 279, 55, 397, 95, 575, 685, 276, 503, 323, 354, 700, 230, 150, 173, 558, 343, 425, 695, 0, 377, 374, 668], [], [], [], [], [], [], [], [], [496], [496], [496], [496], [], [], [], [], [], []]