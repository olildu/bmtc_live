package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import defpackage.n8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {446}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent $intent;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent viewCreatedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$intent = viewCreatedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase = this.this$0.A;
            PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent viewCreatedIntent = this.$intent;
            String str = viewCreatedIntent.f6932a;
            SuperPassSubTypes superPassSubTypes = viewCreatedIntent.b;
            this.label = 1;
            objB = checkIfContinueWithBulkBookingFlowUseCase.b(str, superPassSubTypes, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objB = obj;
        }
        Boolean bool = (Boolean) objB;
        boolean zBooleanValue = bool.booleanValue();
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
        PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent viewCreatedIntent2 = this.$intent;
        AnalyticsContract.DefaultImpls.a(pbBulkBookingRideDetailsComponent.s, "pb bulk booking manage rides screen opened", Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN.getSourceName(), MapsKt.i(new Pair("passId", viewCreatedIntent2.f6932a), new Pair("productSubType", viewCreatedIntent2.b.getSubType()), new Pair("newPurchaseFlow", String.valueOf(viewCreatedIntent2.c)), new Pair("isBulkBookingPass", bool)), null, false, 24);
        this.this$0.E0(new n8(this.$intent, zBooleanValue, 6));
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.this$0;
        PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent viewCreatedIntent3 = this.$intent;
        BuildersKt.d(pbBulkBookingRideDetailsComponent2.j, pbBulkBookingRideDetailsComponent2.t.getDefault(), null, new PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1(pbBulkBookingRideDetailsComponent2, viewCreatedIntent3.f6932a, viewCreatedIntent3.b, viewCreatedIntent3.c, zBooleanValue, null), 2);
        return Unit.f17538a;
    }
}
