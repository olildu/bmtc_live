package app.chalo.productactivation.ui;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TripSummaryArgs;
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
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleViewSummaryIntent$1", f = "ProductActivationComponent.kt", l = {387}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleViewSummaryIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleViewSummaryIntent$1(ProductActivationComponent productActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$handleViewSummaryIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleViewSummaryIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActivationProductData activationProductData;
        BookingsRequestType rideBasedPassType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            ActivationProductData activationProductData2 = ((ProductActivationDataState) this.this$0.f.getValue()).b;
            if (activationProductData2 != null) {
                ProductActivationComponent productActivationComponent = this.this$0;
                this.L$0 = activationProductData2;
                this.label = 1;
                if (ProductActivationComponent.L0(productActivationComponent, activationProductData2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                activationProductData = activationProductData2;
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        activationProductData = (ActivationProductData) this.L$0;
        ResultKt.b(obj);
        if (activationProductData instanceof ActivationProductData.PassActivation.Magic) {
            rideBasedPassType = new BookingsRequestType.MagicPassType(((ActivationProductData.PassActivation.Magic) activationProductData).b.f9560a.f9566a);
        } else if (activationProductData instanceof ActivationProductData.PassActivation.RideBased) {
            rideBasedPassType = new BookingsRequestType.RideBasedPassType(((ActivationProductData.PassActivation.RideBased) activationProductData).b.f9560a.f9566a);
        } else {
            if (!(activationProductData instanceof ActivationProductData.InstantTicketActivation) && !(activationProductData instanceof ActivationProductData.QuickPayActivation) && !(activationProductData instanceof ActivationProductData.MobileTicketActivation) && !(activationProductData instanceof ActivationProductData.MetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCTicketActivation) && !(activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation) && !(activationProductData instanceof ActivationProductData.PremiumTicketActivation)) {
                throw new NoWhenBranchMatchedException();
            }
            rideBasedPassType = null;
        }
        if (rideBasedPassType != null) {
            ChaloNavigationManagerKt.e(this.this$0.l, new TripSummaryArgs.PassSummaryScreen(Source.ACTIVATE_SUPER_PASS_FRAGMENT, rideBasedPassType), null, 6);
        }
        return unit;
    }
}
