package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveResourceUrlPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ResolvedResourceUrlPolicy, ResourceUrlPolicyOverride, ResolvedResourceUrlPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveResourceUrlPolicyUseCase$invoke$3$1 f1059a = new ResolveResourceUrlPolicyUseCase$invoke$3$1();

    public ResolveResourceUrlPolicyUseCase$invoke$3$1() {
        super(2, ResourceUrlPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ResolvedResourceUrlPolicy;Lapp/chalo/behaviour/policy/ResourceUrlPolicyOverride;)Lapp/chalo/behaviour/policy/ResolvedResourceUrlPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ResolvedResourceUrlPolicy p0 = (ResolvedResourceUrlPolicy) obj;
        ResourceUrlPolicyOverride resourceUrlPolicyOverride = (ResourceUrlPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (resourceUrlPolicyOverride == null) {
            return p0;
        }
        String str = resourceUrlPolicyOverride.f1076a;
        String str2 = p0.f1072a;
        if (str != null) {
            if (StringsKt.F(str)) {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
        }
        String str3 = resourceUrlPolicyOverride.b;
        String str4 = p0.b;
        if (str3 != null) {
            if (StringsKt.F(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str4 = str3;
            }
        }
        String str5 = resourceUrlPolicyOverride.c;
        String str6 = p0.c;
        if (str5 != null) {
            String str7 = StringsKt.F(str5) ? null : str5;
            if (str7 != null) {
                str6 = str7;
            }
        }
        return new ResolvedResourceUrlPolicy(str2, str4, str6);
    }
}
