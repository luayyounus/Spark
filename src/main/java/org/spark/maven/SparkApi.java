package org.spark.maven;

import static spark.Spark.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by luayghazwan on 6/20/17.
 */
public class SparkApi {
    public static void main(String[] args) {
        get("/hello", (req,res) -> "Hello World");
    }
}