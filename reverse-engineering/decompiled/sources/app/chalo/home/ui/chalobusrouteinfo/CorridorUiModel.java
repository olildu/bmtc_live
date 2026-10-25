package app.chalo.home.ui.chalobusrouteinfo;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/CorridorUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CorridorUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3365a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public CorridorUiModel(String corridorId, String str, String start, String end, ArrayList arrayList) {
        Intrinsics.i(corridorId, "corridorId");
        Intrinsics.i(start, "start");
        Intrinsics.i(end, "end");
        this.f3365a = corridorId;
        this.b = str;
        this.c = start;
        this.d = end;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorridorUiModel)) {
            return false;
        }
        CorridorUiModel corridorUiModel = (CorridorUiModel) obj;
        return Intrinsics.d(this.f3365a, corridorUiModel.f3365a) && Intrinsics.d(this.b, corridorUiModel.b) && Intrinsics.d(this.c, corridorUiModel.c) && Intrinsics.d(this.d, corridorUiModel.d) && this.e.equals(corridorUiModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3365a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CorridorUiModel(corridorId=", this.f3365a, ", displayName=", this.b, ", start=");
        cb0.t(sbE, this.c, ", end=", this.d, ", routes=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
