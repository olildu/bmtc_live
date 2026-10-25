package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.premiumbus.PremiumBusAnalyticsHelper;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import defpackage.zv0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {804}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldShowUpdatedDetails;
    Object L$0;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7452a;

        static {
            int[] iArr = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7452a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
        this.$shouldShowUpdatedDetails = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1(this.this$0, this.$shouldShowUpdatedDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = this.this$0;
            PremiumBusAnalyticsHelper premiumBusAnalyticsHelper = premiumReserveTicketPostBookingActionHandlerImpl.t;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = premiumReserveTicketPostBookingActionHandlerImpl.K;
            premiumBusAnalyticsHelper.b(premiumReserveTicketAppModel2 != null ? premiumReserveTicketAppModel2.f7113a.f7114a : "", premiumReserveTicketAppModel2 != null ? premiumReserveTicketAppModel2.f7113a.h : PremiumReserveTicketStatus.ACTIVE, this.$shouldShowUpdatedDetails);
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl2 = this.this$0;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = premiumReserveTicketPostBookingActionHandlerImpl2.K;
            if (premiumReserveTicketAppModel3 != null) {
                PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType = ((PremiumReserveTicketPostBookingActionState) premiumReserveTicketPostBookingActionHandlerImpl2.H.getValue()).o;
                PremiumReserveTicketAckType premiumReserveTicketAckType = null;
                if (premiumBusPostBookingBottomSheetType != null && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ActionNotAllowed) && !premiumBusPostBookingBottomSheetType.equals(PremiumBusPostBookingBottomSheetType.ActivationCurrentlyNotAllowed.f7417a) && !premiumBusPostBookingBottomSheetType.equals(PremiumBusPostBookingBottomSheetType.BleFeatureNotAvailable.f7418a) && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.Error) && !premiumBusPostBookingBottomSheetType.equals(PremiumBusPostBookingBottomSheetType.Expired.f7421a) && !premiumBusPostBookingBottomSheetType.equals(PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions.f7422a) && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.SeeMoreOptions) && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripCancellationConfirmation) && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ShowAllocatedSeats) && !(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripRescheduleConfirmation)) {
                    if (!(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.BookingAckRequired)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = ((PremiumBusPostBookingBottomSheetType.BookingAckRequired) premiumBusPostBookingBottomSheetType).f7419a;
                    if (premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) {
                        premiumReserveTicketAckType = PremiumReserveTicketAckType.SYSTEM_CANCELLED;
                    } else {
                        if (!(premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemReschedule)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        premiumReserveTicketAckType = PremiumReserveTicketAckType.SYSTEM_RESCHEDULED;
                    }
                }
                if (premiumReserveTicketAckType != null) {
                    AcknowledgePremiumReserveTicketCancellationUseCase acknowledgePremiumReserveTicketCancellationUseCase = this.this$0.j;
                    String str = premiumReserveTicketAppModel3.f7113a.f7114a;
                    this.L$0 = premiumReserveTicketAppModel3;
                    this.label = 1;
                    if (acknowledgePremiumReserveTicketCancellationUseCase.a(str, premiumReserveTicketAckType, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) this.L$0;
        ResultKt.b(obj);
        boolean z = this.$shouldShowUpdatedDetails;
        PremiumReserveTicketPostBookingActionEffect.Exit exit = PremiumReserveTicketPostBookingActionEffect.Exit.f7432a;
        if (!z) {
            this.this$0.f0(new zv0(15));
            this.this$0.J(exit);
            return unit;
        }
        this.this$0.f0(new zv0(15));
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        String str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
        if (premiumReserveTicketBookingPropertiesAppModel.h == PremiumReserveTicketStatus.SYSTEM_CANCELLED) {
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl3 = this.this$0;
            PBOriginDestinationAppModel.INSTANCE.getClass();
            premiumReserveTicketPostBookingActionHandlerImpl3.J(new PremiumReserveTicketPostBookingActionEffect.NavigateToRepurchaseFlow(PBOriginDestinationAppModel.Companion.a(premiumReserveTicketTripPropertiesAppModel), premiumReserveTicketTripPropertiesAppModel.b));
            return unit;
        }
        if (!premiumReserveTicketAppModel.e()) {
            this.this$0.J(exit);
            return unit;
        }
        if (WhenMappings.f7452a[premiumReserveTicketBookingPropertiesAppModel.h.ordinal()] == 1) {
            this.this$0.J(new PremiumReserveTicketPostBookingActionEffect.NavigateToPremiumActivationScreen(str2, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e));
            return unit;
        }
        this.this$0.J(new PremiumReserveTicketPostBookingActionEffect.NavigateToProductBookingSummary(str2));
        return unit;
    }
}
