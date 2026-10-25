package app.chalo.superpass.data.features;

import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.repository.DigitalTripReceiptRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.features.DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1", f = "DigitalTripReceiptFeature.kt", l = {90}, m = "invokeSuspend", v = 1)
final class DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPass $lSuperPass;
    int label;
    final /* synthetic */ DigitalTripReceiptFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1(DigitalTripReceiptFeature digitalTripReceiptFeature, SuperPass superPass, Continuation continuation) {
        super(2, continuation);
        this.this$0 = digitalTripReceiptFeature;
        this.$lSuperPass = superPass;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1(this.this$0, this.$lSuperPass, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                List listC = this.this$0.b.f9592a.c();
                ArrayList arrayList2 = null;
                if (listC != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : listC) {
                        if (Intrinsics.d(((ProductActivationDetails) obj2).d, "superPass")) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (listC != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj3 : listC) {
                        if (Intrinsics.d(((ProductActivationDetails) obj3).d, "singleJourneyTicket")) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                DigitalTripReceiptRepository digitalTripReceiptRepository = this.this$0.b;
                SuperPass superPass = this.$lSuperPass;
                this.label = 1;
                if (digitalTripReceiptRepository.i(superPass, arrayList, arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            this.this$0.e.i(e);
        }
        return Unit.f17538a;
    }
}
