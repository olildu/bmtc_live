package app.chalo.mticket.ui.tripinfo;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.constants.Source;
import app.chalo.instantticket.data.model.RouteInfoToProductBookingDetailsHelperKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.t60;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleInitialisationIntent$1", f = "MTicketTripInfoComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketTripInfoIntent.InitialisationIntent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX INFO: renamed from: app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleInitialisationIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleInitialisationIntent$1$2", f = "MTicketTripInfoComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MTicketTripInfoComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MTicketTripInfoComponent mTicketTripInfoComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = mTicketTripInfoComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
                this.label = 1;
                if (mTicketTripInfoComponent.J0(false, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$handleInitialisationIntent$1(MTicketTripInfoComponent mTicketTripInfoComponent, MTicketTripInfoIntent.InitialisationIntent initialisationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
        this.$intent = initialisationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MTicketTripInfoComponent$handleInitialisationIntent$1 mTicketTripInfoComponent$handleInitialisationIntent$1 = new MTicketTripInfoComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
        mTicketTripInfoComponent$handleInitialisationIntent$1.L$0 = obj;
        return mTicketTripInfoComponent$handleInitialisationIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MTicketTripInfoComponent$handleInitialisationIntent$1 mTicketTripInfoComponent$handleInitialisationIntent$1 = (MTicketTripInfoComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        mTicketTripInfoComponent$handleInitialisationIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductBookingRouteDetails productBookingRouteDetails;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        MTicketTripInfoRestoredState mTicketTripInfoRestoredState = this.this$0.A;
        boolean z = mTicketTripInfoRestoredState != null;
        if (mTicketTripInfoRestoredState == null || (productBookingRouteDetails = mTicketTripInfoRestoredState.b) == null) {
            RouteAppModel routeAppModel = this.$intent.b;
            productBookingRouteDetails = routeAppModel != null ? new ProductBookingRouteDetails(routeAppModel.b, routeAppModel.c, routeAppModel.j, RouteInfoToProductBookingDetailsHelperKt.b(routeAppModel.n), RouteInfoToProductBookingDetailsHelperKt.a(routeAppModel.e), routeAppModel.k) : null;
        }
        if (!z) {
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            Source source = this.$intent.f5767a;
            AnalyticsContract analyticsContract = mTicketTripInfoComponent.k;
            if (source == null) {
                source = Source.UNKNOWN;
            }
            AnalyticsContractImplKt.b(analyticsContract, "book mticket screen opened", source, null, false, 28);
        }
        MTicketTripInfoComponent mTicketTripInfoComponent2 = this.this$0;
        mTicketTripInfoComponent2.E0(new t60(20, mTicketTripInfoComponent2, this.$intent));
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3);
        if (productBookingRouteDetails != null) {
            this.this$0.L0(new MTicketTripInfoIntent.RouteDataReceivedIntent(productBookingRouteDetails, z));
        }
        MTicketTripInfoComponent mTicketTripInfoComponent3 = this.this$0;
        MTicketTripInfoRestoredState mTicketTripInfoRestoredState2 = mTicketTripInfoComponent3.A;
        if (mTicketTripInfoRestoredState2 != null) {
            ProductBookingStopDetails productBookingStopDetails = mTicketTripInfoRestoredState2.c;
            if (productBookingStopDetails != null) {
                mTicketTripInfoComponent3.L0(new MTicketTripInfoIntent.StopDataReceivedIntent(true, productBookingStopDetails, z));
            }
            ProductBookingStopDetails productBookingStopDetails2 = mTicketTripInfoRestoredState2.d;
            if (productBookingStopDetails2 != null) {
                mTicketTripInfoComponent3.L0(new MTicketTripInfoIntent.StopDataReceivedIntent(false, productBookingStopDetails2, z));
            }
        }
        return Unit.f17538a;
    }
}
