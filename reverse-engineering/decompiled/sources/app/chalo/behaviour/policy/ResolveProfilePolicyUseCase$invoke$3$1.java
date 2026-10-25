package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveProfilePolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ProfilePolicy, ProfilePolicyOverride, ProfilePolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveProfilePolicyUseCase$invoke$3$1 f1056a = new ResolveProfilePolicyUseCase$invoke$3$1();

    public ResolveProfilePolicyUseCase$invoke$3$1() {
        super(2, ProfilePolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ProfilePolicy;Lapp/chalo/behaviour/policy/ProfilePolicyOverride;)Lapp/chalo/behaviour/policy/ProfilePolicy;", 1);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005f  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProfilePolicy p0 = (ProfilePolicy) obj;
        ProfilePolicyOverride profilePolicyOverride = (ProfilePolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (profilePolicyOverride == null) {
            return p0;
        }
        Boolean bool = profilePolicyOverride.f1030a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : p0.f1029a;
        Boolean bool2 = profilePolicyOverride.b;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : p0.b;
        Boolean bool3 = profilePolicyOverride.c;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : p0.c;
        Boolean bool4 = profilePolicyOverride.d;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : p0.d;
        Boolean bool5 = profilePolicyOverride.e;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : p0.e;
        String str = profilePolicyOverride.f;
        if (str == null) {
            str = p0.f;
        } else {
            if (StringsKt.F(str)) {
                str = null;
            }
            if (str == null) {
                str = p0.f;
            }
        }
        String otpTemplateId = str;
        Boolean bool6 = profilePolicyOverride.g;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : p0.g;
        Intrinsics.i(otpTemplateId, "otpTemplateId");
        return new ProfilePolicy(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, otpTemplateId, zBooleanValue6);
    }
}
