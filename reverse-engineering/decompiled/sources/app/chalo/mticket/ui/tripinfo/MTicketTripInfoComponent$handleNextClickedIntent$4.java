package app.chalo.mticket.ui.tripinfo;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.MTicketSelectionArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleNextClickedIntent$4", f = "MTicketTripInfoComponent.kt", l = {335, 341}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$handleNextClickedIntent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductBookingStopDetails $selectedFromStop;
    final /* synthetic */ ProductBookingRouteDetails $selectedRoute;
    final /* synthetic */ ProductBookingStopDetails $selectedToStop;
    Object L$0;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$handleNextClickedIntent$4(MTicketTripInfoComponent mTicketTripInfoComponent, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
        this.$selectedRoute = productBookingRouteDetails;
        this.$selectedFromStop = productBookingStopDetails;
        this.$selectedToStop = productBookingStopDetails2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketTripInfoComponent$handleNextClickedIntent$4(this.this$0, this.$selectedRoute, this.$selectedFromStop, this.$selectedToStop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketTripInfoComponent$handleNextClickedIntent$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            String str = this.$selectedRoute.c;
            this.label = 1;
            obj = mTicketTripInfoComponent.K0(str, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) obj;
        if (singleJourneyTicketAppModel == null) {
            MTicketTripInfoComponent mTicketTripInfoComponent2 = this.this$0;
            if (!mTicketTripInfoComponent2.z) {
                KotlinToastManager kotlinToastManager2 = mTicketTripInfoComponent2.s;
                this.L$0 = kotlinToastManager2;
                this.label = 2;
                obj = mTicketTripInfoComponent2.p.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                }
                return coroutineSingletons;
            }
            mTicketTripInfoComponent2.z = false;
            mTicketTripInfoComponent2.L0(new MTicketTripInfoIntent.RetryFetchProductConfigurationIntent(true));
        } else {
            ChaloNavigationManager chaloNavigationManager = this.this$0.r;
            Json json = ChaloJson.b;
            ProductBookingRouteDetails productBookingRouteDetails = this.$selectedRoute;
            json.getClass();
            String strA = json.a(ProductBookingRouteDetails.INSTANCE.serializer(), productBookingRouteDetails);
            ProductBookingStopDetails productBookingStopDetails = this.$selectedFromStop;
            ProductBookingStopDetails.Companion companion = ProductBookingStopDetails.INSTANCE;
            ChaloNavigationManagerKt.e(chaloNavigationManager, new MTicketSelectionArgs(strA, json.a(companion.serializer(), productBookingStopDetails), json.a(companion.serializer(), this.$selectedToStop), singleJourneyTicketAppModel.j, Source.MTICKET_BOOKING_SCREEN, 32), null, 6);
        }
        return Unit.f17538a;
    }
}
