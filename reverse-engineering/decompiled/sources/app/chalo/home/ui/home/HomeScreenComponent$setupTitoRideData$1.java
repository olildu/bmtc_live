package app.chalo.home.ui.home;

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
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$setupTitoRideData$1", f = "HomeScreenComponent.kt", l = {345, 347}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$setupTitoRideData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$setupTitoRideData$1(HomeScreenComponent homeScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$setupTitoRideData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$setupTitoRideData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L43
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L2e
        L1e:
            kotlin.ResultKt.b(r6)
            app.chalo.home.ui.home.HomeScreenComponent r6 = r5.this$0
            app.chalo.tito.domain.CheckIsUnifiedTitoFlowEnabledUseCase r6 = r6.E
            r5.label = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L2e
            goto L42
        L2e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L69
            app.chalo.home.ui.home.HomeScreenComponent r6 = r5.this$0
            app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase r6 = r6.F
            r5.label = r3
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = kotlin.collections.CollectionsKt.H(r6)
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r6 = (app.chalo.titoridedetail.data.app.TITOValidationAppModel) r6
            if (r6 != 0) goto L5a
            app.chalo.home.ui.home.HomeScreenComponent r6 = r5.this$0
            u60 r0 = new u60
            r1 = 25
            r0.<init>(r1)
            r6.E0(r0)
            return r2
        L5a:
            app.chalo.home.ui.home.HomeScreenComponent r0 = r5.this$0
            app.chalo.titoridedetail.manager.TitoRideDataManager r0 = r0.D
            app.chalo.titoridedetail.data.app.TapInDetailAppModel r6 = r6.f9672a
            java.lang.String r6 = r6.f9673a
            app.chalo.constants.Source r1 = app.chalo.constants.Source.HOME_SCREEN_TAB
            r3 = 0
            r0.c(r6, r3, r1, r1)
            return r2
        L69:
            app.chalo.home.ui.home.HomeScreenComponent r6 = r5.this$0
            u60 r0 = new u60
            r1 = 26
            r0.<init>(r1)
            r6.E0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent$setupTitoRideData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
