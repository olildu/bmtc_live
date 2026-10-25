package app.chalo.behaviour.policy;

import app.chalo.buildconfig.Environment;
import app.chalo.buildconfig.ProductFlavor;
import defpackage.b3;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyResolutionContext;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyResolutionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1019a;
    public final String b;
    public final ProductFlavor c;
    public final Environment d;
    public final int e;

    public PolicyResolutionContext(String str, String str2, ProductFlavor buildChannel, Environment environment, int i) {
        Intrinsics.i(buildChannel, "buildChannel");
        Intrinsics.i(environment, "environment");
        this.f1019a = str;
        this.b = str2;
        this.c = buildChannel;
        this.d = environment;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyResolutionContext)) {
            return false;
        }
        PolicyResolutionContext policyResolutionContext = (PolicyResolutionContext) obj;
        return Intrinsics.d(this.f1019a, policyResolutionContext.f1019a) && Intrinsics.d(this.b, policyResolutionContext.b) && this.c == policyResolutionContext.c && this.d == policyResolutionContext.d && this.e == policyResolutionContext.e;
    }

    public final int hashCode() {
        int iHashCode = this.f1019a.hashCode() * 31;
        String str = this.b;
        return ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PolicyResolutionContext(brandId=", vo1.B("BrandId(value=", this.f1019a, ")"), ", currentCity=", this.b, ", buildChannel=");
        sbE.append(this.c);
        sbE.append(", environment=");
        sbE.append(this.d);
        sbE.append(", appVersion=");
        return b3.f(")", this.e, sbE);
    }
}
