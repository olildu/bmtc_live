package app.chalo.productactivation.ui;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.scenes.ChaloNavigationManagerKt;
import defpackage.rw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleInitializationIntent$1", f = "ProductActivationComponent.kt", l = {246}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductActivationIntent.InitializationIntent $intent;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleInitializationIntent$1(ProductActivationComponent productActivationComponent, ProductActivationIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.$intent = initializationIntent;
        this.this$0 = productActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductActivationComponent$handleInitializationIntent$1 productActivationComponent$handleInitializationIntent$1 = new ProductActivationComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
        productActivationComponent$handleInitializationIntent$1.L$0 = obj;
        return productActivationComponent$handleInitializationIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ProductActivationIntent.InitializationIntent initializationIntent;
        ProductActivationComponent productActivationComponent;
        ValidationProduct validationProductA;
        ProductActivationIntent.InitializationIntent initializationIntent2;
        ValidationProduct validationProduct;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            initializationIntent = this.$intent;
            productActivationComponent = this.this$0;
            ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
            String str = initializationIntent.b;
            String str2 = initializationIntent.f8036a;
            String str3 = initializationIntent.c;
            String str4 = initializationIntent.d;
            Long l = initializationIntent.e;
            companion.getClass();
            validationProductA = ValidationProduct.Companion.a(str, str3, str2, str4, l);
            if (validationProductA == null) {
                ChaloNavigationManagerKt.c(productActivationComponent.l);
                return unit;
            }
            if (initializationIntent.f) {
                this.L$0 = coroutineScope;
                this.L$1 = productActivationComponent;
                this.L$2 = initializationIntent;
                this.L$3 = initializationIntent;
                this.L$4 = validationProductA;
                this.label = 1;
                if (ProductActivationComponent.J0(productActivationComponent, str2, validationProductA, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                validationProduct = validationProductA;
                initializationIntent2 = initializationIntent;
            } else {
                initializationIntent2 = initializationIntent;
            }
            productActivationComponent.E0(new rw0(3, validationProductA, initializationIntent, initializationIntent2));
            BuildersKt.d(productActivationComponent.j, null, null, new ProductActivationComponent$createBrandingTypeForValidationProduct$1(validationProductA, productActivationComponent, null), 3);
            BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$2(validationProductA, productActivationComponent, null), 3);
            BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$3(productActivationComponent, initializationIntent, null), 3);
            if (initializationIntent.j instanceof PremiumBusUpsellRideOutcome.Booked) {
                BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$4(productActivationComponent, initializationIntent, null), 3);
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        validationProduct = (ValidationProduct) this.L$4;
        initializationIntent = (ProductActivationIntent.InitializationIntent) this.L$3;
        initializationIntent2 = (ProductActivationIntent.InitializationIntent) this.L$2;
        productActivationComponent = (ProductActivationComponent) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.b(obj);
        validationProductA = validationProduct;
        productActivationComponent.E0(new rw0(3, validationProductA, initializationIntent, initializationIntent2));
        BuildersKt.d(productActivationComponent.j, null, null, new ProductActivationComponent$createBrandingTypeForValidationProduct$1(validationProductA, productActivationComponent, null), 3);
        BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$2(validationProductA, productActivationComponent, null), 3);
        BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$3(productActivationComponent, initializationIntent, null), 3);
        if (initializationIntent.j instanceof PremiumBusUpsellRideOutcome.Booked) {
            BuildersKt.d(coroutineScope, null, null, new ProductActivationComponent$handleInitializationIntent$1$1$4(productActivationComponent, initializationIntent, null), 3);
        }
        return unit;
    }
}
