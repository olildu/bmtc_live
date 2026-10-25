package app.chalo.home.ui.history;

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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleReportProblemClickedIntent$1", f = "MyTicketsComponent.kt", l = {1141, 1142, 1138}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleReportProblemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleReportProblemClickedIntent$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleReportProblemClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handleReportProblemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r3.b(r4, r5, r6, r7, null, r10) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L44
            if (r1 == r4) goto L34
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r11)
            goto La0
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r1 = r10.L$3
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = r10.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$0
            app.chalo.features.reportproblem.IReportProblemFeature r5 = (app.chalo.features.reportproblem.IReportProblemFeature) r5
            kotlin.ResultKt.b(r11)
            r6 = r5
            r5 = r3
            r3 = r6
            r6 = r1
            goto L86
        L34:
            java.lang.Object r1 = r10.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r10.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$0
            app.chalo.features.reportproblem.IReportProblemFeature r5 = (app.chalo.features.reportproblem.IReportProblemFeature) r5
            kotlin.ResultKt.b(r11)
            goto L61
        L44:
            kotlin.ResultKt.b(r11)
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.features.reportproblem.IReportProblemFeature r1 = r11.S
            r10.L$0 = r1
            java.lang.String r5 = "historyScreen"
            r10.L$1 = r5
            java.lang.String r6 = "activatePassScreen"
            r10.L$2 = r6
            r10.label = r4
            java.lang.Object r11 = app.chalo.home.ui.history.MyTicketsComponent.S0(r11, r10)
            if (r11 != r0) goto L5e
            goto L9f
        L5e:
            r4 = r5
            r5 = r1
            r1 = r6
        L61:
            java.util.Map r11 = (java.util.Map) r11
            app.chalo.home.ui.history.MyTicketsComponent r6 = r10.this$0
            app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase r7 = r6.v
            app.chalo.providers.cityprovider.CityProvider r6 = r6.m
            java.lang.String r6 = app.chalo.providers.cityprovider.CityProviderKt.b(r6)
            if (r6 != 0) goto L71
            java.lang.String r6 = ""
        L71:
            r10.L$0 = r5
            r10.L$1 = r4
            r10.L$2 = r1
            r10.L$3 = r11
            r10.label = r3
            java.lang.Object r3 = r7.a(r6, r10)
            if (r3 != r0) goto L82
            goto L9f
        L82:
            r6 = r11
            r11 = r3
            r3 = r5
            r5 = r1
        L86:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r7 = r11.booleanValue()
            r11 = 0
            r10.L$0 = r11
            r10.L$1 = r11
            r10.L$2 = r11
            r10.L$3 = r11
            r10.label = r2
            r8 = 0
            r9 = r10
            java.lang.Object r11 = r3.b(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto La0
        L9f:
            return r0
        La0:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$handleReportProblemClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
