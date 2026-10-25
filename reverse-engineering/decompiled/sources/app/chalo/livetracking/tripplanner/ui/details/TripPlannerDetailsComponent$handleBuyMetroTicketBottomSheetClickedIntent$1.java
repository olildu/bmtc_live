package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.constants.Source;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import defpackage.xj1;
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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1", f = "TripPlannerDetailsComponent.kt", l = {210}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4723a;

        static {
            int[] iArr = new int[MetroBookingFlowType.values().length];
            try {
                iArr[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4723a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent buyMetroTicketBottomSheetClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
        this.$intent = buyMetroTicketBottomSheetClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1 tripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1 = new TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1(this.this$0, this.$intent, continuation);
        tripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1.L$0 = obj;
        return tripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new xj1(7));
            MetroBookingFlowType metroBookingFlowTypeA = ProductBookingHelperKt.a(this.this$0.z.d());
            if (metroBookingFlowTypeA != null) {
                TripPlannerDetailsComponent tripPlannerDetailsComponent = this.this$0;
                TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent buyMetroTicketBottomSheetClickedIntent = this.$intent;
                int i2 = WhenMappings.f4723a[metroBookingFlowTypeA.ordinal()];
                if (i2 == 1) {
                    tripPlannerDetailsComponent.C.e(buyMetroTicketBottomSheetClickedIntent.f4726a, buyMetroTicketBottomSheetClickedIntent.b, Source.TRIP_PLANNER_DETAILS);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tripPlannerDetailsComponent.C.b(buyMetroTicketBottomSheetClickedIntent.f4726a, buyMetroTicketBottomSheetClickedIntent.b, Source.TRIP_PLANNER_DETAILS);
                }
            } else {
                TripPlannerDetailsComponent tripPlannerDetailsComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager2 = tripPlannerDetailsComponent2.B;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = tripPlannerDetailsComponent2.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
    }
}
