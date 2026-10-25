package app.chalo.tripreceipt.tripreceiptnew;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
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
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$activateProductAndProceed$2", f = "RideReceiptComponent.kt", l = {441, 443, 448}, m = "invokeSuspend", v = 1)
final class RideReceiptComponent$activateProductAndProceed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$activateProductAndProceed$2(RideReceiptComponent rideReceiptComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideReceiptComponent;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideReceiptComponent$activateProductAndProceed$2 rideReceiptComponent$activateProductAndProceed$2 = new RideReceiptComponent$activateProductAndProceed$2(this.this$0, this.$passId, continuation);
        rideReceiptComponent$activateProductAndProceed$2.L$0 = obj;
        return rideReceiptComponent$activateProductAndProceed$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideReceiptComponent$activateProductAndProceed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FetchSuperPassBookingFromPassIdUseCase fetchSuperPassBookingFromPassIdUseCase = this.this$0.n;
            String str = this.$passId;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = fetchSuperPassBookingFromPassIdUseCase.a(str, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return unit;
        ChaloUserBookingType.SuperPassBooking superPassBooking = (ChaloUserBookingType.SuperPassBooking) obj;
        if (superPassBooking == null) {
            RideReceiptComponent rideReceiptComponent = this.this$0;
            KotlinToastManager kotlinToastManager2 = rideReceiptComponent.x;
            this.L$0 = kotlinToastManager2;
            this.label = 2;
            obj = rideReceiptComponent.m.b(StringEnum.PASS_EXPIRING, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                return unit;
            }
        } else {
            RideReceiptComponent rideReceiptComponent2 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            if (rideReceiptComponent2.I0(superPassBooking, this) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
