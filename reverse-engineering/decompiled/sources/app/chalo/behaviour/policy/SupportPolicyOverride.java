package app.chalo.behaviour.policy;

import defpackage.jg1;
import defpackage.vo1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/SupportPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SupportPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(17)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportProblemPathOverride f1083a;
    public final Boolean b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/SupportPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/SupportPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SupportPolicyOverride> serializer() {
            return SupportPolicyOverride$$serializer.f1084a;
        }
    }

    public /* synthetic */ SupportPolicyOverride(int i, ReportProblemPathOverride reportProblemPathOverride, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f1083a = null;
        } else {
            this.f1083a = reportProblemPathOverride;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportPolicyOverride)) {
            return false;
        }
        SupportPolicyOverride supportPolicyOverride = (SupportPolicyOverride) obj;
        return Intrinsics.d(this.f1083a, supportPolicyOverride.f1083a) && Intrinsics.d(this.b, supportPolicyOverride.b) && Intrinsics.d(this.c, supportPolicyOverride.c);
    }

    public final int hashCode() {
        ReportProblemPathOverride reportProblemPathOverride = this.f1083a;
        int iHashCode = (reportProblemPathOverride == null ? 0 : reportProblemPathOverride.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupportPolicyOverride(reportProblemPath=");
        sb.append(this.f1083a);
        sb.append(", shouldShowReportProblemHook=");
        sb.append(this.b);
        sb.append(", appTncLink=");
        return vo1.p(sb, this.c, ")");
    }

    public SupportPolicyOverride(ReportProblemPathOverride.WebView webView) {
        Boolean bool = Boolean.FALSE;
        this.f1083a = webView;
        this.b = bool;
        this.c = "https://web.chalo.com/terms-and-conditions/bmtc-terms-and-conditions";
    }
}
