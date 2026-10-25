package app.chalo.ondc.model.app.response;

import androidx.compose.ui.graphics.Color;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/response/OndcFareBreakupUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcFareBreakupUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6781a;
    public final long b;
    public final String c;

    public OndcFareBreakupUiModel(long j, String desc, String fare) {
        Intrinsics.i(desc, "desc");
        Intrinsics.i(fare, "fare");
        this.f6781a = desc;
        this.b = j;
        this.c = fare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcFareBreakupUiModel)) {
            return false;
        }
        OndcFareBreakupUiModel ondcFareBreakupUiModel = (OndcFareBreakupUiModel) obj;
        return Intrinsics.d(this.f6781a, ondcFareBreakupUiModel.f6781a) && Color.m4606equalsimpl0(this.b, ondcFareBreakupUiModel.b) && Intrinsics.d(this.c, ondcFareBreakupUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.c(this.f6781a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("OndcFareBreakupUiModel(desc=", this.f6781a, ", textColor=", Color.m4613toStringimpl(this.b), ", fare="), this.c, ")");
    }
}
