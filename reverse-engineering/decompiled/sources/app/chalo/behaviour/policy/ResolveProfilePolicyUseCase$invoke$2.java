package app.chalo.behaviour.policy;

import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.chaloconfig.data.ChaloConfigString;
import app.chalo.features.language.data.Language;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/behaviour/policy/PolicyConfigFetchResult;", "Lapp/chalo/behaviour/policy/ProfilePolicyOverride;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.behaviour.policy.ResolveProfilePolicyUseCase$invoke$2", f = "ResolveProfilePolicyUseCase.kt", l = {45}, m = "invokeSuspend", v = 1)
final class ResolveProfilePolicyUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super PolicyConfigFetchResult<ProfilePolicyOverride>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ResolveProfilePolicyUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveProfilePolicyUseCase$invoke$2(ResolveProfilePolicyUseCase resolveProfilePolicyUseCase, Continuation continuation) {
        super(1, continuation);
        this.this$0 = resolveProfilePolicyUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ResolveProfilePolicyUseCase$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ResolveProfilePolicyUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PolicyConfigFetcher policyConfigFetcher;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            policyConfigFetcher = this.this$0.b;
            String strA = PolicyConfigFetcherKt.a(ResolveProfilePolicyUseCaseKt.f1057a, policyConfigFetcher.b, policyConfigFetcher.c);
            ChaloConfigRepository chaloConfigRepository = policyConfigFetcher.f1012a;
            Language language = Language.ENGLISH;
            this.L$0 = policyConfigFetcher;
            this.L$1 = strA;
            this.label = 1;
            Object objP = chaloConfigRepository.p(language, strA, this);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strA;
            obj = objP;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            policyConfigFetcher = (PolicyConfigFetcher) this.L$0;
            ResultKt.b(obj);
        }
        ChaloConfigString chaloConfigString = (ChaloConfigString) obj;
        boolean z = chaloConfigString.b;
        String str2 = chaloConfigString.f2634a;
        if (!z) {
            return new PolicyConfigFetchResult(str, false, null);
        }
        if (StringsKt.F(str2)) {
            return new PolicyConfigFetchResult(str, true, null);
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            return new PolicyConfigFetchResult(str, true, (PolicyRemoteConfig) json.b(str2, PolicyRemoteConfig.INSTANCE.serializer(ProfilePolicyOverride.INSTANCE.serializer())));
        } catch (Exception e) {
            policyConfigFetcher.d.i(e);
            return new PolicyConfigFetchResult(str, true, null);
        }
    }
}
