package com.kaito.BlockFactory;

import com.kaito.Block.BarBlock;
import com.kaito.Block.Block;

public class BlockFactory {
    Block makeBlock(String choice){
        // 通过选择来进行生成
        return new BarBlock();
    }
}
