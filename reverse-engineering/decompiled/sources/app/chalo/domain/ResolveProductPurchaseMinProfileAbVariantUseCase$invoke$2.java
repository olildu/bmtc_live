package app.chalo.domain;

import app.chalo.constants.Source;
import app.chalo.models.remoteconfig.ProductPurchaseMinProfileUpdateRemoteConfigModel;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/models/remoteconfig/ProductPurchaseMinProfileUpdateRemoteConfigModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.domain.ResolveProductPurchaseMinProfileAbVariantUseCase$invoke$2", f = "ResolveProductPurchaseMinProfileAbVariantUseCase.kt", l = {31}, m = "invokeSuspend", v = 1)
final class ResolveProductPurchaseMinProfileAbVariantUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductPurchaseMinProfileUpdateRemoteConfigModel>, Object> {
    final /* synthetic */ Source $source;
    Object L$0;
    int label;
    final /* synthetic */ ResolveProductPurchaseMinProfileAbVariantUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveProductPurchaseMinProfileAbVariantUseCase$invoke$2(ResolveProductPurchaseMinProfileAbVariantUseCase resolveProductPurchaseMinProfileAbVariantUseCase, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = resolveProductPurchaseMinProfileAbVariantUseCase;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ResolveProductPurchaseMinProfileAbVariantUseCase$invoke$2(this.this$0, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveProductPurchaseMinProfileAbVariantUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductPurchaseMinProfileUpdateRemoteConfigModel productPurchaseMinProfileUpdateRemoteConfigModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ProductPurchaseMinProfileUpdateRemoteConfigModel productPurchaseMinProfileUpdateRemoteConfigModel2 = (ProductPurchaseMinProfileUpdateRemoteConfigModel) this.this$0.f2520a.a("showMinProfileUpdateDuringProductPurchase", Reflection.a(ProductPurchaseMinProfileUpdateRemoteConfigModel.class), new ProductPurchaseMinProfileUpdateRemoteConfigModel());
                if (!productPurchaseMinProfileUpdateRemoteConfigModel2.c) {
                    return ResolveProductPurchaseMinProfileAbVariantUseCase.a(this.this$0, productPurchaseMinProfileUpdateRemoteConfigModel2);
                }
                CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase = this.this$0.b;
                String str = productPurchaseMinProfileUpdateRemoteConfigModel2.b;
                String str2 = productPurchaseMinProfileUpdateRemoteConfigModel2.f5686a;
                this.L$0 = productPurchaseMinProfileUpdateRemoteConfigModel2;
                this.label = 1;
                Object objA = checkIfExperimentEnabledUseCase.a(str, str2, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productPurchaseMinProfileUpdateRemoteConfigModel = productPurchaseMinProfileUpdateRemoteConfigModel2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productPurchaseMinProfileUpdateRemoteConfigModel = (ProductPurchaseMinProfileUpdateRemoteConfigModel) this.L$0;
                ResultKt.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return ResolveProductPurchaseMinProfileAbVariantUseCase.a(this.this$0, productPurchaseMinProfileUpdateRemoteConfigModel);
            }
            this.this$0.d.a(productPurchaseMinProfileUpdateRemoteConfigModel.b, productPurchaseMinProfileUpdateRemoteConfigModel.f5686a, productPurchaseMinProfileUpdateRemoteConfigModel.d, this.$source.getSourceName());
            return productPurchaseMinProfileUpdateRemoteConfigModel;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return ResolveProductPurchaseMinProfileAbVariantUseCase.a(this.this$0, new ProductPurchaseMinProfileUpdateRemoteConfigModel());
        }
    }
}
