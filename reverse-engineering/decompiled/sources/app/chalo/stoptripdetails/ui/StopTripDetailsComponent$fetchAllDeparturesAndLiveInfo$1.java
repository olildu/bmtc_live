package app.chalo.stoptripdetails.ui;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
@DebugMetadata(c = "app.chalo.stoptripdetails.ui.StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1", f = "StopTripDetailsComponent.kt", l = {162, TsExtractor.TS_STREAM_TYPE_AC4, 171}, m = "invokeSuspend", v = 1)
final class StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ String $stopId;
    final /* synthetic */ String $stopName;
    final /* synthetic */ ChaloTransitMode $transitMode;
    Object L$0;
    int label;
    final /* synthetic */ StopTripDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1(StopTripDetailsComponent stopTripDetailsComponent, String str, String str2, ChaloTransitMode chaloTransitMode, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripDetailsComponent;
        this.$stopId = str;
        this.$cityName = str2;
        this.$transitMode = chaloTransitMode;
        this.$stopName = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1(this.this$0, this.$stopId, this.$cityName, this.$transitMode, this.$stopName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (app.chalo.stoptripdetails.ui.StopTripDetailsComponent.F0(r4, (java.util.List) r11, r6, r7, r8, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.b(r11)
            goto L89
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.L$0
            app.chalo.stoptripdetails.ui.StopTripDetailsComponent r1 = (app.chalo.stoptripdetails.ui.StopTripDetailsComponent) r1
            kotlin.ResultKt.b(r11)
        L24:
            r4 = r1
            goto L74
        L26:
            kotlin.ResultKt.b(r11)
            goto L3e
        L2a:
            kotlin.ResultKt.b(r11)
            app.chalo.stoptripdetails.ui.StopTripDetailsComponent r11 = r10.this$0
            app.chalo.stoptripdetails.data.domain.FetchStopTripDetailsUseCase r11 = r11.k
            java.lang.String r1 = r10.$stopId
            java.lang.String r6 = r10.$cityName
            r10.label = r5
            java.lang.Object r11 = r11.a(r1, r6, r10)
            if (r11 != r0) goto L3e
            goto L88
        L3e:
            app.chalo.utils.ChaloUseCaseResult r11 = (app.chalo.utils.ChaloUseCaseResult) r11
            boolean r1 = r11 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L50
            app.chalo.stoptripdetails.ui.StopTripDetailsComponent r11 = r10.this$0
            mb1 r0 = new mb1
            r1 = 7
            r0.<init>(r1)
            r11.E0(r0)
            goto L89
        L50:
            boolean r1 = r11 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L8c
            app.chalo.stoptripdetails.ui.StopTripDetailsComponent r1 = r10.this$0
            app.chalo.utils.ChaloUseCaseResult$Success r11 = (app.chalo.utils.ChaloUseCaseResult.Success) r11
            java.lang.Object r11 = r11.f10419a
            java.util.List r11 = (java.util.List) r11
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r5 = r10.$transitMode
            r10.L$0 = r1
            r10.label = r4
            app.chalo.providers.CoroutineContextProvider r4 = r1.q
            kotlinx.coroutines.scheduling.DefaultScheduler r4 = r4.getDefault()
            app.chalo.stoptripdetails.ui.StopTripDetailsComponent$getStaticFilteredTripList$2 r6 = new app.chalo.stoptripdetails.ui.StopTripDetailsComponent$getStaticFilteredTripList$2
            r6.<init>(r11, r5, r1, r2)
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.g(r4, r6, r10)
            if (r11 != r0) goto L24
            goto L88
        L74:
            r5 = r11
            java.util.List r5 = (java.util.List) r5
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r6 = r10.$transitMode
            java.lang.String r7 = r10.$stopId
            java.lang.String r8 = r10.$stopName
            r10.L$0 = r2
            r10.label = r3
            r9 = r10
            java.lang.Object r11 = app.chalo.stoptripdetails.ui.StopTripDetailsComponent.F0(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        L8c:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.ui.StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
