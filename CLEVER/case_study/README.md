# [Delorean](https://github.com/myusuf3/delorean) Case Study : 100 Most Recent Commits

## Why Delorean?
Went on Github, searched topic "python3", ordered by most stars. These are the contents of the first page of results.
- https://github.com/celery/celery
    - parallel/asynchronous, PyExSMT can't handle
- https://github.com/zulip/zulip
    - heavy on js, html, css, etc. 
    - heavy on string reasoning
    - PyExSMT can't handle
- https://github.com/aws/chalice
    - interface with Amazon Web Services
    - Does source code analysis and uses many complicated data-structures that PyExSMT won't directly handle
- https://github.com/xchaoinfo/fuck-login
    - I can't read it, and there's a curse word in the name.
- https://github.com/OmkarPathak/pygorithm
    - "Purely for educational purposes"
    - Looking for real world software
- https://github.com/davidhalter/jedi
    - "Awesome autocompletion and static analysis library for python"
    - string and program analysis. Would need to do too much work on PyExSMT
- https://github.com/cloudtools/troposphere
    - Very similar to chalice.
- https://github.com/sdispater/pendulum
    - datetime library. Could model with integers.
- https://github.com/openpaperwork/paperwork
    - heavy on GUI programming, not what we're looking for.
- https://github.com/tzutalin/labelImg
    - also very heavy on GUI
    - "LabelImg is a graphical image annotation tool and label object bounding boxes in images"
- https://github.com/secdev/scapy
    - "packet manipulation program & library"
    - Might be able to model, but has some cryptographic functions that will needlessly over complicate
- https://github.com/SpiderClub/weibospider
    - "A distributed crawler for weibo, building with celery and requests."
    - strings, parallel, and I can't read docs (项目亮点)
- https://github.com/errbotio/errbot
    - "Errbot is a chatbot. It allows you to start scripts interactively from your chatrooms for any reason"
    - String reasoning
- https://github.com/persepolisdm/persepolis
    - "Persepolis Download Manager is a GUI for aria2."
    - GUI
- https://github.com/johnwheeler/flask-ask
    - Strings (NLP)
- https://github.com/hack4impact/flask-base
    - authentication, user management and needlessly complicated data structures (databases, etc...)
- https://github.com/myusuf3/delorean
    - similar to pendulum but looks simpler and better documented
- https://github.com/Python-Markdown/markdown
    - Markdown parsing. Strings.
- https://github.com/gruns/furl
    - URL parsing. Strings.
- https://github.com/celery/kombu
    - "Messaging library for Python"
    - Deals with protocols, strings, and celery
- https://github.com/cdgriffith/Box
    - new implementation of python dictionaries. Will be hard to reason about with PyExSMT
- https://github.com/mozillazg/python-pinyin
    - I can't read docs 
- https://github.com/joowani/binarytree
    - teaching repo. Looking for something real.
- https://github.com/aaronduino/asciidots
    - "AsciiDots is an esoteric programming language based on ascii art."
    - Strings and parsing
- https://github.com/allegro/ralph
    - Databases and web interface. Will be difficult to model. 
- https://github.com/openpaperwork/pyocr
    - "PyOCR is an optical character recognition (OCR) tool wrapper for python"
    - Will be difficult to reason about images
- https://github.com/whitesmith/hawkpost
    - "Generate links that users can use to submit messages encrypted with your public key"
    - Encryption and strings
- https://github.com/guyzmo/git-repo
    - CLI. String manipulation.
- https://github.com/airingursb/bilibili-user
    - Can't read docs
- https://github.com/muammar/mkchromecast
    - "Cast macOS and Linux Audio/Video to your Google Cast and Sonos Devices"
    - Reasoning about videos may be difficult

Raking of priority (hopefully can get to all, but start with easiest)
- Delorean
- Pendulum 
- Scapy
- flask-base
- Box

## Commits
Every sub-point is a description of a semantic change 
to one library that preserves interfaces. Every sub-sub-point 
is the name of a (unchanged) client that calls this changed 
library

(13 Sep 2014)
- ``upping version``
- ``adding pypy and pypy3``
- ``fixing tests and adding new build versions``
- ``adding 3.4 support and version bump``
- ``rule parameters weren't being passed, so stops function wasn't working properly.``
- [``Merge pull request #49 from xgilest/master``](https://github.com/myusuf3/delorean/commit/344ed62d440c2189c33a49c7fc7bd5fb32fea8e3)
    - delorean/interface.py/stops
        - No clients inside of project
- ``bumping version``
- ``adding comma``
- ``Small test to check stops bug was resolved by my previous commit, not all rrule functionality is checked, though``
- ``Merge pull request #50 from xgilest/master``
- ``Point README to the docs instead of "below"``
- ``Merge pull request #55 from kermit666/patch-1``
- ``Implemented timedelta arithmetic.``
- ``Added documentation for timezone arithmetic.``
- [``Finished up date arithmetic to better mirror datetime's functionality. Added test_suite to setup.py for test running.``](https://github.com/myusuf3/delorean/commit/94610de2896ab28e26d5992ab8fa47f01ca20f4b#diff-caf99710b7616662187e013c7f17449f)
    - \_\_add\_\_
- ``Updated documentation``
- ``Merge pull request #56 from josefdlange/master``
- ``testing naive truncating to the minute``
- ``updating pytz``
- ``updating pytz``
- ``fixing the dependencies``
- ``fixing requirements``
- ``bumping version``
- ``Added title heading to timedelta arithmetic section.``
- ``Merge pull request #58 from josefdlange/master``
- ``Move to use pip-tools to manaage requirements``
- ``Remove extra 'precedence' in quickstart docs``
- ``Removes weird link generated by Sphinx``
- ``Delorean objects are equal if they are UTC equal``
- ``Merge pull request #59 from mlew/52``
- ``Merge pull request #60 from mlew/51``
- ``Merge pull request #62 from mlew/61``
- ``adding functionality for start_of_day, and end_of_day``
- ``adding tests``
- [``Merge branch 'master' into pip-tools``](https://github.com/myusuf3/delorean/commit/c5b23b96093544bdd3f84f2a9f84efa3bff9fac6)
    - Delorean.\_\_eq\_\_ changed to check that epochs are the same.
        - Hard to find clients for this.
- ``Added documentation for Delorean.__eq__``
- ``end_of_day should return 11pm, not 11am``
- ``Merge pull request #67 from mlew/66``
- ``Merge pull request #63 from mlew/61``
- [``Update __repr__ return value``](https://github.com/myusuf3/delorean/commit/311fba18a921f58be44ea071bb44c2367026d825#diff-caf99710b7616662187e013c7f17449f)
    - Delorean._repr__
        - fits but strings
- ``Merge pull request #69 from mlew/64``
- ``Migrate Delorean to work with FixedOffset timezones``
- ``Cleanup code example in README.md``
- ``Add CHANGES.md``
- ``update requirements.txt``
- ``Bump version to 0.6.0``
- ``Remove unused utc variables``
- [``Delorean.parse() understands dateutil.tz.tzlocal``](https://github.com/myusuf3/delorean/commit/679596a0ffe7ea72e605cc6b2bf765c036f588b6)
    - dates.py/Delorean.\_\_init\_\_ added self.\_tzinfo = self.\_dt.tzinfo deeply nested in conditionals
        - No clients inside of project
    - delorean/interface.py\parse changes conditionals for when datetime object is offset and when it is local
        - No clients inside of project
- ``Add tzlocal as a dependency``
- ``Update documentation on Delorean properties``
- ``Update a bunch of the documentation``
- ``Update CHANGES.md``
- ``Merge pull request #71 from mlew/70``
- ``Documentation update``
- [``Merge branch 'master' into pip-tools``](https://github.com/myusuf3/delorean/commit/081c758045d6c3b56583d1f139d4bae4c7b9687f)
    - delorean/dates.py/end\_of\_day() (initially incorrectly used 12 hour clock)
        - No clients inside of project
- ``Merge branch 'pip-tools' into 40``
- [``Fix delorean.now() to return a local Delorean``](https://github.com/myusuf3/delorean/commit/976e21761f404faf7063b85bf522b18dbf29fbf3)
    - delorean/interface.py/now (returns Delorean object for at local timezone of caller rather than UTC)
        - Difficult to model, no clients inside of project
- ``Move a bunch of Delorean class methods to properties``
- ``Update requirements``
- ``Add sphinx to dev-requirements``
- ``Update docs target in Makefile``
- [``Adding doctests``](https://github.com/myusuf3/delorean/commit/4755906335c825a32db8b65e971f3d3a8b966a8d)
    - delorean/dates.py/naive
        - No clients inside of project
- ``Add more documentation``
- ``Update dev-requirements``
- ``Last bit of new documentation for 0.6.0``
- ``Add humanize method to Delorean class``
- ``Add babel support``
- ``Add an overriding timezone parameter to delorean.parse``
- ``Update setup.py``
- ``README cleanup``
- ``fix for travis.ci``
- ``setup.py fix``
- ``Fix unit tests for case where get_localzone is in UTC``
- [``Python2.6 compatability``](https://github.com/myusuf3/delorean/commit/064bc8d0716e06838f11ac38fbf3e56ec63c4e76#diff-230e72a10b6a14e8369dec6a57f0f6da)
    - delorean/dates.py/init
    - delorean/interface.py/parse
- ``Some last minute cleanup``
- ``Updates to Changes.rst for 0.6.0 release.``
- ``Merge pull request #73 from mlew/0.6.0``
- ``Update requirements files``
- ``Update dependencies in setup.py``
- ``Call out breaking changes in the documentation``
- ``Fix quickstart docs``
- ``Merge pull request #78 from matiskay/fix-documentation``
- ``Added replace method on Delorean object``
- ``Added docs for the replace method``
- ``Updated tests``
- ``Added a few asserts on datetime``
- ``Add PyCharm dir to gitignore.``
- ``Use `naive` and `midnight` as properties in documentation. Closes myusuf3/delorean#88.``
- ``Delete empty philosophy.rst``
- ``Merge pull request #89 from ParthGandhi/fix-quickstart-docs``
- ``Include tests in release source tarball``
- ``Merge pull request #90 from EdwardBetts/patch-1``
- ``adding test for dayfirst False``
- ``Merge branch 'master' of github.com:myusuf3/delorean``
- ``Merge pull request #81 from masnun/master``
- ``adding python 3.5``
- ``Merge branch 'master' of github.com:myusuf3/delorean``
- ``Add most recent Python versions in Travis CI``
- ``Remove nightly from .travis.yml file``
- ``Merge pull request #98 from SylvainDe/master``

### Notes
- ``Added a few asserts on datetime`` adds asserts to the test\_replace function. This is technically a semantic change to a single function that doesn't modify signatures. But it will have no clients other than the test harness. Let's ignore tests.
-  ``Add an overriding timezone parameter to delorean.parse`` delorean/interface.py/parse changes signature but by adding an argument with a default parameter. It's not a very interesting change anyway.
-  ``Remove unused utc variables`` in a test. 
-  [``Migrate Delorean to work with FixedOffset timezones``](https://github.com/myusuf3/delorean/commit/afac86a678728be24b7dbf1670e568b2c246b563). A lot of changes that would fit criteria if taken individually. Really this is a big interface change.
- ``Merge pull request #69 from mlew/64`` Update \_\_repr\_\_ return value. Technically this fits. But it's a waste of time to model/analyze.
- ``rule parameters weren't being passed, so stops function wasn't working properly.``
     - same as ``Merge pull request #49 from xgilest/master``
- [``Delorean objects are equal if they are UTC equal``](https://github.com/myusuf3/delorean/commit/081c758045d6c3b56583d1f139d4bae4c7b9687f)
    - same as ``Merge branch 'master' into pip-tools``
- ``Merge pull request #62 from mlew/61``
    - same as ``Merge branch 'master' into pip-tools``
- ``end_of_day should return 11pm, not 11am``
    - same as ``Merge branch 'master' into pip-tools`` 
- ``Merge pull request #67 from mlew/66``
    - same as ``Merge branch 'master' into pip-tools`` 

## Results
- 24/100 commits were to (non-test or setup) python files
    - There were a lot of duplicate commits, and most commits were changes to documentation.
- 6/24 commits to python files were only changes in comments, names of variables, or formatting (spaces etc.)
- 9/24 changed interface, added something entirely new, removed something entirely
- 9/24 commits contained semantic changes to a function that did not modify signature.
- 11 updates were identified (2 commits contained 2 candidates). The ones with xs were chosen. eq and add were not because it is extremely difficult to find clients for these two. parse, repr, and stops rely too heavily on strings.
    - [ ] stops
    - [ ] \_\_eq\_\_
    - [x] \_\_init\_\_
    - [x] \_\_init\_\_ (second)
    - [ ] parse
    - [ ] parse (second)
    - [x] end\_of\_day() (no clients found)
    - [ ] naive
    - [x] now (no clients found)
    - [ ] \_\_add\_\_
    - [ ] \_\_repr\_\_
- 0 clients were found inside of project for these updates.
    - Delorean is really meant to be a library
- 5 external clients chosen and searched for calls to these libraries.
- So far I have checked 16 client-library pairs (some are sanity checks, others variations of modeling choices)
    - CSE by pattern: 8
    - CSE by assertion: 1 
    - Not-CSE: 7

## Client Search
I Searched "Delorean" on Github. This yielded 1307 Python code results.
I looked at the first 200 code results.
Out of those 200 I ignored code results that were calling a different Delorean project, were the Delorean project (or a fork/copy), or had less than 5 stars on Github.
This resulted in 9 projects that depend on Delorean, of those 9, the following actually used the libraries identified earlier (not for testing).
- https://github.com/amicks/Speculator
- https://github.com/numberoverzero/bloop
- https://github.com/biicode/bii-server
- https://github.com/mwaterfall/alfred-datetime-format-converter
- https://github.com/myusuf3/courtside

I then searched through each of the 9 projects to find clients for each of the library functions we identified below.

#### Speculator
- [x] \_\_init\_\_
    -  [many inits, date_to_delorean, date_to_epoch, now_delorean, get_end_start_epochs](https://github.com/amicks/Speculator/blob/17ac7a1c0a2df8370e2820b98ff13af489b666b0/speculator/utils/date.py)
- [ ] end\_of\_day()
- [ ] now

#### bloop
- [x] \_\_init\_\_
    - [DateTime.dynamo_load, Timestamp.dynamo_load](https://github.com/numberoverzero/bloop/blob/a19c410845d877e32a48ffec1d9d82cb2d7ae31b/bloop/ext/delorean.py) 
    - [new_expiry](https://github.com/numberoverzero/bloop/blob/a19c410845d877e32a48ffec1d9d82cb2d7ae31b/examples/mixins.py)
    - uses datetime.Datetime.strptime (strings)
- [ ] end\_of\_day()
- [ ] now

#### bii server
[all here. Follow UtcDatetime to get more clients](https://github.com/biicode/bii-server/blob/d2d7f2f0e38ff5ffdf1918ddeb33d1f4b1b530b1/model/epoch/utc_datetime.py)
- [x] \_\_init\_\_
- [ ] end\_of\_day()
- [ ] now

#### alfred-datetime-format-converter
- [x] \_\_init\_\_
    -  [parse_query_value](https://github.com/mwaterfall/alfred-datetime-format-converter/blob/02ffc84ff8e971840d3a3134e4b2682484c4f489/workflow/process.py) returns a delorean object. We should follow this back for eqm end of day, and naive.
    - function is based on parsing strings
- [ ] end\_of\_day()
- [ ] now

#### courtside
- [x] \_\_init\_\_
    - [run](https://github.com/myusuf3/courtside/blob/6d427391c543cc602ae2d92e1aa61ea15721645b/register/tasks.py)
    - [run](https://github.com/myusuf3/courtside/blob/6d427391c543cc602ae2d92e1aa61ea15721645b/courtside/register/tasks.py)
    - asynchronous tasks
- [ ] end\_of\_day()
- [ ] now

### Case by Case
- bii\_1\_old Vs. bii\_1\_new
    - Client is init for UtcDatetime
    - Commit: ``Delorean.parse() understands dateutil.tz.tzlocal``
        - Change to Delorean init (added line deep in conditionals)
    - Modeled environment in delorean/environments/datetime_1.py
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Used flag in wrapper for possibility of leaving tz parameter empty
    - Wrapper returns epoch, which is how Delorean objects are checked for equality
        - Client holds this Delorean object
    - Proven CSE by pattern
        - Change does not affect functional behavior when comparing by epoch (seconds from start of time)
- bii\_1\_old Vs. bii\_1\_new_mod
    - Sanity check: introduce equivalence breaking change (set day=0)
    - Counterexample found
- bii\_1\_old Vs. bii\_1\_new_error
    - bii\_1\_new_error has original "if timezone" (see above)
    - Counterexample found
- spec\_1\_old Vs spec\_1\_new
    - Client is date\_to\_delorean
    - Commit: ``Delorean.parse() understands dateutil.tz.tzlocal``
        - Change to Delorean init (added line deep in conditionals)
    - Modeled environment in delorean/environments/datetime_1.py
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns epoch, which is how Delorean objects are checked for equality
        - Client function returns Delorean object
    - Proven CSE by pattern
        - Change is not exercised since object is always created in UTC timezone.
- spec\_1\_old Vs spec\_1\_new_mod
    - Sanity check: introduce equivalence breaking change (set day=0)
    - Counterexample found
- spec\_1\_old Vs spec\_1\_new_error
    - spec\_1\_new_error has original "if timezone" (see above)
    - Counterexample found
- spec\_2\_old Vs spec\_2\_new
    - Client is get\_end\_start\_epochs
    - Commit: ``Delorean.parse() understands dateutil.tz.tzlocal``
        - Change to Delorean init (added line deep in conditionals)
    - Modeled environment in delorean/environments/datetime_1.py
    - Also had to model \_shift\_date inside of Delorean to work with ints instead of strings
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns difference between two epochs instead of the two epochs
    - CSE Proven by Pattern! Execution time.
- spec\_2\_old Vs spec\_2\_new_mod
    - Sanity check from previous examples but this one should actually still be CSE
    - Proven by assertion
- spec\_2\_old Vs spec\_2\_new_error
    - spec\_2\_new_error has original "if timezone" (see above)
    - Counterexample found
- spec\_2\_alt\_old Vs spec\_2\_alt\_new
    - Client is get\_end\_start\_epochs
    - Commit: ``Delorean.parse() understands dateutil.tz.tzlocal``
        - Change to Delorean init (added line deep in conditionals)
    - Modeled environment in delorean/environments/datetime_1.py
    - Also had to model \_shift\_date inside of Delorean to work with ints instead of strings
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns shifted epoch
    - CSE Proven by Pattern! Execution time
- spec\_2\_alt\_old Vs spec\_2\_alt\_new_mod
    - Sanity check: introduce equivalence breaking change (set day=0)
    - Counterexample found
- spec\_2\_alt\_old Vs spec\_2\_alt\_new_error
    - spec\_2\_alt\_new_error has original "if timezone" (see above)
    - Counterexample found
- bii\_2\_old Vs. bii\_2\_new
    - Client is init for UtcDatetime
    - Commit: ````Python2.6 compatability````
        - Change to Delorean init
    - Modeled environment in delorean/environments/datetime_1.py
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Used flag in wrapper for possibility of leaving tz parameter empty
    - Wrapper returns epoch, which is how Delorean objects are checked for equality
        - Client holds this Delorean object
    - Proven CSE by pattern seconds
- spec\_3\_old Vs spec\_3\_new
    - Client is date\_to\_delorean
    - Commit: ````Python2.6 compatability````
        - Change to Delorean init
    - Modeled environment in delorean/environments/datetime_1.py
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns epoch, which is how Delorean objects are checked for equality
        - Client function returns Delorean object
    - Proven CSE by pattern
        - Change is not exercised since object is always created in UTC timezone.
- spec\_4\_old Vs spec\_4\_new
    - Client is get\_end\_start\_epochs
    - Commit: ````Python2.6 compatability````
        - Change to Delorean init
    - Modeled environment in delorean/environments/datetime_1.py
    - Also had to model \_shift\_date inside of Delorean to work with ints instead of strings
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns difference between two epochs instead of the two epochs
    - CSE Proven by Pattern! Execution time.
- spec\_2\_alt\_old Vs spec\_2\_alt\_new
    - Client is get\_end\_start\_epochs
    - Commit: ````Python2.6 compatability````
        - Change to Delorean init
    - Modeled environment in delorean/environments/datetime_1.py
    - Also had to model \_shift\_date inside of Delorean to work with ints instead of strings
    - Changed string reasoning to int reasoning
        - "UTC" becomes UTC constant (=0)
        - if timezone becomes if timezone is not None
            - timezone == 0 would go down wrong branch
    - Wrapper returns shifted epoch
    - CSE Proven by Pattern! Execution time