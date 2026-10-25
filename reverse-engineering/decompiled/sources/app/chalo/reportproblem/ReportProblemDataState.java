package app.chalo.reportproblem;

import app.chalo.features.reportproblem.ReportProblemCollection;
import defpackage.b3;
import defpackage.d;
import defpackage.t10;
import defpackage.z40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9018a;
    public final ReportProblemCollection b;
    public final Map c;
    public final List d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ReportProblemDataState(boolean z, ReportProblemCollection reportProblemCollection, Map map, List list, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f9018a = z;
        this.b = reportProblemCollection;
        this.c = map;
        this.d = list;
        this.e = str;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public static ReportProblemDataState a(ReportProblemDataState reportProblemDataState, boolean z, ReportProblemCollection reportProblemCollection, Map map, List list, String str, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = reportProblemDataState.f9018a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            reportProblemCollection = reportProblemDataState.b;
        }
        ReportProblemCollection reportProblemCollection2 = reportProblemCollection;
        if ((i & 4) != 0) {
            map = reportProblemDataState.c;
        }
        Map userPropertiesMap = map;
        if ((i & 8) != 0) {
            list = reportProblemDataState.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str = reportProblemDataState.e;
        }
        String str2 = str;
        boolean z7 = (i & 32) != 0 ? reportProblemDataState.f : z2;
        boolean z8 = (i & 64) != 0 ? reportProblemDataState.g : z3;
        boolean z9 = (i & 128) != 0 ? reportProblemDataState.h : z4;
        boolean z10 = (i & 256) != 0 ? reportProblemDataState.i : z5;
        reportProblemDataState.getClass();
        Intrinsics.i(userPropertiesMap, "userPropertiesMap");
        return new ReportProblemDataState(z6, reportProblemCollection2, userPropertiesMap, list2, str2, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemDataState)) {
            return false;
        }
        ReportProblemDataState reportProblemDataState = (ReportProblemDataState) obj;
        return this.f9018a == reportProblemDataState.f9018a && Intrinsics.d(this.b, reportProblemDataState.b) && Intrinsics.d(this.c, reportProblemDataState.c) && Intrinsics.d(this.d, reportProblemDataState.d) && Intrinsics.d(this.e, reportProblemDataState.e) && this.f == reportProblemDataState.f && this.g == reportProblemDataState.g && this.h == reportProblemDataState.h && this.i == reportProblemDataState.i;
    }

    public final int hashCode() {
        int i = (this.f9018a ? 1231 : 1237) * 31;
        ReportProblemCollection reportProblemCollection = this.b;
        int iF = d.f(this.c, (i + (reportProblemCollection == null ? 0 : reportProblemCollection.hashCode())) * 31, 31);
        List list = this.d;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportProblemDataState(isLoading=");
        sb.append(this.f9018a);
        sb.append(", problemCollection=");
        sb.append(this.b);
        sb.append(", userPropertiesMap=");
        sb.append(this.c);
        sb.append(", additionalProblemCategoryList=");
        sb.append(this.d);
        sb.append(", supportContactNumber=");
        t10.s(this.e, ", showReclaimRequestDialog=", ", showReclaimResponseDialog=", sb, this.f);
        z40.r(sb, this.g, ", isAutolinkSuccessful=", this.h, ", showInternetConnectionSnackBar=");
        return b3.g(")", sb, this.i);
    }
}
