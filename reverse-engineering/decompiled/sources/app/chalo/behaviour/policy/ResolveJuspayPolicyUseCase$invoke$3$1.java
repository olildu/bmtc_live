package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveJuspayPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<JuspayPolicy, JuspayPolicyOverride, JuspayPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveJuspayPolicyUseCase$invoke$3$1 f1042a = new ResolveJuspayPolicyUseCase$invoke$3$1();

    public ResolveJuspayPolicyUseCase$invoke$3$1() {
        super(2, JuspayPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/JuspayPolicy;Lapp/chalo/behaviour/policy/JuspayPolicyOverride;)Lapp/chalo/behaviour/policy/JuspayPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        JuspayPolicy p0 = (JuspayPolicy) obj;
        JuspayPolicyOverride juspayPolicyOverride = (JuspayPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (juspayPolicyOverride == null) {
            return p0;
        }
        Boolean bool = juspayPolicyOverride.f1004a;
        return new JuspayPolicy(bool != null ? bool.booleanValue() : p0.f1003a);
    }
}
