package app.chalo.livetracking.routedetails;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ReportProblemTagDetails;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemTagDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4383a;
    public final String b;

    public ReportProblemTagDetails(String tagId, String str) {
        Intrinsics.i(tagId, "tagId");
        this.f4383a = tagId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemTagDetails)) {
            return false;
        }
        ReportProblemTagDetails reportProblemTagDetails = (ReportProblemTagDetails) obj;
        return Intrinsics.d(this.f4383a, reportProblemTagDetails.f4383a) && Intrinsics.d(this.b, reportProblemTagDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4383a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ReportProblemTagDetails(tagId=", this.f4383a, ", title=", this.b, ")");
    }
}
