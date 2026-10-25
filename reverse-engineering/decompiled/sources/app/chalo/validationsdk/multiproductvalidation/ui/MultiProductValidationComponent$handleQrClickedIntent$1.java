package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.constants.Source;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.ProductKt;
import defpackage.lj0;
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
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleQrClickedIntent$1", f = "MultiProductValidationComponent.kt", l = {229}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handleQrClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handleQrClickedIntent$1(MultiProductValidationComponent multiProductValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handleQrClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handleQrClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MultiProductValidationDataState multiProductValidationDataState;
        MultiProductValidationDataState multiProductValidationDataState2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            multiProductValidationDataState = (MultiProductValidationDataState) this.this$0.f.getValue();
            ProductValidationData productValidationData = multiProductValidationDataState.c;
            if (productValidationData == null || productValidationData.d()) {
                z = false;
                multiProductValidationDataState2 = multiProductValidationDataState;
            } else {
                ProductValidationData productValidationData2 = multiProductValidationDataState.c;
                this.L$0 = multiProductValidationDataState;
                this.label = 1;
                Object objC = productValidationData2.C(this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                multiProductValidationDataState2 = multiProductValidationDataState;
                obj = objC;
            }
            Unit unit = Unit.f17538a;
            if (z && Intrinsics.d(multiProductValidationDataState2.c, ((MultiProductValidationDataState) this.this$0.f.getValue()).c) && !((MultiProductValidationDataState) this.this$0.f.getValue()).d.f10681a.isEmpty()) {
                MultiProductValidationComponent.G0(this.this$0).f(ProductKt.a(this.this$0.k.b.b), Source.MULTI_PRODUCT_VALIDATION_SCREEN.getSourceName());
                this.this$0.E0(new lj0(12));
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        multiProductValidationDataState2 = (MultiProductValidationDataState) this.L$0;
        ResultKt.b(obj);
        if (!((Boolean) obj).booleanValue() || multiProductValidationDataState2.d.f10681a.isEmpty()) {
            multiProductValidationDataState = multiProductValidationDataState2;
            z = false;
            multiProductValidationDataState2 = multiProductValidationDataState;
        }
        Unit unit2 = Unit.f17538a;
        if (z) {
            MultiProductValidationComponent.G0(this.this$0).f(ProductKt.a(this.this$0.k.b.b), Source.MULTI_PRODUCT_VALIDATION_SCREEN.getSourceName());
            this.this$0.E0(new lj0(12));
        }
        return unit2;
    }
}
