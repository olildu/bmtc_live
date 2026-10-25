package app.chalo.userprofiling.ruleengine;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofiling/ruleengine/RuleDecision;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RuleDecision {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10413a;
    public final boolean b;
    public final RuleDecisionReason c;

    public RuleDecision(String ruleId, boolean z, RuleDecisionReason reason) {
        Intrinsics.i(ruleId, "ruleId");
        Intrinsics.i(reason, "reason");
        this.f10413a = ruleId;
        this.b = z;
        this.c = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleDecision)) {
            return false;
        }
        RuleDecision ruleDecision = (RuleDecision) obj;
        return Intrinsics.d(this.f10413a, ruleDecision.f10413a) && this.b == ruleDecision.b && this.c == ruleDecision.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f10413a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("RuleDecision(ruleId=", this.f10413a, ", eligible=", ", reason=", this.b);
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
