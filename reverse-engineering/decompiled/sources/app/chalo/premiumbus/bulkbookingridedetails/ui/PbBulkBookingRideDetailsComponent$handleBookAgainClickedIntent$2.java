package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusProductConfigForRepurchaseFailureReason;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2", f = "PbBulkBookingRideDetailsComponent.kt", l = {1061, 1075, 1101, 1115}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.BookAgainClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6908a;

        static {
            int[] iArr = new int[PremiumBusProductConfigForRepurchaseFailureReason.values().length];
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_FETCH_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6908a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, PbBulkBookingRideDetailsViewIntent.BookAgainClickedIntent bookAgainClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$intent = bookAgainClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handleBookAgainClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objV;
        Object objB;
        KotlinToastManager kotlinToastManager;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        boolean z;
        KotlinToastManager kotlinToastManager2;
        Object objB2;
        KotlinToastManager kotlinToastManager3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetProductConfigInfoForPremiumBusProductIfActiveUseCase getProductConfigInfoForPremiumBusProductIfActiveUseCase = this.this$0.v;
            String str = this.$intent.f6916a.f6938a;
            this.label = 1;
            objA = getProductConfigInfoForPremiumBusProductIfActiveUseCase.a(str, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i == 3) {
                ResultKt.b(obj);
                objV = obj;
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objV;
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
                String str2 = this.$intent.f6916a.g;
                if (premiumReserveTicketAppModel != null) {
                    z = true;
                } else {
                    z = false;
                }
                AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent.s, "pb bulk booking fetch ticket config success", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("bookingId", str2), new Pair("isTicketAvailable", Boolean.valueOf(z))), null, false, 24);
                this.this$0.E0(new mq0(18));
                if (premiumReserveTicketAppModel == null) {
                    PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.this$0;
                    kotlinToastManager2 = pbBulkBookingRideDetailsComponent2.x;
                    this.L$0 = kotlinToastManager2;
                    this.label = 4;
                    objB2 = pbBulkBookingRideDetailsComponent2.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB2 != coroutineSingletons) {
                        kotlinToastManager3 = kotlinToastManager2;
                    }
                    return coroutineSingletons;
                }
                PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
                PBOriginDestinationAppModel.INSTANCE.getClass();
                this.this$0.R0(new PremiumBusProductPurchaseFlowType.RePurchaseTicket(PBOriginDestinationAppModel.Companion.a(premiumReserveTicketTripPropertiesAppModel), premiumReserveTicketTripPropertiesAppModel.b));
                return Unit.f17538a;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager3 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB2 = obj;
            KotlinToastManagerKt.a(kotlinToastManager3, (String) objB2, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        objA = obj;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent3 = this.this$0;
            String str3 = this.$intent.f6916a.g;
            PremiumBusProductConfigForRepurchaseFailureReason premiumBusProductConfigForRepurchaseFailureReason = (PremiumBusProductConfigForRepurchaseFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent3.s, "pb bulk booking fetch ticket config failed", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("bookingId", str3), new Pair("errorType", premiumBusProductConfigForRepurchaseFailureReason.name())), null, false, 24);
            int i2 = WhenMappings.f6908a[premiumBusProductConfigForRepurchaseFailureReason.ordinal()];
            if (i2 == 1) {
                this.this$0.E0(new mq0(15));
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent4 = this.this$0;
                KotlinToastManager kotlinToastManager4 = pbBulkBookingRideDetailsComponent4.x;
                this.L$0 = kotlinToastManager4;
                this.label = 2;
                objB = pbBulkBookingRideDetailsComponent4.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager4;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                }
            } else if (i2 == 2) {
                this.this$0.E0(new mq0(16));
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.E0(new mq0(17));
            }
            return Unit.f17538a;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Flow flowA = this.this$0.w.a(this.$intent.f6916a.g);
        this.label = 3;
        objV = FlowKt.v(flowA, this);
        if (objV != coroutineSingletons) {
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objV;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent5 = this.this$0;
            String str4 = this.$intent.f6916a.g;
            if (premiumReserveTicketAppModel != null) {
                z = true;
            } else {
                z = false;
            }
            AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent5.s, "pb bulk booking fetch ticket config success", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("bookingId", str4), new Pair("isTicketAvailable", Boolean.valueOf(z))), null, false, 24);
            this.this$0.E0(new mq0(18));
            if (premiumReserveTicketAppModel == null) {
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent6 = this.this$0;
                kotlinToastManager2 = pbBulkBookingRideDetailsComponent6.x;
                this.L$0 = kotlinToastManager2;
                this.label = 4;
                objB2 = pbBulkBookingRideDetailsComponent6.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager3 = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager3, (String) objB2, ToastLength.LONG);
                }
            } else {
                PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel2 = premiumReserveTicketAppModel.b;
                PBOriginDestinationAppModel.INSTANCE.getClass();
                this.this$0.R0(new PremiumBusProductPurchaseFlowType.RePurchaseTicket(PBOriginDestinationAppModel.Companion.a(premiumReserveTicketTripPropertiesAppModel2), premiumReserveTicketTripPropertiesAppModel2.b));
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
