package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2", f = "PbPassPurchaseLandingScreenComponent.kt", l = {1186, 1216}, m = "invokeSuspend", v = 1)
final class PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PBStopPlaceSelectedAppModel $fromStop;
    final /* synthetic */ PBStopPlaceSelectedAppModel $toStop;
    int label;
    final /* synthetic */ PbPassPurchaseLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbPassPurchaseLandingScreenComponent;
        this.$fromStop = pBStopPlaceSelectedAppModel;
        this.$toStop = pBStopPlaceSelectedAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2(this.this$0, this.$fromStop, this.$toStop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r8 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.b(r8)
            goto L97
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.ResultKt.b(r8)
            goto L31
        L1d:
            kotlin.ResultKt.b(r8)
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r8 = r7.this$0
            app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase r8 = r8.p
            app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel r1 = r7.$fromStop
            app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel r4 = r7.$toStop
            r7.label = r2
            java.lang.Object r8 = r8.a(r1, r4, r7)
            if (r8 != r0) goto L31
            goto L96
        L31:
            app.chalo.premiumbus.domain.FetchPBStopPointsResult r8 = (app.chalo.premiumbus.domain.FetchPBStopPointsResult) r8
            boolean r1 = r8 instanceof app.chalo.premiumbus.domain.FetchPBStopPointsResult.Success
            r4 = 0
            if (r1 == 0) goto L45
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r0 = r7.this$0
            kr0 r1 = new kr0
            app.chalo.premiumbus.domain.FetchPBStopPointsResult$Success r8 = (app.chalo.premiumbus.domain.FetchPBStopPointsResult.Success) r8
            r1.<init>(r8, r4)
            r0.E0(r1)
            goto Lab
        L45:
            app.chalo.premiumbus.domain.FetchPBStopPointsResult$NoStopPointsAvailable r1 = app.chalo.premiumbus.domain.FetchPBStopPointsResult.NoStopPointsAvailable.f7189a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r1 == 0) goto L58
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r8 = r7.this$0
            ir0 r0 = new ir0
            r0.<init>(r3)
            r8.E0(r0)
            goto Lab
        L58:
            app.chalo.premiumbus.domain.FetchPBStopPointsResult$LocalException r1 = app.chalo.premiumbus.domain.FetchPBStopPointsResult.LocalException.f7188a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r1 != 0) goto L7b
            app.chalo.premiumbus.domain.FetchPBStopPointsResult$ResponseParseException r1 = app.chalo.premiumbus.domain.FetchPBStopPointsResult.ResponseParseException.f7190a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r1 != 0) goto L7b
            app.chalo.premiumbus.domain.FetchPBStopPointsResult$UnknownException r1 = app.chalo.premiumbus.domain.FetchPBStopPointsResult.UnknownException.f7193a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r1 != 0) goto L7b
            boolean r1 = r8 instanceof app.chalo.premiumbus.domain.FetchPBStopPointsResult.ServerError
            if (r1 == 0) goto L75
            goto L7b
        L75:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L7b:
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r1 = r7.this$0
            app.chalo.providers.stringprovider.StringProvider r1 = r1.l
            app.chalo.providers.stringprovider.StringEnum r5 = app.chalo.providers.stringprovider.StringEnum.GENERIC_ERROR_WITH_ERROR_CODE
            int r8 = r8.a()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r6
            r7.label = r3
            java.lang.Object r8 = r1.b(r5, r8, r7)
            if (r8 != r0) goto L97
        L96:
            return r0
        L97:
            java.lang.String r8 = (java.lang.String) r8
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r0 = r7.this$0
            ir0 r1 = new ir0
            r2 = 3
            r1.<init>(r2)
            r0.E0(r1)
            app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent r0 = r7.this$0
            app.chalo.providers.toast.KotlinToastManager r0 = r0.u
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r8)
        Lab:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
