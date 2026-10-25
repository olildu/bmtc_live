package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.superpass.data.models.app.ProofDocumentProps;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassUserProofUploadDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProofDocumentProps f8501a;
    public final boolean b;
    public final boolean c;

    public SuperPassUserProofUploadDataState(ProofDocumentProps proofDocumentProps, boolean z, boolean z2) {
        this.f8501a = proofDocumentProps;
        this.b = z;
        this.c = z2;
    }

    public static SuperPassUserProofUploadDataState a(SuperPassUserProofUploadDataState superPassUserProofUploadDataState, ProofDocumentProps proofDocumentProps, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            proofDocumentProps = superPassUserProofUploadDataState.f8501a;
        }
        if ((i & 2) != 0) {
            z = superPassUserProofUploadDataState.b;
        }
        if ((i & 4) != 0) {
            z2 = superPassUserProofUploadDataState.c;
        }
        superPassUserProofUploadDataState.getClass();
        return new SuperPassUserProofUploadDataState(proofDocumentProps, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserProofUploadDataState)) {
            return false;
        }
        SuperPassUserProofUploadDataState superPassUserProofUploadDataState = (SuperPassUserProofUploadDataState) obj;
        return Intrinsics.d(this.f8501a, superPassUserProofUploadDataState.f8501a) && this.b == superPassUserProofUploadDataState.b && this.c == superPassUserProofUploadDataState.c;
    }

    public final int hashCode() {
        ProofDocumentProps proofDocumentProps = this.f8501a;
        return ((((proofDocumentProps == null ? 0 : proofDocumentProps.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassUserProofUploadDataState(proofDocProps=");
        sb.append(this.f8501a);
        sb.append(", shouldShowPermissionRationale=");
        sb.append(this.b);
        sb.append(", shouldZoomPlaceholderImage=");
        return b3.g(")", sb, this.c);
    }
}
