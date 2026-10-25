package app.chalo.premiumbus.prebookedtickets.newactivation;

import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1", f = "NewPremiumBusReserveTicketActivationScreen.kt", l = {348, 350}, m = "invokeSuspend", v = 1)
final class NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomDrawerState $secondaryBottomDrawerState;
    final /* synthetic */ NewPremiumBusReserveTicketActivationState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, BottomDrawerState bottomDrawerState, Continuation continuation) {
        super(2, continuation);
        this.$state = newPremiumBusReserveTicketActivationState;
        this.$secondaryBottomDrawerState = bottomDrawerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1(this.$state, this.$secondaryBottomDrawerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r5.i(r4) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r5.j(r4) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L11
        Lc:
            kotlin.ResultKt.b(r5)
            goto L87
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState r5 = r4.$state
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes r5 = r5.j
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.ActionNotAllowed
            if (r1 != 0) goto L7c
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes$BleFeatureNotAvailable r1 = app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.BleFeatureNotAvailable.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.BookingAckRequired
            if (r1 != 0) goto L7c
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes$Confirmation r1 = app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.Confirmation.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.Error
            if (r1 != 0) goto L7c
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes$Expired r1 = app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.Expired.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.SeeMoreOptions
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.ShowAllocatedSeatsBottomSheet
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.ShowTripCancellationBottomSheet
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.TrackingNotAvailable
            if (r1 != 0) goto L7c
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes$TripNotStarted r1 = app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.TripNotStarted.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L7c
            app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes$UpdateOptionsLoading r1 = app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.UpdateOptionsLoading.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes.ShowRescheduleConfirmationBottomSheet
            if (r1 == 0) goto L69
            goto L7c
        L69:
            if (r5 != 0) goto L76
            app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState r5 = r4.$secondaryBottomDrawerState
            r4.label = r2
            java.lang.Object r5 = r5.i(r4)
            if (r5 != r0) goto L87
            goto L86
        L76:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L7c:
            app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState r5 = r4.$secondaryBottomDrawerState
            r4.label = r3
            java.lang.Object r5 = r5.j(r4)
            if (r5 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt$NewPremiumBusActivationScreenMainScreen$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
