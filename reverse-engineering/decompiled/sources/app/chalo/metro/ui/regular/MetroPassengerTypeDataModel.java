package app.chalo.metro.ui.regular;

import defpackage.b3;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/MetroPassengerTypeDataModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroPassengerTypeDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5532a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public MetroPassengerTypeDataModel(int i, int i2, int i3, String str, String str2) {
        this.f5532a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static MetroPassengerTypeDataModel a(MetroPassengerTypeDataModel metroPassengerTypeDataModel, int i) {
        return new MetroPassengerTypeDataModel(i, metroPassengerTypeDataModel.d, metroPassengerTypeDataModel.e, metroPassengerTypeDataModel.f5532a, metroPassengerTypeDataModel.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroPassengerTypeDataModel)) {
            return false;
        }
        MetroPassengerTypeDataModel metroPassengerTypeDataModel = (MetroPassengerTypeDataModel) obj;
        return Intrinsics.d(this.f5532a, metroPassengerTypeDataModel.f5532a) && Intrinsics.d(this.b, metroPassengerTypeDataModel.b) && this.c == metroPassengerTypeDataModel.c && this.d == metroPassengerTypeDataModel.d && this.e == metroPassengerTypeDataModel.e;
    }

    public final int hashCode() {
        return ((((nf1.e(this.f5532a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroPassengerTypeDataModel(id=", this.f5532a, ", name=", this.b, ", selectedCount=");
        hq0.p(this.c, this.d, ", maxCount=", ", minCount=", sbE);
        return b3.f(")", this.e, sbE);
    }
}
