package app.chalo.features.chalotime.data.model.app;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/model/app/ChaloTimeResponseAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTimeResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2674a;

    public ChaloTimeResponseAppModel(long j) {
        this.f2674a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChaloTimeResponseAppModel) && this.f2674a == ((ChaloTimeResponseAppModel) obj).f2674a;
    }

    public final int hashCode() {
        long j = this.f2674a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return hq0.e(this.f2674a, "ChaloTimeResponseAppModel(timeStamp=", ")");
    }
}
