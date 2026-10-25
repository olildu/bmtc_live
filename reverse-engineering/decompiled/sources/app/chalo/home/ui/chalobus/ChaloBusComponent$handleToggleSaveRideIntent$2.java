package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleToggleSaveRideIntent$2", f = "ChaloBusComponent.kt", l = {2316, 2319}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleToggleSaveRideIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RidePreferenceBannerState $currentBannerState;
    final /* synthetic */ PBStopPlaceSelectedAppModel $destination;
    final /* synthetic */ ChaloBusViewIntent.ToggleSaveRideIntent $intent;
    final /* synthetic */ PBStopPlaceSelectedAppModel $origin;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleToggleSaveRideIntent$2(ChaloBusViewIntent.ToggleSaveRideIntent toggleSaveRideIntent, ChaloBusComponent chaloBusComponent, RidePreferenceBannerState ridePreferenceBannerState, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, Continuation continuation) {
        super(2, continuation);
        this.$intent = toggleSaveRideIntent;
        this.this$0 = chaloBusComponent;
        this.$currentBannerState = ridePreferenceBannerState;
        this.$origin = pBStopPlaceSelectedAppModel;
        this.$destination = pBStopPlaceSelectedAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleToggleSaveRideIntent$2(this.$intent, this.this$0, this.$currentBannerState, this.$origin, this.$destination, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleToggleSaveRideIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (app.chalo.home.ui.chalobus.ChaloBusComponent.Q0(r6, r1, r2, r4, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (app.chalo.home.ui.chalobus.ChaloBusComponent.P0(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.ResultKt.b(r6)
            goto L44
        L19:
            kotlin.ResultKt.b(r6)
            app.chalo.home.ui.chalobus.ChaloBusViewIntent$ToggleSaveRideIntent r6 = r5.$intent
            boolean r6 = r6.f3283a
            if (r6 == 0) goto L35
            app.chalo.home.ui.chalobus.ChaloBusComponent r6 = r5.this$0
            app.chalo.home.ui.chalobus.RidePreferenceBannerState r1 = r5.$currentBannerState
            app.chalo.home.ui.chalobus.RidePreferenceBannerState$SaveRideEligible r1 = (app.chalo.home.ui.chalobus.RidePreferenceBannerState.SaveRideEligible) r1
            app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel r2 = r5.$origin
            app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel r4 = r5.$destination
            r5.label = r3
            java.lang.Object r6 = app.chalo.home.ui.chalobus.ChaloBusComponent.Q0(r6, r1, r2, r4, r5)
            if (r6 != r0) goto L44
            goto L43
        L35:
            app.chalo.home.ui.chalobus.ChaloBusComponent r6 = r5.this$0
            app.chalo.home.ui.chalobus.RidePreferenceBannerState r1 = r5.$currentBannerState
            app.chalo.home.ui.chalobus.RidePreferenceBannerState$SaveRideEligible r1 = (app.chalo.home.ui.chalobus.RidePreferenceBannerState.SaveRideEligible) r1
            r5.label = r2
            java.lang.Object r6 = app.chalo.home.ui.chalobus.ChaloBusComponent.P0(r6, r1, r5)
            if (r6 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$handleToggleSaveRideIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
