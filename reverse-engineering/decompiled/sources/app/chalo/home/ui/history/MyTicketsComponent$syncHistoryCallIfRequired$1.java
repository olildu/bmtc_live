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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$syncHistoryCallIfRequired$1", f = "MyTicketsComponent.kt", l = {571, 573, 576, 582, 593}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$syncHistoryCallIfRequired$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$syncHistoryCallIfRequired$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$syncHistoryCallIfRequired$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$syncHistoryCallIfRequired$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r11.o(r10) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r11.o(r10) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r11.o(r10) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r11.o(r10) == r0) goto L42;
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
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 == r5) goto L1e
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            kotlin.ResultKt.b(r11)
            goto Lc5
        L23:
            kotlin.ResultKt.b(r11)
            goto L38
        L27:
            kotlin.ResultKt.b(r11)
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.domain.FetchHistoryScreenConfigDataUseCase r11 = r11.F
            r10.label = r6
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L38
            goto Lb9
        L38:
            app.chalo.home.data.HistoryScreenConfigForCity r11 = (app.chalo.home.data.HistoryScreenConfigForCity) r11
            long r6 = r11.g
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.contract.HomeScreenInfoHelper r11 = r11.n
            kotlinx.coroutines.flow.StateFlow r11 = r11.k()
            java.lang.Object r11 = r11.getValue()
            app.chalo.home.HistoryCallApiFetchState r11 = (app.chalo.home.HistoryCallApiFetchState) r11
            app.chalo.home.FetchState r11 = r11.f2859a
            app.chalo.home.FetchState$Unknown r1 = app.chalo.home.FetchState.Unknown.f2858a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r11, r1)
            if (r1 == 0) goto L61
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.contract.HomeScreenInfoHelper r11 = r11.n
            r10.label = r5
            java.lang.Object r11 = r11.o(r10)
            if (r11 != r0) goto Lc5
            goto Lb9
        L61:
            boolean r1 = r11 instanceof app.chalo.home.FetchState.Failed
            if (r1 == 0) goto L83
            app.chalo.home.ui.history.MyTicketsComponent r1 = r10.this$0
            app.chalo.contract.BasicInfoContract r1 = r1.k
            long r1 = r1.e()
            app.chalo.home.FetchState$Failed r11 = (app.chalo.home.FetchState.Failed) r11
            long r8 = r11.f2853a
            long r1 = r1 - r8
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r11 <= 0) goto Lc5
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.contract.HomeScreenInfoHelper r11 = r11.n
            r10.label = r4
            java.lang.Object r11 = r11.o(r10)
            if (r11 != r0) goto Lc5
            goto Lb9
        L83:
            boolean r1 = r11 instanceof app.chalo.home.FetchState.Fetched
            if (r1 == 0) goto La5
            app.chalo.home.ui.history.MyTicketsComponent r1 = r10.this$0
            app.chalo.contract.BasicInfoContract r1 = r1.k
            long r1 = r1.e()
            app.chalo.home.FetchState$Fetched r11 = (app.chalo.home.FetchState.Fetched) r11
            long r4 = r11.f2854a
            long r1 = r1 - r4
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r11 <= 0) goto Lc5
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.contract.HomeScreenInfoHelper r11 = r11.n
            r10.label = r3
            java.lang.Object r11 = r11.o(r10)
            if (r11 != r0) goto Lc5
            goto Lb9
        La5:
            boolean r1 = r11 instanceof app.chalo.home.FetchState.NotApplicable
            if (r1 != 0) goto Lc5
            boolean r1 = r11 instanceof app.chalo.home.FetchState.NotLoggedIn
            if (r1 == 0) goto Lba
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.contract.HomeScreenInfoHelper r11 = r11.n
            r10.label = r2
            java.lang.Object r11 = r11.o(r10)
            if (r11 != r0) goto Lc5
        Lb9:
            return r0
        Lba:
            boolean r11 = r11 instanceof app.chalo.home.FetchState.InProgress
            if (r11 == 0) goto Lbf
            goto Lc5
        Lbf:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        Lc5:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$syncHistoryCallIfRequired$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
