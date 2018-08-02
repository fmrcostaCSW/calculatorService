package com.critical.training.engine;

public class DynamicCalculate {
    private MathProcessing[] handlers;

    double leftVal;
    double rightVal;
    double result;



    public DynamicCalculate (MathProcessing[] handlers){

        this.handlers = handlers;
    }

    public String process(String statement) throws InvalidStatementException  {
        // IN: add 1.0 2.0
        // OUT: 1.0 + 2.0 = 3.0 2018-07-16 18:45:56.903636


        String[] parts = statement.split(MathProcessing.SEPARATOR);

        if (parts.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String keyword = parts[0]; // add

        MathProcessing theHandler = null;

        for (MathProcessing handler:handlers) {
            if (keyword.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }


        try {
            leftVal = Double.parseDouble(parts[1]); // 1.0
            rightVal = Double.parseDouble(parts[2]); // 2.0
        }catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }

        double result = theHandler.doCalculation(leftVal, rightVal);

//        //float stopOperationTime=System.currentTimeMillis();
//        float stopOperationTime=System.nanoTime();
//        float elapsedOperationTime = stopOperationTime - startOperationTime;


        //String OperationDateTime = MicroTimestamp.INSTANCE.getMicroTimestamp();

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);
        sb.append(" ------> ");
      //  sb.append(OperationDateTime);


        return sb.toString();

    }
}

