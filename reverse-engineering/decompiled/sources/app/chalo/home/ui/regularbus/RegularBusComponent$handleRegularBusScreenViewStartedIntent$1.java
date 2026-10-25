package app.chalo.home.ui.regularbus;

import app.chalo.home.extensions.UserProfileDetailsProviderExtKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.providers.UserProfileDetailsProvider;
import defpackage.c80;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleRegularBusScreenViewStartedIntent$1", f = "RegularBusComponent.kt", l = {1266}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleRegularBusScreenViewStartedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleRegularBusScreenViewStartedIntent$1(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleRegularBusScreenViewStartedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleRegularBusScreenViewStartedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            UserProfileDetailsProvider userProfileDetailsProvider = this.this$0.D;
            this.label = 1;
            obj = UserProfileDetailsProviderExtKt.a(userProfileDetailsProvider, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProfileDrawerCardData profileDrawerCardData = (ProfileDrawerCardData) obj;
        if (!Intrinsics.d(((RegularBusViewState) this.this$0.t0().a()).j, profileDrawerCardData)) {
            this.this$0.E0(new c80(profileDrawerCardData, 1));
        }
        return Unit.f17538a;
    }
}
