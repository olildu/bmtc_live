package app.chalo.mticket.ui.passengerselection;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import java.util.ArrayList;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1", f = "MTicketPassengerSelectionComponent.kt", l = {218}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductBookingRouteDetails productBookingRouteDetails;
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState = (MTicketPassengerSelectionDataState) this.this$0.f.getValue();
        MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = mTicketPassengerSelectionDataState.f;
        if (singleJourneyTicketAppModel != null && (productBookingRouteDetails = mTicketPassengerSelectionDataState.f5743a) != null && (productBookingStopDetails = mTicketPassengerSelectionDataState.b) != null && (productBookingStopDetails2 = mTicketPassengerSelectionDataState.c) != null) {
            this.label = 1;
            Preferences.Key key = MTicketPassengerSelectionComponent.D;
            MTicketPassengerSelectionContainer.Companion companion = MTicketPassengerSelectionContainer.INSTANCE;
            MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer = ((MTicketPassengerSelectionDataState) mTicketPassengerSelectionComponent.f.getValue()).m;
            ArrayList arrayList = singleJourneyTicketAppModel.z;
            companion.getClass();
            if (mTicketPassengerSelectionComponent.K0(singleJourneyTicketAppModel, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, MTicketPassengerSelectionContainer.Companion.a(mTicketPassengerSelectionContainer, arrayList), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
