package app.chalo.checkout.ui.screen.payment;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import defpackage.mq0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1", f = "PaymentMainComponent.kt", l = {1240}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objCollect;
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
        this.this$0.E0(new mq0(1));
        final PaymentMainComponent paymentMainComponent = this.this$0;
        AppPermission.INSTANCE.getClass();
        final List listD0 = CollectionsKt.D0(AppPermission.Companion.a());
        this.label = 1;
        PermissionHandler permissionHandlerC = paymentMainComponent.N.c();
        if (permissionHandlerC == null || (objCollect = permissionHandlerC.a(listD0).collect(new FlowCollector() { // from class: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$requestPermissions$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                T next;
                List list = (List) obj2;
                List<AppPermission> list2 = listD0;
                boolean z = list2 instanceof Collection;
                PaymentMainComponent paymentMainComponent2 = paymentMainComponent;
                if (z && list2.isEmpty()) {
                    paymentMainComponent2.s1(PaymentViewIntent.PhoneAndSmsPermissionGranted.f1568a);
                } else {
                    for (AppPermission appPermission : list2) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (appPermission != ((Pair) next).d());
                        Pair pair = next;
                        if (pair == null || pair.e() != PermissionState.GRANTED) {
                            paymentMainComponent2.s1(PaymentViewIntent.PhoneAndSmsPermissionDenied.f1567a);
                        }
                    }
                    paymentMainComponent2.s1(PaymentViewIntent.PhoneAndSmsPermissionGranted.f1568a);
                }
                return Unit.f17538a;
            }
        }, this)) != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
