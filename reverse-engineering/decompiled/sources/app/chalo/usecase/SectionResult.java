package app.chalo.usecase;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/SectionResult;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class SectionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10217a;
    public final boolean b;
    public final Throwable c;

    public SectionResult(String name, boolean z, Exception exc) {
        Intrinsics.i(name, "name");
        this.f10217a = name;
        this.b = z;
        this.c = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionResult)) {
            return false;
        }
        SectionResult sectionResult = (SectionResult) obj;
        return Intrinsics.d(this.f10217a, sectionResult.f10217a) && this.b == sectionResult.b && Intrinsics.d(this.c, sectionResult.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f10217a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        Throwable th = this.c;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("SectionResult(name=", this.f10217a, ", success=", ", error=", this.b);
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
