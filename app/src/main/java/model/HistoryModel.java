package model;

public class HistoryModel {

    private String mIdminuman;
    private String mTanggal;
    private String mRiwayat;
    private String mTotal;
    private int mImageResourcedId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public HistoryModel(String idMinuman, String tanggal, String riwayat, String total, int imageResourcedId) {
        mIdminuman = idMinuman;
        mTanggal = tanggal;
        mRiwayat = riwayat;
        mTotal = total;
        mImageResourcedId = imageResourcedId;
    }

    public String getIdMinuman() {
        return mIdminuman;
    }

    public String getTanggal() {
        return mTanggal;
    }

    public  String getRiwayat() {
        return mRiwayat;
    }

    public String getTotal() {
        return mTotal;
    }

    public int getImageResourcedId() {
        return mImageResourcedId;
    }

    public boolean hasImage() {
        return mImageResourcedId != NO_IMAGE_PROVIDED;
    }
}
