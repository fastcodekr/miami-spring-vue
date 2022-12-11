package kr.fastcode.app.cmm.util;
import static java.util.stream.Collectors.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@Lazy
@NoArgsConstructor
public class Page {
    private int totalCount, startRow, endRow, pageCount, pageSize, startPage, endPage, pageNo, blockCount, prevBlock,
            nextBlock, blockNo;

    public final int blockSize = 5;
    private String tname;
    private boolean existPrev, existNext;

    // SQL 방식
    public Page(int pageNo, int count) {
        this.pageSize = 20;
        this.pageNo = pageNo;
        this.totalCount = count;
        this.pageCount = (totalCount % pageSize != 0) ? totalCount / pageSize + 1 : totalCount / pageSize;
        this.blockCount = (pageCount % blockSize != 0) ? pageCount / blockSize + 1 : pageCount / blockSize;
        this.startRow = (pageNo - 1) * pageSize;
        this.endRow = (pageCount != pageNo) ? startRow + pageSize - 1 : totalCount - 1;
        this.blockNo = (pageNo - 1) / blockSize;
        this.startPage = blockNo * blockSize + 1;
        this.endPage = ((blockNo + 1) != blockCount) ? startPage + (blockSize - 1) : pageCount;
        this.existPrev = blockNo != 0;
        this.existNext = (blockNo + 1) != blockCount;
        this.nextBlock = startPage + blockSize;
        this.prevBlock = startPage - blockSize;
    }

    // POJO 방식을 위한 생성자 오버로드
    public Page(int pageSize, int pageNo, int count) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.totalCount = count;
        this.pageCount = (totalCount % pageSize != 0) ? totalCount / pageSize + 1 : totalCount / pageSize;
        this.blockCount = (pageCount % blockSize != 0) ? pageCount / blockSize + 1 : pageCount / blockSize;
        this.startRow = (pageNo - 1) * pageSize;
        this.endRow = (pageCount != pageNo) ? startRow + pageSize - 1 : totalCount - 1;
        this.blockNo = (pageNo - 1) / blockSize;
        this.startPage = blockNo * blockSize + 1;
        this.endPage = ((blockNo + 1) != blockCount) ? startPage + (blockSize - 1) : pageCount;
        this.existPrev = blockNo != 0;
        this.existNext = (blockNo + 1) != blockCount;
        this.nextBlock = startPage + blockSize;
        this.prevBlock = startPage - blockSize;
    }

}
