package app.chalo.productpurchase.passpurchase.data;

import defpackage.dd;
import defpackage.nf1;
import defpackage.ox0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/ProofUploadDetailsSerializable;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProofUploadDetailsSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ox0(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8318a;
    public final String b;
    public final ProofUploadStatus c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/ProofUploadDetailsSerializable$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/data/ProofUploadDetailsSerializable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProofUploadDetailsSerializable> serializer() {
            return ProofUploadDetailsSerializable$$serializer.f8319a;
        }
    }

    public /* synthetic */ ProofUploadDetailsSerializable(int i, String str, String str2, ProofUploadStatus proofUploadStatus, boolean z) {
        if ((i & 1) == 0) {
            this.f8318a = "";
        } else {
            this.f8318a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = ProofUploadStatus.NOT_UPLOADED;
        } else {
            this.c = proofUploadStatus;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofUploadDetailsSerializable)) {
            return false;
        }
        ProofUploadDetailsSerializable proofUploadDetailsSerializable = (ProofUploadDetailsSerializable) obj;
        return Intrinsics.d(this.f8318a, proofUploadDetailsSerializable.f8318a) && Intrinsics.d(this.b, proofUploadDetailsSerializable.b) && this.c == proofUploadDetailsSerializable.c && this.d == proofUploadDetailsSerializable.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + nf1.e(this.f8318a.hashCode() * 31, 31, this.b)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProofUploadDetailsSerializable(uploadedProofUrl=", this.f8318a, ", uploadRequestId=", this.b, ", proofUploadStatus=");
        sbE.append(this.c);
        sbE.append(", isFreshUpload=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public ProofUploadDetailsSerializable(String uploadedProofUrl, String uploadRequestId, ProofUploadStatus proofUploadStatus, boolean z) {
        Intrinsics.i(uploadedProofUrl, "uploadedProofUrl");
        Intrinsics.i(uploadRequestId, "uploadRequestId");
        Intrinsics.i(proofUploadStatus, "proofUploadStatus");
        this.f8318a = uploadedProofUrl;
        this.b = uploadRequestId;
        this.c = proofUploadStatus;
        this.d = z;
    }
}
