package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.b3;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/MetroGroupLegAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroGroupLegAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopAppModel f4719a;
    public final StopAppModel b;
    public final int c;

    public MetroGroupLegAppModel(int i, StopAppModel firstStop, StopAppModel lastStop) {
        Intrinsics.i(firstStop, "firstStop");
        Intrinsics.i(lastStop, "lastStop");
        this.f4719a = firstStop;
        this.b = lastStop;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroGroupLegAppModel)) {
            return false;
        }
        MetroGroupLegAppModel metroGroupLegAppModel = (MetroGroupLegAppModel) obj;
        return Intrinsics.d(this.f4719a, metroGroupLegAppModel.f4719a) && Intrinsics.d(this.b, metroGroupLegAppModel.b) && this.c == metroGroupLegAppModel.c;
    }

    public final int hashCode() {
        return n21.b(this.b, this.f4719a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroGroupLegAppModel(firstStop=");
        sb.append(this.f4719a);
        sb.append(", lastStop=");
        sb.append(this.b);
        sb.append(", routeChanges=");
        return b3.f(")", this.c, sb);
    }
}
