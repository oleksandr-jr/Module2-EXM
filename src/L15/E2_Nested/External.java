package L15.E2_Nested;

class External
{
    private static int sVariable = 0;
    private int nonStaticVariable = 5;

    private static int getVar(){
        return sVariable;
    }

    public int getNonStaticVariable() {
        return nonStaticVariable;
    }

    public static class Nested
    {
        public Nested()
        {
        }

        void getValues(){
            System.out.println(sVariable);
            System.out.println(getVar());

            //System.out.println(nonStaticVariable);
            //System.out.println(getNonStaticVariable());
        }
    }

}