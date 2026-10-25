package app.chalo.features.reportproblem;

import defpackage.nf1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemMetadata;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2764a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public ReportProblemMetadata(Map map, String title, String hint, ArrayList arrayList) {
        Intrinsics.i(title, "title");
        Intrinsics.i(hint, "hint");
        this.f2764a = map;
        this.b = title;
        this.c = hint;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemMetadata)) {
            return false;
        }
        ReportProblemMetadata reportProblemMetadata = (ReportProblemMetadata) obj;
        return this.f2764a.equals(reportProblemMetadata.f2764a) && Intrinsics.d(this.b, reportProblemMetadata.b) && Intrinsics.d(this.c, reportProblemMetadata.c) && this.d.equals(reportProblemMetadata.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f2764a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ReportProblemMetadata(tagDetailsMap=" + this.f2764a + ", title=" + this.b + ", hint=" + this.c + ", tagList=" + this.d + ")";
    }
}
