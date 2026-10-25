package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.fileupload.picker.BitmapImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/EnlargeProofImage;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnlargeProofImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8455a;
    public final BitmapImage b;

    public EnlargeProofImage(String str, BitmapImage bitmapImage) {
        this.f8455a = str;
        this.b = bitmapImage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BitmapImage getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF8455a() {
        return this.f8455a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnlargeProofImage)) {
            return false;
        }
        EnlargeProofImage enlargeProofImage = (EnlargeProofImage) obj;
        return Intrinsics.d(this.f8455a, enlargeProofImage.f8455a) && Intrinsics.d(this.b, enlargeProofImage.b);
    }

    public final int hashCode() {
        String str = this.f8455a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BitmapImage bitmapImage = this.b;
        return iHashCode + (bitmapImage != null ? bitmapImage.hashCode() : 0);
    }

    public final String toString() {
        return "EnlargeProofImage(url=" + this.f8455a + ", localImage=" + this.b + ")";
    }
}
