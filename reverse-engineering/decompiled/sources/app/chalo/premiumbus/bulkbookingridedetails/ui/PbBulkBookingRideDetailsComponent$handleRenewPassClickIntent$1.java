package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.constants.Source;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import defpackage.kn0;
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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {224}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassResponseAppModel $pass;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, SuperPassResponseAppModel superPassResponseAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$pass = superPassResponseAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1(this.this$0, this.$pass, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handleRenewPassClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
            HandlePremiumPassRenewFlowUseCase handlePremiumPassRenewFlowUseCase = pbBulkBookingRideDetailsComponent.F;
            PassTierType passTierType = ((PbBulkBookingRideDetailsViewState) pbBulkBookingRideDetailsComponent.f.getValue()).y;
            SuperPassResponseAppModel superPassResponseAppModel = this.$pass;
            String str = superPassResponseAppModel.f6891a;
            SuperPassTripPreferences superPassTripPreferences = superPassResponseAppModel.j;
            Source source = Source.PB_BULK_BOOKING_RIDE_DETAILS_SCREEN;
            kn0 kn0Var = new kn0(this.this$0, 10);
            this.label = 1;
            if (handlePremiumPassRenewFlowUseCase.c(passTierType, str, superPassTripPreferences, source, kn0Var, this) == coroutineSingletons) {
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
