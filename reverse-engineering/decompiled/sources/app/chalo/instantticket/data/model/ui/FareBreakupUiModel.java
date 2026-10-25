package app.chalo.instantticket.data.model.ui;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/ui/FareBreakupUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3894a;
    public final String b;
    public final String c;

    public FareBreakupUiModel(String fareBreakupCopy, String str, String fareValue) {
        Intrinsics.i(fareBreakupCopy, "fareBreakupCopy");
        Intrinsics.i(fareValue, "fareValue");
        this.f3894a = fareBreakupCopy;
        this.b = str;
        this.c = fareValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupUiModel)) {
            return false;
        }
        FareBreakupUiModel fareBreakupUiModel = (FareBreakupUiModel) obj;
        return Intrinsics.d(this.f3894a, fareBreakupUiModel.f3894a) && Intrinsics.d(this.b, fareBreakupUiModel.b) && Intrinsics.d(this.c, fareBreakupUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f3894a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("FareBreakupUiModel(fareBreakupCopy=", this.f3894a, ", fareOperationPrefix=", this.b, ", fareValue="), this.c, ")");
    }
}
