package Features;

public class SealedClasses {
    public static void main(String[] args) {
        var cdnService = new S3Service();
        cdnService.push();

        var cdnService2 = new FireBaseService();
        cdnService2.push();
    }
}

sealed interface CdnService permits CdnServiceImpl{
    void push();
}


abstract sealed class CdnServiceImpl implements CdnService permits S3Service, FireBaseService{
    @Override
    public void push() {
        System.out.println("File sent.");
    }
}

final class S3Service extends CdnServiceImpl{
    @Override
    public void push() {
        System.out.println("File sent to S3");
    }
}

final class FireBaseService extends  CdnServiceImpl{

}