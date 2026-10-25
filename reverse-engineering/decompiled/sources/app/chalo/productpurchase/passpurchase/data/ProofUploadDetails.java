package app.chalo.productpurchase.passpurchase.data;

import app.chalo.fileupload.picker.BitmapImage;
import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/ProofUploadDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProofUploadDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8316a;
    public final BitmapImage b;
    public final String c;
    public final ProofUploadStatus d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8317a;

        static {
            int[] iArr = new int[ProofUploadStatus.values().length];
            try {
                iArr[ProofUploadStatus.NOT_UPLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProofUploadStatus.UPLOAD_SUCCESSFUL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProofUploadStatus.UPLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProofUploadStatus.UPLOAD_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8317a = iArr;
        }
    }

    public /* synthetic */ ProofUploadDetails(String str, BitmapImage bitmapImage, String str2, ProofUploadStatus proofUploadStatus, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bitmapImage, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ProofUploadStatus.NOT_UPLOADED : proofUploadStatus, true);
    }

    public final ProofUploadDetailsSerializable a() {
        int[] iArr = WhenMappings.f8317a;
        ProofUploadStatus proofUploadStatus = this.d;
        int i = iArr[proofUploadStatus.ordinal()];
        boolean z = this.e;
        if (i == 1 || i == 2) {
            return new ProofUploadDetailsSerializable(this.f8316a, this.c, proofUploadStatus, z);
        }
        if (i == 3 || i == 4) {
            return new ProofUploadDetailsSerializable("", "", ProofUploadStatus.NOT_UPLOADED, z);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofUploadDetails)) {
            return false;
        }
        ProofUploadDetails proofUploadDetails = (ProofUploadDetails) obj;
        return Intrinsics.d(this.f8316a, proofUploadDetails.f8316a) && Intrinsics.d(this.b, proofUploadDetails.b) && Intrinsics.d(this.c, proofUploadDetails.c) && this.d == proofUploadDetails.d && this.e == proofUploadDetails.e;
    }

    public final int hashCode() {
        int iHashCode = this.f8316a.hashCode() * 31;
        BitmapImage bitmapImage = this.b;
        return ((this.d.hashCode() + nf1.e((iHashCode + (bitmapImage == null ? 0 : bitmapImage.hashCode())) * 31, 31, this.c)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProofUploadDetails(uploadedProofUrl=");
        sb.append(this.f8316a);
        sb.append(", proofImageLocalImage=");
        sb.append(this.b);
        sb.append(", uploadRequestId=");
        sb.append(this.c);
        sb.append(", proofUploadStatus=");
        sb.append(this.d);
        sb.append(", isFreshUpload=");
        return b3.g(")", sb, this.e);
    }

    public ProofUploadDetails(String uploadedProofUrl, BitmapImage bitmapImage, String uploadRequestId, ProofUploadStatus proofUploadStatus, boolean z) {
        Intrinsics.i(uploadedProofUrl, "uploadedProofUrl");
        Intrinsics.i(uploadRequestId, "uploadRequestId");
        Intrinsics.i(proofUploadStatus, "proofUploadStatus");
        this.f8316a = uploadedProofUrl;
        this.b = bitmapImage;
        this.c = uploadRequestId;
        this.d = proofUploadStatus;
        this.e = z;
    }
}
