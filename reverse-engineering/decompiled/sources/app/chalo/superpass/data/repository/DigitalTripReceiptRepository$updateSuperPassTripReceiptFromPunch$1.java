package app.chalo.superpass.data.repository;

import app.chalo.superpass.data.dao.DigitalTripReceiptDao;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.DigitalTripReceiptRepository", f = "DigitalTripReceiptRepository.kt", l = {52, 57}, m = "updateSuperPassTripReceiptFromPunch", v = 1)
final class DigitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DigitalTripReceiptRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1(DigitalTripReceiptRepository digitalTripReceiptRepository, Continuation continuation) {
        super(continuation);
        this.this$0 = digitalTripReceiptRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DigitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1 digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        DigitalTripReceiptRepository digitalTripReceiptRepository = this.this$0;
        digitalTripReceiptRepository.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1 = this;
        } else {
            digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1 = new DigitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1(digitalTripReceiptRepository, this);
        }
        Object obj2 = digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj2);
            return unit;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return unit;
        }
        SuperPassTripReceipt superPassTripReceipt = (SuperPassTripReceipt) digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1.L$0;
        ResultKt.b(obj2);
        DigitalTripReceiptDao digitalTripReceiptDao = digitalTripReceiptRepository.f9592a;
        digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1.L$0 = null;
        digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1.label = 2;
        return digitalTripReceiptDao.a(superPassTripReceipt, digitalTripReceiptRepository$updateSuperPassTripReceiptFromPunch$1) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
