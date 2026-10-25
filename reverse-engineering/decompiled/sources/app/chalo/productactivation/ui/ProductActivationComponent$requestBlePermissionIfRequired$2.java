package app.chalo.productactivation.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$requestBlePermissionIfRequired$2", f = "ProductActivationComponent.kt", l = {957}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$requestBlePermissionIfRequired$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ValidationProduct $validationProduct;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$requestBlePermissionIfRequired$2(ValidationProduct validationProduct, ProductActivationComponent productActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productActivationComponent;
        this.$validationProduct = validationProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$requestBlePermissionIfRequired$2(this.$validationProduct, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$requestBlePermissionIfRequired$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            List listA = this.this$0.n.a();
            PermissionHandler permissionHandlerC = this.this$0.m.c();
            if (permissionHandlerC != null) {
                Flow flowA = permissionHandlerC.a(listA);
                final ProductActivationComponent productActivationComponent = this.this$0;
                final ValidationProduct validationProduct = this.$validationProduct;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.productactivation.ui.ProductActivationComponent$requestBlePermissionIfRequired$2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        String sourceName;
                        List list = (List) obj2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (!PermissionStateKt.a((PermissionState) ((Pair) it.next()).e())) {
                                    ProductActivationComponent productActivationComponent2 = productActivationComponent;
                                    productActivationComponent2.getClass();
                                    ValidationProduct validationProduct2 = validationProduct;
                                    if ((validationProduct2 instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProduct2 instanceof ValidationProduct.QuickpayProduct.QuickpayValidation)) {
                                        sourceName = Source.ACTIVATE_MERGE_FLOW_FRAGMENT.getSourceName();
                                    } else if (validationProduct2 instanceof ValidationProduct.SuperPassProduct) {
                                        sourceName = "ActivateSuperPassFragment";
                                    } else {
                                        if (!(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) && !(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) && !(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) && !(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) && !(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) && !(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        sourceName = null;
                                    }
                                    String str = sourceName;
                                    if (str == null) {
                                        break;
                                    }
                                    AnalyticsContract.DefaultImpls.a(productActivationComponent2.o, "BLE permission denied", str, null, null, false, 28);
                                    break;
                                }
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
