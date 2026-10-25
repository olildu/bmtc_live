package app.chalo.home.ui.profile;

import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolvedSupportPolicy;
import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.domain.GetProfilePageItemsUseCase;
import defpackage.rw0;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenComponent$handleProfileScreenStartedIntent$1", f = "ProfileScreenComponent.kt", l = {522, 523}, m = "invokeSuspend", v = 1)
final class ProfileScreenComponent$handleProfileScreenStartedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProfileScreenViewIntent.ProfileScreenStartedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ ProfileScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenComponent$handleProfileScreenStartedIntent$1(ProfileScreenComponent profileScreenComponent, ProfileScreenViewIntent.ProfileScreenStartedIntent profileScreenStartedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = profileScreenComponent;
        this.$intent = profileScreenStartedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileScreenComponent$handleProfileScreenStartedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileScreenComponent$handleProfileScreenStartedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ResolveSupportPolicyUseCase resolveSupportPolicyUseCase = this.this$0.B;
            this.label = 1;
            obj = resolveSupportPolicyUseCase.a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.n, "profile screen rendered", null, Source.PROFILE_SCREEN, 14);
        ProfileScreenComponent profileScreenComponent = this.this$0;
        profileScreenComponent.E0(new rw0(5, (List) obj, profileScreenComponent, str));
        return Unit.f17538a;
        String str2 = ((ResolvedSupportPolicy) obj).c;
        GetProfilePageItemsUseCase getProfilePageItemsUseCase = this.this$0.m;
        List list = this.$intent.f3613a;
        this.L$0 = str2;
        this.label = 2;
        Serializable serializableC = getProfilePageItemsUseCase.c(list, this);
        if (serializableC != coroutineSingletons) {
            str = str2;
            obj = serializableC;
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.n, "profile screen rendered", null, Source.PROFILE_SCREEN, 14);
            ProfileScreenComponent profileScreenComponent2 = this.this$0;
            profileScreenComponent2.E0(new rw0(5, (List) obj, profileScreenComponent2, str));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
