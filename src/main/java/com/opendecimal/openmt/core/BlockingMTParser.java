package com.opendecimal.openmt.core;

import com.opendecimal.openmt.core.base.MTParserBase;
import com.opendecimal.openmt.model.*;

import java.util.Stack;

public class BlockingMTParser extends MTParserBase {

    @Override
    public void closeInput() {
    }

    public MTMessage parse(String mtString) {
        MTMessage mtMessage = new MTMessage();

        Stack<Character> stack = new Stack<>();
        int blockIndex = 1;
        int[][] blockSEPositions = new int[5][2];
        for(int i=0; i<mtString.length(); i++) {
            if(mtString.charAt(i) == '{') {
                if(stack.isEmpty()) {
                    // Record block start position
                    blockSEPositions[blockIndex - 1][0] = i;
                    if(blockIndex >= 4) {
                        // Block 4 may contain '{' or '}' in text element so record start position only
                        break;
                    }
                }
                stack.push('{');
            }
            if(mtString.charAt(i) == '}') {
                stack.pop();
                if(stack.isEmpty()) {
                    // Record block end position
                    blockSEPositions[blockIndex - 1][1] = i;
                    blockIndex++;
                }
            }
        }
        stack.clear();

        blockIndex = 5;
        for(int i=mtString.length() - 1; i > 0; i--) {
            if(mtString.charAt(i) == '}') {
                if(stack.isEmpty()) {
                    // Record block end position
                    blockSEPositions[blockIndex - 1][1] = i;
                    if(blockIndex <= 4) {
                        // Block 4 may contain '{' or '}' in text element and start position already
                        // recorded, so record end position only
                        break;
                    }
                }
                stack.push('}');
            }
            if(mtString.charAt(i) == '{') {
                stack.pop();
                if(stack.isEmpty()) {
                    // Record block start position
                    blockSEPositions[blockIndex - 1][0] = i;
                    blockIndex --;
                }
            }
        }
        mtMessage.setBasicHeader(parseBlock1(
                mtString.substring(blockSEPositions[0][0], blockSEPositions[0][1] + 1)));
        mtMessage.setApplicationHeader(parseBlock2(
                mtString.substring(blockSEPositions[1][0], blockSEPositions[1][1] + 1)));
        mtMessage.setUserHeader(parseBlock3(
                mtString.substring(blockSEPositions[2][0], blockSEPositions[2][1] + 1)));
        mtMessage.setBody(parseBlock4(
                mtString.substring(blockSEPositions[3][0], blockSEPositions[3][1] + 1)));
        mtMessage.setTrailer(parseBlock5(
                mtString.substring(blockSEPositions[4][0], blockSEPositions[4][1] + 1)));

        return mtMessage;
    }

    private BasicHeader parseBlock1(String blockString) {
        BasicHeader.ApplicationID applicationID = BasicHeader.ApplicationID.of(blockString.charAt(3));
        BasicHeader.APPDU appdu = BasicHeader.APPDU.of(blockString.substring(4, 6));

        BasicHeader basicHeader = new BasicHeader(applicationID, appdu);
        basicHeader.setBic12(blockString.substring(6, 18));
        basicHeader.setSessionNum(blockString.substring(18, 22));
        basicHeader.setSequenceNum(blockString.substring(22, 28));

        return basicHeader;
    }

    private ApplicationHeader parseBlock2(String blockString) {
        return null;
    }

    private UserHeader parseBlock3(String blockString) {
        return null;
    }

    private Body parseBlock4(String blockString) {
        return null;
    }

    private Trailer parseBlock5(String blockString) {
        return null;
    }
}
