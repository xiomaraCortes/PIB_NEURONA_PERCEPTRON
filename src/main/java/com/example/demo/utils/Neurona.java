package com.example.demo.utils;

import com.example.demo.utils.model.PIB;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Neurona {

    private String year;
    private Double pib;
    private List<PIB> itemsPIB;



    final String  PIB_CONSTANT =
            "2005\t419.077\t86.720\t88.125\t78.708\t514.853\n" +
            "2006\t444.943\t101.405\t96.513\t92.625\t549.435\n" +
            "2007\t472.591\t117.424\t102.516\t105.461\t586.457\n" +
            "2008\t492.507\t128.090\t104.604\t118.656\t605.713\n" +
            "2009\t503.416\t120.026\t99.158\t108.395\t612.616\n" +
            "2010\t529.002\t131.503\t101.203\t120.134\t640.151\n" +
            "2011\t558.993\t155.852\t113.608\t144.436\t684.628\n" +
            "2012\t589.694\t160.351\t118.690\t157.977\t711.415\n" +
            "2013\t621.266\t172.869\t124.241\t171.443\t747.939\n" +
            "2014\t648.134\t193.533\t123.882\t184.747\t781.589\n" +
            "2015\t670.201\t191.305\t125.936\t182.750\t804.692\n" +
            "2016\t681.101\t190.994\t125.673\t176.279\t821.489\n" +
            "2017\t696.973\t184.828\t128.902\t178.075\t832.656\n" +
            "2018\t722.941\t188.643\t129.998\t188.389\t853.600\n" +
            "2019\t755.975\t196.673\t134.072\t205.677\t881.958";

    public Neurona(String year) {
        this.year = year;
        this.itemsPIB = new ArrayList<>();
    }

    public void getCalculation() {
        /**
         * PIB = C + L + G + X - M
         */
        String[] item = PIB_CONSTANT.split("\n");

        for(String it : item) {
            String[]  year = it.split("\t");
            this.itemsPIB.add(new PIB(year[0], Double.parseDouble(year[1]), Double.parseDouble(year[2]),
                    Double.parseDouble(year[3]), Double.parseDouble(year[4]),Double.parseDouble(year[5])));
        }


        PIB result =this.itemsPIB.stream()
                .filter(year -> Objects.equals(year.getYear(), this.year))
                .findFirst()
                .orElse(null);

        if(result != null ) {
            this.pib  = result.getConsumption() + result.getInvestment() + result.getPublicSpending() + result.getExports() - result.getImportsItem();
        } else{
            this.pib = 0.0;
        }


    }

    public Double getPib() {
        return pib;
    }

    public void setPib(Double pib) {
        this.pib = pib;
    }
}
