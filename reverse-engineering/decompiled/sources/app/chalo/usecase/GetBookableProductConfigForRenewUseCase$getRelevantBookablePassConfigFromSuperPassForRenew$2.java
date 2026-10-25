package app.chalo.usecase;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.mappers.AllProductsConfigApiToAppMappersKt;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.superpass.data.models.entities.SuperPass;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/models/BookableSuperPassConfiguration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.GetBookableProductConfigForRenewUseCase$getRelevantBookablePassConfigFromSuperPassForRenew$2", f = "GetBookableProductConfigForRenewUseCase.kt", l = {EACTags.ANSWER_TO_RESET}, m = "invokeSuspend", v = 1)
final class GetBookableProductConfigForRenewUseCase$getRelevantBookablePassConfigFromSuperPassForRenew$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BookableSuperPassConfiguration>, Object> {
    final /* synthetic */ SuperPass $superPass;
    int label;
    final /* synthetic */ GetBookableProductConfigForRenewUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBookableProductConfigForRenewUseCase$getRelevantBookablePassConfigFromSuperPassForRenew$2(GetBookableProductConfigForRenewUseCase getBookableProductConfigForRenewUseCase, SuperPass superPass, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getBookableProductConfigForRenewUseCase;
        this.$superPass = superPass;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetBookableProductConfigForRenewUseCase$getRelevantBookablePassConfigFromSuperPassForRenew$2(this.this$0, this.$superPass, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetBookableProductConfigForRenewUseCase$getRelevantBookablePassConfigFromSuperPassForRenew$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModelD;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProductPurchaseLocalDataSource productPurchaseLocalDataSource = this.this$0.d;
            String str = this.$superPass.d.f9569a;
            this.label = 1;
            obj = productPurchaseLocalDataSource.f(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProductConfigApiResponseModel productConfigApiResponseModel = (ProductConfigApiResponseModel) obj;
        if (productConfigApiResponseModel != null) {
            ProductConfigApiResponseModel.SuperPassConfigApiResponseModel superPassConfigApiResponseModel = productConfigApiResponseModel instanceof ProductConfigApiResponseModel.SuperPassConfigApiResponseModel ? (ProductConfigApiResponseModel.SuperPassConfigApiResponseModel) productConfigApiResponseModel : null;
            if (superPassConfigApiResponseModel != null && (superPassConfigAppModelD = AllProductsConfigApiToAppMappersKt.d(superPassConfigApiResponseModel)) != null) {
                BookingHelper bookingHelper = this.this$0.e;
                HashMap mapC = BookingHelper.c(superPassConfigAppModelD);
                BookingHelper bookingHelper2 = this.this$0.e;
                Map map = (Map) mapC.get(this.$superPass.d.b);
                if (map != null && !map.isEmpty()) {
                    return map.get(new Integer(this.$superPass.d.c));
                }
            }
        }
        return null;
    }
}
