package app.chalo.productpurchase.productselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import defpackage.vw0;
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
@DebugMetadata(c = "app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$handleInitializationIntent$1", f = "ProductSelectionComponent.kt", l = {622}, m = "invokeSuspend", v = 1)
final class ProductSelectionComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductSelectionIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ ProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSelectionComponent$handleInitializationIntent$1(ProductSelectionComponent productSelectionComponent, ProductSelectionIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productSelectionComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductSelectionComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductSelectionComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductSelectionComponent$handleInitializationIntent$1 productSelectionComponent$handleInitializationIntent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new vw0(this.$intent, 4));
            ProductSelectionComponent productSelectionComponent = this.this$0;
            ProductSelectionIntent.InitializationIntent initializationIntent = this.$intent;
            String str = initializationIntent.d;
            boolean z = initializationIntent.e;
            boolean z2 = initializationIntent.f;
            boolean z3 = initializationIntent.f8677a;
            this.label = 1;
            productSelectionComponent$handleInitializationIntent$1 = this;
            if (ProductSelectionComponent.F0(productSelectionComponent, str, z, z2, z3, productSelectionComponent$handleInitializationIntent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            productSelectionComponent$handleInitializationIntent$1 = this;
        }
        ProductSelectionComponent productSelectionComponent2 = productSelectionComponent$handleInitializationIntent$1.this$0;
        AnalyticsContractImplKt.a(productSelectionComponent2.m, "product selection activity open", Source.PRODUCT_SELECTION_ACTIVITY, ((ProductSelectionDataState) productSelectionComponent2.f.getValue()).f8674a, null, 24);
        return Unit.f17538a;
    }
}
