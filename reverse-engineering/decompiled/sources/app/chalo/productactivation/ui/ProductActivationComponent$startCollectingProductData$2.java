package app.chalo.productactivation.ui;

import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.scenes.ChaloNavigationManagerKt;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ProductActivationComponent$startCollectingProductData$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductActivationComponent f8027a;

    public ProductActivationComponent$startCollectingProductData$2(ProductActivationComponent productActivationComponent) {
        this.f8027a = productActivationComponent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(ActivationProductData activationProductData, Continuation continuation) {
        ProductActivationComponent$startCollectingProductData$2$emit$1 productActivationComponent$startCollectingProductData$2$emit$1;
        if (continuation instanceof ProductActivationComponent$startCollectingProductData$2$emit$1) {
            productActivationComponent$startCollectingProductData$2$emit$1 = (ProductActivationComponent$startCollectingProductData$2$emit$1) continuation;
            int i = productActivationComponent$startCollectingProductData$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$startCollectingProductData$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$startCollectingProductData$2$emit$1 = new ProductActivationComponent$startCollectingProductData$2$emit$1(this, continuation);
            }
        } else {
            productActivationComponent$startCollectingProductData$2$emit$1 = new ProductActivationComponent$startCollectingProductData$2$emit$1(this, continuation);
        }
        Object obj = productActivationComponent$startCollectingProductData$2$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$startCollectingProductData$2$emit$1.label;
        Unit unit = Unit.f17538a;
        ProductActivationComponent productActivationComponent = this.f8027a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (activationProductData == null) {
                ChaloNavigationManagerKt.c(productActivationComponent.l);
                return unit;
            }
            productActivationComponent$startCollectingProductData$2$emit$1.L$0 = activationProductData;
            productActivationComponent$startCollectingProductData$2$emit$1.label = 1;
            if (ProductActivationComponent.K0(productActivationComponent, activationProductData, productActivationComponent$startCollectingProductData$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activationProductData = (ActivationProductData) productActivationComponent$startCollectingProductData$2$emit$1.L$0;
            ResultKt.b(obj);
        }
        productActivationComponent.E0(new vw0(activationProductData, 2));
        return unit;
    }
}
