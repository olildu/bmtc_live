package app.chalo.home.ui.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$fetchHomeScreenConfig$1", f = "HomeComponent.kt", l = {988, 999}, m = "invokeSuspend", v = 1)
final class HomeComponent$fetchHomeScreenConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$fetchHomeScreenConfig$1(HomeComponent homeComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$fetchHomeScreenConfig$1(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$fetchHomeScreenConfig$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (app.chalo.home.ui.base.HomeComponent.G0(r1, r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r8)
            goto L54
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.ResultKt.b(r8)
            goto L3a
        L1c:
            kotlin.ResultKt.b(r8)
            app.chalo.home.ui.base.HomeComponent r8 = r7.this$0
            app.chalo.providers.CoroutineContextProvider r8 = r8.H
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = r8.b()
            app.chalo.home.ui.base.HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1 r1 = new app.chalo.home.ui.base.HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1
            app.chalo.home.ui.base.HomeComponent r4 = r7.this$0
            java.lang.String r5 = r7.$cityId
            r6 = 0
            r1.<init>(r4, r5, r6)
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r8, r1, r7)
            if (r8 != r0) goto L3a
            goto L48
        L3a:
            app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel r8 = (app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel) r8
            if (r8 == 0) goto L49
            app.chalo.home.ui.base.HomeComponent r1 = r7.this$0
            r7.label = r2
            java.lang.Object r8 = app.chalo.home.ui.base.HomeComponent.G0(r1, r8, r7)
            if (r8 != r0) goto L54
        L48:
            return r0
        L49:
            app.chalo.home.ui.base.HomeComponent r8 = r7.this$0
            x70 r0 = new x70
            r1 = 0
            r0.<init>(r8, r1)
            r8.E0(r0)
        L54:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$fetchHomeScreenConfig$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
