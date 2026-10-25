package app.chalo.instantticket.ui.faredetails;

import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.constants.Source;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.ProductActivationArgs;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$handleOnPaymentCompletedIntent$1", f = "FareDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$handleOnPaymentCompletedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ boolean $isNoPaymentRequired;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$handleOnPaymentCompletedIntent$1(FareDetailsComponent fareDetailsComponent, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
        this.$bookingId = str;
        this.$isNoPaymentRequired = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$handleOnPaymentCompletedIntent$1(this.this$0, this.$bookingId, this.$isNoPaymentRequired, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FareDetailsComponent$handleOnPaymentCompletedIntent$1 fareDetailsComponent$handleOnPaymentCompletedIntent$1 = (FareDetailsComponent$handleOnPaymentCompletedIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        fareDetailsComponent$handleOnPaymentCompletedIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        FareDetailsComponent fareDetailsComponent = this.this$0;
        ProductBookingNavigation productBookingNavigation = fareDetailsComponent.H;
        ChaloNavigationManager chaloNavigationManager = fareDetailsComponent.y;
        Unit unit = Unit.f17538a;
        if (productBookingNavigation != null) {
            String str = this.$bookingId;
            boolean z = this.$isNoPaymentRequired;
            if (productBookingNavigation.equals(ProductBookingNavigation.OndcMetroBooking.INSTANCE)) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(str, "mobileTicket", "ondcMetroTicket", Source.ONDC_FARE_DETAILS_SCREEN, null, null, null, 1008), null, null, 6));
                return unit;
            }
            if (productBookingNavigation instanceof ProductBookingNavigation.ONDCTicket) {
                if (z) {
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.ONDCVehicleBasedTicket(str), Source.ONDC_FARE_DETAILS_SCREEN), null, null, 6));
                    return unit;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(str, "mobileTicket", "ondcTicket", Source.ONDC_FARE_DETAILS_SCREEN, null, null, null, 1008), null, null, 6));
                return unit;
            }
            if (!(productBookingNavigation instanceof ProductBookingNavigation.InstantTicket.FreshPurchase) && !(productBookingNavigation instanceof ProductBookingNavigation.StopBasedPassFreshPurchase)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return unit;
    }
}
