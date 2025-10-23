package com.opendecimal.openmt.core;

import com.opendecimal.openmt.model.MTMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockingMTParserTest {

    BlockingMTParser blockingMTParser = new BlockingMTParser();

    @Test
    void version() {
    }

    @Test
    void close() {
    }

    @Test
    void parse() {
        String msg = """
                {1:F01BKCHCNBJA9401234123456}{2:O1031200910103HSBCCNSHAXX22221234569101031201N}
                {3:{113:XXXX}{108:abcdefgh12345678}}
                {4:
                :16R:GENL
                :20C::CORP//CA202410150001
                :23G:NEWM
                :22F::CAEV//DVOP
                :98A::ANOU//20241015
                :98A::EXPI//20241020
                :98A::PAYD//20241105
                :16S:GENL
                :16R:USECUR
                :35B:ISIN US1234567890
                :16S:USECUR
                :16R:CAOPTIONS
                :13A::CAON//001
                :22F::CAOP//CASH
                :11A::OPTN//USD
                :17B::DBLT//0.75
                :16S:CAOPTIONS
                :16R:ADDINFO
                :70E::ADTX//Cash dividend of USD 0.75 per share.
                :16S:ADDINFO
                -}{5:{MAC:2B535CAD}{CHK:123456789ABC}}
                """;

        MTMessage mtMessage = blockingMTParser.parse(msg);
        
        System.out.println(mtMessage.getApplicationHeader());
    }
}