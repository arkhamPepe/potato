package sample;

public enum ExerciseType {
    STRENGTH_EXERCISE,
    CARDIO_EXERCISE,
    STRETCH_EXERCISE;

    public int getNumberForType(ExerciseType e){
        switch (e){
            case STRENGTH_EXERCISE:
                return 0;
            case CARDIO_EXERCISE:
                return 1;
            case STRETCH_EXERCISE:
                return 2;
        }
        return -1;
    }
}
