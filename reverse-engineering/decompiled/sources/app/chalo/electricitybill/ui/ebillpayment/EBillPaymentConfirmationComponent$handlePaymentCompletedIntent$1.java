package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.EBillPaymentSuccessArgs;
import defpackage.b00;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1", f = "EBillPaymentConfirmationComponent.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend", v = 1)
final class EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ EBillPaymentConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eBillPaymentConfirmationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strA;
        String strA2;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new b00(13));
            ChaloJson chaloJson = ChaloJson.f6455a;
            ElectricityBillAppModel electricityBillAppModel = ((EBillPaymentConfirmationDataState) this.this$0.f.getValue()).c;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(BuiltinSerializersKt.c(ElectricityBillAppModel.INSTANCE.serializer()), electricityBillAppModel);
            } catch (Exception unused) {
                strA = null;
            }
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            CreateOrderResponseAppModel createOrderResponseAppModel = ((EBillPaymentConfirmationDataState) this.this$0.f.getValue()).d;
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA2 = json2.a(BuiltinSerializersKt.c(CreateOrderResponseAppModel.INSTANCE.serializer()), createOrderResponseAppModel);
            } catch (Exception unused2) {
                strA2 = null;
            }
            if (strA == null || strA2 == null) {
                EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = eBillPaymentConfirmationComponent.n;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = eBillPaymentConfirmationComponent.q.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            } else {
                this.this$0.k.b(new ChaloNavigationRequest.Navigate(new EBillPaymentSuccessArgs(strA, strA2), null, null, 6));
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        hq0.s(kotlinToastManager, (String) obj);
        return Unit.f17538a;
    }
}
