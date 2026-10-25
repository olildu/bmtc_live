package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.tf1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewRestoreState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProofOverviewRestoreState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(19)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8479a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Map e;
    public final boolean f;
    public final boolean g;
    public final EnlargeProofImageSerializable h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewRestoreState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewRestoreState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProofOverviewRestoreState> serializer() {
            return SuperPassProofOverviewRestoreState$$serializer.f8480a;
        }
    }

    public /* synthetic */ SuperPassProofOverviewRestoreState(int i, boolean z, boolean z2, boolean z3, String str, Map map, boolean z4, boolean z5, EnlargeProofImageSerializable enlargeProofImageSerializable, boolean z6, boolean z7) {
        if ((i & 1) == 0) {
            this.f8479a = false;
        } else {
            this.f8479a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = enlargeProofImageSerializable;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z6;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewRestoreState)) {
            return false;
        }
        SuperPassProofOverviewRestoreState superPassProofOverviewRestoreState = (SuperPassProofOverviewRestoreState) obj;
        return this.f8479a == superPassProofOverviewRestoreState.f8479a && this.b == superPassProofOverviewRestoreState.b && this.c == superPassProofOverviewRestoreState.c && Intrinsics.d(this.d, superPassProofOverviewRestoreState.d) && Intrinsics.d(this.e, superPassProofOverviewRestoreState.e) && this.f == superPassProofOverviewRestoreState.f && this.g == superPassProofOverviewRestoreState.g && Intrinsics.d(this.h, superPassProofOverviewRestoreState.h) && this.i == superPassProofOverviewRestoreState.i && this.j == superPassProofOverviewRestoreState.j;
    }

    public final int hashCode() {
        int iE = nf1.e((((((this.f8479a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d);
        Map map = this.e;
        int iHashCode = (((((iE + (map == null ? 0 : map.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        EnlargeProofImageSerializable enlargeProofImageSerializable = this.h;
        return ((((iHashCode + (enlargeProofImageSerializable != null ? enlargeProofImageSerializable.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("SuperPassProofOverviewRestoreState(reInitiate=", ", reApply=", ", freshApplication=", this.f8479a, this.b);
        pk0.x(", fullName=", this.d, ", proofUploadDetailsMap=", sbR, this.c);
        sbR.append(this.e);
        sbR.append(", areAllProofsUploaded=");
        sbR.append(this.f);
        sbR.append(", isNameChangeComplete=");
        sbR.append(this.g);
        sbR.append(", enlargeProofImage=");
        sbR.append(this.h);
        sbR.append(", shouldShowConsentCheckbox=");
        return n21.h(sbR, this.i, ", isConsentCheckboxChecked=", this.j, ")");
    }

    public SuperPassProofOverviewRestoreState(boolean z, boolean z2, boolean z3, String fullName, LinkedHashMap linkedHashMap, boolean z4, boolean z5, EnlargeProofImageSerializable enlargeProofImageSerializable, boolean z6, boolean z7) {
        Intrinsics.i(fullName, "fullName");
        this.f8479a = z;
        this.b = z2;
        this.c = z3;
        this.d = fullName;
        this.e = linkedHashMap;
        this.f = z4;
        this.g = z5;
        this.h = enlargeProofImageSerializable;
        this.i = z6;
        this.j = z7;
    }
}
