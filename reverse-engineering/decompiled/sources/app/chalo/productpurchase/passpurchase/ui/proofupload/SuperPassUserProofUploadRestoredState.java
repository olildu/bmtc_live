package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.superpass.data.models.app.ProofDocumentProps;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassUserProofUploadRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProofDocumentProps f8508a;
    public final boolean b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassUserProofUploadRestoredState> serializer() {
            return SuperPassUserProofUploadRestoredState$$serializer.f8509a;
        }
    }

    public /* synthetic */ SuperPassUserProofUploadRestoredState(int i, ProofDocumentProps proofDocumentProps, boolean z, boolean z2) {
        this.f8508a = (i & 1) == 0 ? null : proofDocumentProps;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserProofUploadRestoredState)) {
            return false;
        }
        SuperPassUserProofUploadRestoredState superPassUserProofUploadRestoredState = (SuperPassUserProofUploadRestoredState) obj;
        return Intrinsics.d(this.f8508a, superPassUserProofUploadRestoredState.f8508a) && this.b == superPassUserProofUploadRestoredState.b && this.c == superPassUserProofUploadRestoredState.c;
    }

    public final int hashCode() {
        ProofDocumentProps proofDocumentProps = this.f8508a;
        return ((((proofDocumentProps == null ? 0 : proofDocumentProps.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassUserProofUploadRestoredState(proofDocProps=");
        sb.append(this.f8508a);
        sb.append(", shouldShowPermissionRationale=");
        sb.append(this.b);
        sb.append(", shouldZoomPlaceholderImage=");
        return b3.g(")", sb, this.c);
    }

    public SuperPassUserProofUploadRestoredState(ProofDocumentProps proofDocumentProps, boolean z, boolean z2) {
        this.f8508a = proofDocumentProps;
        this.b = z;
        this.c = z2;
    }
}
