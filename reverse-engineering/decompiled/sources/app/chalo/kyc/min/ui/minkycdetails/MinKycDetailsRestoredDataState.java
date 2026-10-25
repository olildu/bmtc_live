package app.chalo.kyc.min.ui.minkycdetails;

import defpackage.b3;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsRestoredDataState;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycDetailsRestoredDataState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4124a;
    public final boolean b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsRestoredDataState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsRestoredDataState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycDetailsRestoredDataState> serializer() {
            return MinKycDetailsRestoredDataState$$serializer.f4125a;
        }
    }

    public /* synthetic */ MinKycDetailsRestoredDataState(String str, int i, boolean z, boolean z2) {
        this.f4124a = (i & 1) == 0 ? "" : str;
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
        if (!(obj instanceof MinKycDetailsRestoredDataState)) {
            return false;
        }
        MinKycDetailsRestoredDataState minKycDetailsRestoredDataState = (MinKycDetailsRestoredDataState) obj;
        return Intrinsics.d(this.f4124a, minKycDetailsRestoredDataState.f4124a) && this.b == minKycDetailsRestoredDataState.b && this.c == minKycDetailsRestoredDataState.c;
    }

    public final int hashCode() {
        return (((this.f4124a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return b3.g(")", hq0.m("MinKycDetailsRestoredDataState(fullName=", this.f4124a, ", isProceedBtnEnabled=", ", shouldShowEmptyStateTitle=", this.b), this.c);
    }

    public MinKycDetailsRestoredDataState(String fullName, boolean z, boolean z2) {
        Intrinsics.i(fullName, "fullName");
        this.f4124a = fullName;
        this.b = z;
        this.c = z2;
    }
}
