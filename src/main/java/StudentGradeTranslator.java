public class StudentGradeTranslator {

    GradeCalculator gradeCalculator;

    public StudentGradeTranslator() {
        this.gradeCalculator = new FlatCurveGradeCalculator();
    }

    public StudentGradeTranslator(String gradingMethod) {
        if (gradingMethod == null) {
            this.gradeCalculator = new FlatCurveGradeCalculator();
        } else if (gradingMethod.equals("FLAT")) {
            this.gradeCalculator = new FlatCurveGradeCalculator();
        } else if (gradingMethod.equals("SLIGHT")) {
            this.gradeCalculator = new SlightCurveGradeCalculator();
        } else if (gradingMethod.equals("HEAVY")) {
            this.gradeCalculator = new HeavyCurveGradeCalculator();
        }
    }

    public String getLetterGrade(int numberGrade) {
        return gradeCalculator.getLetterGrade(numberGrade);
    }

    public boolean isPassingGrade(int numberGrade) {
        return gradeCalculator.isPassingGrade(numberGrade);
    }

    public int howManyForNextLetter(int numberGrade){ //added method to be called.
        return gradeCalculator.howManyForNextLetterGrade(numberGrade);

    }

    interface GradeCalculator {
        public String getLetterGrade(int numberGrade);
        public boolean isPassingGrade(int numberGrade);
        public int howManyForNextLetterGrade(int numberGrade); //new line added
    }

    class FlatCurveGradeCalculator implements GradeCalculator {
        public String getLetterGrade(int numberGrade) {
            if (numberGrade < 60) {
                return "F";
            }
            if (numberGrade < 70) {
                return "D";
            }
            if (numberGrade < 80) {
                return "C";
            }
            if (numberGrade < 90) {
                return "B";
            }
            return "A";
        }

        public boolean isPassingGrade(int numberGrade) {
            if (numberGrade >= 60) return true;
            return false;
        }

        public int howManyForNextLetterGrade(int numberGrade)//new method added
        {
            if (numberGrade < 60) {
                return 60 - numberGrade;
            }
            if (numberGrade < 70) {
                return 70 - numberGrade;
            }
            if (numberGrade < 80) {
                return 80- numberGrade;
            }
            if (numberGrade < 90) {
                return 90 - numberGrade;
            }
            return 0;

        }


    }

    class SlightCurveGradeCalculator implements GradeCalculator {
        public String getLetterGrade(int numberGrade) {
            if (numberGrade < 55) {
                return "F";
            }
            if (numberGrade < 65) {
                return "D";
            }
            if (numberGrade < 75) {
                return "C";
            }
            if (numberGrade < 85) {
                return "B";
            }
            return "A";
        }

        public boolean isPassingGrade(int numberGrade) {
            if (numberGrade >= 55) return true;
            return false;
        }

        public int howManyForNextLetterGrade(int numberGrade)//new method added
        {
            if (numberGrade < 60) {
                return 60 - numberGrade;
            }
            if (numberGrade < 70) {
                return 70 - numberGrade;
            }
            if (numberGrade < 80) {
                return 80- numberGrade;
            }
            if (numberGrade < 90) {
                return 90 - numberGrade;
            }
            return 0;

        }



    }

    class HeavyCurveGradeCalculator implements GradeCalculator {
        public String getLetterGrade(int numberGrade) {
            if (numberGrade < 50) {
                return "F";
            }
            if (numberGrade < 60) {
                return "D";
            }
            if (numberGrade < 70) {
                return "C";
            }
            if (numberGrade < 80) {
                return "B";
            }
            return "A";
        }

        public boolean isPassingGrade(int numberGrade) {
            if (numberGrade >= 50) return true;
            return false;
        }

        public int howManyForNextLetterGrade(int numberGrade)//new method added
        {
            if (numberGrade < 60) {
                return 60 - numberGrade;
            }
            if (numberGrade < 70) {
                return 70 - numberGrade;
            }
            if (numberGrade < 80) {
                return 80- numberGrade;
            }
            if (numberGrade < 90) {
                return 90 - numberGrade;
            }
            return 0;

        }



    }
}