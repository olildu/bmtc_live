package app.chalo.metro.ui.regular;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1", f = "StopBasedMetroLandingScreenComponent.kt", l = {566, 580}, m = "invokeSuspend", v = 1)
final class StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBasedMetroLandingScreenViewIntent.InitialisationIntent $intent;
    int label;
    final /* synthetic */ StopBasedMetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, StopBasedMetroLandingScreenViewIntent.InitialisationIntent initialisationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedMetroLandingScreenComponent;
        this.$intent = initialisationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r7.M0(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L4f
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L32
        L1c:
            kotlin.ResultKt.b(r7)
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r7 = r6.this$0
            app.chalo.domain.GetProductCapabilitiesUseCase r7 = r7.u
            r6.label = r3
            java.lang.String r1 = ""
            java.lang.String r3 = "mobileTicket"
            java.lang.String r4 = "metroTicket"
            java.lang.Object r7 = r7.a(r3, r4, r1, r6)
            if (r7 != r0) goto L32
            goto L4e
        L32:
            app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel r7 = (app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel) r7
            app.chalo.models.productbooking.productcapability.OperationalHoursAppModel r7 = r7.e
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r1 = r6.this$0
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent$InitialisationIntent r3 = r6.$intent
            g41 r4 = new g41
            r5 = 14
            r4.<init>(r5, r3, r7)
            r1.E0(r4)
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r7 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = r7.M0(r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent$InitialisationIntent r7 = r6.$intent
            app.chalo.citydata.data.model.app.StopAppModel r0 = r7.f5536a
            if (r0 == 0) goto L73
            app.chalo.citydata.data.model.app.StopAppModel r7 = r7.b
            if (r7 == 0) goto L73
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r7 = r6.this$0
            kotlinx.coroutines.Job r0 = r7.B
            r1 = 0
            if (r0 == 0) goto L65
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            r0.cancel(r1)
        L65:
            kotlinx.coroutines.internal.ContextScope r0 = r7.j
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1 r2 = new app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1
            r2.<init>(r7, r1)
            r3 = 3
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.d(r0, r1, r1, r2, r3)
            r7.B = r0
        L73:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
