package app.chalo.home.ui.chalobusrouteinfo;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/Filters;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Filters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3366a;
    public final boolean b;

    public Filters(String filter, boolean z) {
        Intrinsics.i(filter, "filter");
        this.f3366a = filter;
        this.b = z;
    }

    public static Filters a(Filters filters, boolean z) {
        String filter = filters.f3366a;
        Intrinsics.i(filter, "filter");
        return new Filters(filter, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filters)) {
            return false;
        }
        Filters filters = (Filters) obj;
        return Intrinsics.d(this.f3366a, filters.f3366a) && this.b == filters.b;
    }

    public final int hashCode() {
        return (this.f3366a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("Filters(filter=", this.f3366a, ", isSelected=", ")", this.b);
    }
}
