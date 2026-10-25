package app.chalo.behaviour.policy;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedSupportPolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolvedSupportPolicy {
    public static final ResolvedSupportPolicy d = new ResolvedSupportPolicy(ReportProblemPath.FreshChatPath.f1032a, true, "https://www.chalo.com/terms-of-use");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportProblemPath f1075a;
    public final boolean b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedSupportPolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ResolvedSupportPolicy(ReportProblemPath reportProblemPath, boolean z, String str) {
        this.f1075a = reportProblemPath;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedSupportPolicy)) {
            return false;
        }
        ResolvedSupportPolicy resolvedSupportPolicy = (ResolvedSupportPolicy) obj;
        return Intrinsics.d(this.f1075a, resolvedSupportPolicy.f1075a) && this.b == resolvedSupportPolicy.b && Intrinsics.d(this.c, resolvedSupportPolicy.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f1075a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolvedSupportPolicy(reportProblemPath=");
        sb.append(this.f1075a);
        sb.append(", shouldShowReportProblemHook=");
        sb.append(this.b);
        sb.append(", appTncLink=");
        return vo1.p(sb, this.c, ")");
    }
}
