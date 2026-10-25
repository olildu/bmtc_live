package app.chalo.productbooking.common.ui;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/ui/FareBreakupOperationUIProperties;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupOperationUIProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8267a;
    public final ChaloColorToken b;

    public FareBreakupOperationUIProperties(ChaloColorToken valueColor, String str) {
        Intrinsics.i(valueColor, "valueColor");
        this.f8267a = str;
        this.b = valueColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupOperationUIProperties)) {
            return false;
        }
        FareBreakupOperationUIProperties fareBreakupOperationUIProperties = (FareBreakupOperationUIProperties) obj;
        return Intrinsics.d(this.f8267a, fareBreakupOperationUIProperties.f8267a) && Intrinsics.d(this.b, fareBreakupOperationUIProperties.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8267a.hashCode() * 31);
    }

    public final String toString() {
        return "FareBreakupOperationUIProperties(prefix=" + this.f8267a + ", valueColor=" + this.b + ")";
    }
}
