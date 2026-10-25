package app.chalo.premiumbus.ui.productselection;

import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.domain.GetCompleteProductConfigFromLocalCacheUseCase;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent$onViewStateActive$1", f = "PremiumBusProductSelectionComponent.kt", l = {168}, m = "invokeSuspend", v = 1)
final class PremiumBusProductSelectionComponent$onViewStateActive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductConfigCompleteDetailsAppModel $selectedCompleteConfig;
    final /* synthetic */ String $selectedProductId;
    int label;
    final /* synthetic */ PremiumBusProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductSelectionComponent$onViewStateActive$1(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, String str, ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductSelectionComponent;
        this.$selectedProductId = str;
        this.$selectedCompleteConfig = productConfigCompleteDetailsAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductSelectionComponent$onViewStateActive$1(this.this$0, this.$selectedProductId, this.$selectedCompleteConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductSelectionComponent$onViewStateActive$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetCompleteProductConfigFromLocalCacheUseCase getCompleteProductConfigFromLocalCacheUseCase = this.this$0.o;
            String str = this.$selectedProductId;
            this.label = 1;
            obj = getCompleteProductConfigFromLocalCacheUseCase.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel = (ProductConfigCompleteDetailsAppModel) obj;
        Unit unit = Unit.f17538a;
        if (productConfigCompleteDetailsAppModel == null || Intrinsics.d(this.$selectedCompleteConfig, productConfigCompleteDetailsAppModel)) {
            return unit;
        }
        PremiumBusProductSelectionComponent premiumBusProductSelectionComponent = this.this$0;
        premiumBusProductSelectionComponent.L0(((PremiumBusProductSelectionDataState) premiumBusProductSelectionComponent.f.getValue()).h, ((PremiumBusProductSelectionDataState) this.this$0.f.getValue()).f, true);
        return unit;
    }
}
