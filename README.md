# Quizzer

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-908a85?logo=gitpod)](https://gitpod.io/#https://github.com/s0xzwasd/quizzer)

Quizzer is a small Java command-line application to test students' knowledge via quiz with options to answer.

![Example of how Quizzer works](src/main/resources/quizzer.gif)

## Key Features

- Two roles: Student and Interviewer. The first one can answer specified questions, the second one can review existing
  questions and add new ones.
- Interviewer can add, delete or review questions.
- Student can start quiz, answer on questions and see the result.
- Interviewer can switch to the student mode.

### Roadmap

#### v0.0.2

- [ ] [#Q6: Enhance Student Role](https://github.com/s0xzwasd/quizzer/issues/9)
  - Student can see the result and average grade.
  - Student can skip a question to answer it later.
- [ ] [#Q8: Enhance Interviewer Role](https://github.com/s0xzwasd/quizzer/issues/11)
  - Interviewer can update questions or keys.
  - Interviewer has a pre-defined list of questions and keys.

#### Nice to have

- [ ] [#Q4: Interviewer CLI flags to view questions list](https://github.com/s0xzwasd/quizzer/issues/7)
  - Interviewer can view the list with questions without keys by passing a special flag.
  - Interviewer can upload the list of pre-defined questions by passing a special flag.

---

#### v0.0.1

- [x] [#Q7: Add README and LICENSE](https://github.com/s0xzwasd/quizzer/issues/10)
- [x] [#Q5: Create Student Role](https://github.com/s0xzwasd/quizzer/issues/8)
  - Switch from interviewer to student.
  - Student can answer questions.
  - Student can see the message at the end of the quiz.
- [x] [#Q3: Create Interviewer Role](https://github.com/s0xzwasd/quizzer/issues/5)
  - Interviewer can view the list of the existing questions and keys.
  - Interviewer can type and add new questions and answers.
  - Interviewer can delete questions.
- [x] [#Q2: Implement start of the application](https://github.com/s0xzwasd/quizzer/issues/3)
- [x] [#Q1: Create Project Structure](https://github.com/s0xzwasd/quizzer/issues/1)

## License

MIT License

Copyright (c) 2021 Daniil Maslov

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
