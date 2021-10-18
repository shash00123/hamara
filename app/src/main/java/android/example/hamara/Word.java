package android.example.hamara;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String defaultTranslation, String miwokTranslation,int Audio) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=Audio;

    }
    public Word(String defaultTranslation,String miwokTranslation,int ResouceId,int Audiorid){
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=Audiorid;
        mImageResourceId=ResouceId;

    }
    public String getmDefaultTranslation() {

        return mDefaultTranslation;

    }
    public String getmMiwokTranslation(){

        return  mMiwokTranslation;
    }
    public int getmImageResourceId(){
        return  mImageResourceId;
    }
    public boolean hssimage(){
            return mImageResourceId!=NO_IMAGE_PROVIDED;


    }
public int getmAudioResourceId(){
        return mAudioResourceId;
}




}
