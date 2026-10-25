package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.models.SuperPassSubTypes;
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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {499}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isBulkBookingPass;
    final /* synthetic */ boolean $isNewPurchaseFlow;
    final /* synthetic */ String $passId;
    final /* synthetic */ SuperPassSubTypes $superPassSubType;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, String str, SuperPassSubTypes superPassSubTypes, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$passId = str;
        this.$superPassSubType = superPassSubTypes;
        this.$isNewPurchaseFlow = z;
        this.$isBulkBookingPass = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1(this.this$0, this.$passId, this.$superPassSubType, this.$isNewPurchaseFlow, this.$isBulkBookingPass, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
            String str = this.$passId;
            SuperPassSubTypes superPassSubTypes = this.$superPassSubType;
            boolean z = this.$isNewPurchaseFlow;
            this.label = 1;
            if (PbBulkBookingRideDetailsComponent.F0(pbBulkBookingRideDetailsComponent, str, superPassSubTypes, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.this$0.U0(this.$passId);
        if (this.$isBulkBookingPass) {
            this.this$0.N0(this.$passId);
        }
        return Unit.f17538a;
    }
}
