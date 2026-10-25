package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/LoadMoneyFailureReason;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadMoneyFailureReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadMoneyValidationFailureType f10214a;
    public final String b;

    public LoadMoneyFailureReason(LoadMoneyValidationFailureType reason, String errorMessage) {
        Intrinsics.i(reason, "reason");
        Intrinsics.i(errorMessage, "errorMessage");
        this.f10214a = reason;
        this.b = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoneyFailureReason)) {
            return false;
        }
        LoadMoneyFailureReason loadMoneyFailureReason = (LoadMoneyFailureReason) obj;
        return this.f10214a == loadMoneyFailureReason.f10214a && Intrinsics.d(this.b, loadMoneyFailureReason.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10214a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadMoneyFailureReason(reason=" + this.f10214a + ", errorMessage=" + this.b + ")";
    }
}
