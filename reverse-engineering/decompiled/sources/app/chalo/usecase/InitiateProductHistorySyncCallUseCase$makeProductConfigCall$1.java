package app.chalo.usecase;

import androidx.compose.runtime.ComposerKt;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.productbooking.common.domain.FetchProductConfigForUiErrorReason;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/productbooking/common/data/models/app/ProductsConfigListForUiAppModel;", "Lapp/chalo/productbooking/common/domain/FetchProductConfigForUiErrorReason;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$makeProductConfigCall$1", f = "InitiateProductHistorySyncCallUseCase.kt", l = {ComposerKt.providerValuesKey}, m = "invokeSuspend", v = 1)
final class InitiateProductHistorySyncCallUseCase$makeProductConfigCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<ProductsConfigListForUiAppModel, FetchProductConfigForUiErrorReason>>, Object> {
    final /* synthetic */ boolean $fetchBackingProductConfigs;
    int label;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$makeProductConfigCall$1(boolean z, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, Continuation continuation) {
        super(2, continuation);
        this.$fetchBackingProductConfigs = z;
        this.this$0 = initiateProductHistorySyncCallUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitiateProductHistorySyncCallUseCase$makeProductConfigCall$1(this.$fetchBackingProductConfigs, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InitiateProductHistorySyncCallUseCase$makeProductConfigCall$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (!this.$fetchBackingProductConfigs) {
                return new ChaloUseCaseResult.Success(new ProductsConfigListForUiAppModel(EmptyList.f17557a));
            }
            FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase = this.this$0.x;
            this.label = 1;
            obj = fetchProductConfigsForUiUseCase.c((252 & 1) != 0 ? null : null, (252 & 2) != 0 ? null : null, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, null, null, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (ChaloUseCaseResult) obj;
    }
}
