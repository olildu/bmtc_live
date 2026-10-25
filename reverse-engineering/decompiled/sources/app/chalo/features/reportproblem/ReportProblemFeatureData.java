package app.chalo.features.reportproblem;

import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemFeatureData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemFeatureData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2761a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final String e;

    public ReportProblemFeatureData(String collectionId, String source, Map userPropertiesMap, boolean z, String str) {
        Intrinsics.i(collectionId, "collectionId");
        Intrinsics.i(source, "source");
        Intrinsics.i(userPropertiesMap, "userPropertiesMap");
        this.f2761a = collectionId;
        this.b = source;
        this.c = userPropertiesMap;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemFeatureData)) {
            return false;
        }
        ReportProblemFeatureData reportProblemFeatureData = (ReportProblemFeatureData) obj;
        return Intrinsics.d(this.f2761a, reportProblemFeatureData.f2761a) && Intrinsics.d(this.b, reportProblemFeatureData.b) && Intrinsics.d(this.c, reportProblemFeatureData.c) && this.d == reportProblemFeatureData.d && Intrinsics.d(this.e, reportProblemFeatureData.e);
    }

    public final int hashCode() {
        int iF = (d.f(this.c, nf1.e(this.f2761a.hashCode() * 31, 31, this.b), 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ReportProblemFeatureData(collectionId=", this.f2761a, ", source=", this.b, ", userPropertiesMap=");
        sbE.append(this.c);
        sbE.append(", areAdditionalProblemsRequired=");
        sbE.append(this.d);
        sbE.append(", supportContactNumber=");
        return vo1.p(sbE, this.e, ")");
    }
}
