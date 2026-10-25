package app.chalo.tito.domain;

import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/TITOProductDetailsFilterWrapper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITOProductDetailsFilterWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9666a;
    public final List b;
    public final List c;

    public TITOProductDetailsFilterWrapper(List activeProductsList, List expiredProductsList, List unknownProductsList) {
        Intrinsics.i(activeProductsList, "activeProductsList");
        Intrinsics.i(expiredProductsList, "expiredProductsList");
        Intrinsics.i(unknownProductsList, "unknownProductsList");
        this.f9666a = activeProductsList;
        this.b = expiredProductsList;
        this.c = unknownProductsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOProductDetailsFilterWrapper)) {
            return false;
        }
        TITOProductDetailsFilterWrapper tITOProductDetailsFilterWrapper = (TITOProductDetailsFilterWrapper) obj;
        return Intrinsics.d(this.f9666a, tITOProductDetailsFilterWrapper.f9666a) && Intrinsics.d(this.b, tITOProductDetailsFilterWrapper.b) && Intrinsics.d(this.c, tITOProductDetailsFilterWrapper.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f9666a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TITOProductDetailsFilterWrapper(activeProductsList=");
        sb.append(this.f9666a);
        sb.append(", expiredProductsList=");
        sb.append(this.b);
        sb.append(", unknownProductsList=");
        return xs.l(sb, this.c, ")");
    }
}
