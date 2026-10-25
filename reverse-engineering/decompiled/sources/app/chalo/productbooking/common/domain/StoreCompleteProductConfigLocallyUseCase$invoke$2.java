package app.chalo.productbooking.common.domain;

import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase$invoke$2", f = "StoreCompleteProductConfigLocallyUseCase.kt", l = {29, 43, 56}, m = "invokeSuspend", v = 1)
final class StoreCompleteProductConfigLocallyUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ProductConfigCompleteDetailsListApiResponseModel $configApiModel;
    final /* synthetic */ String $configId;
    final /* synthetic */ ProductConfigCompleteDetailsApiResponseModel $configModel;
    int label;
    final /* synthetic */ StoreCompleteProductConfigLocallyUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreCompleteProductConfigLocallyUseCase$invoke$2(ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, String str, ProductConfigCompleteDetailsListApiResponseModel productConfigCompleteDetailsListApiResponseModel, Continuation continuation) {
        super(2, continuation);
        this.$configModel = productConfigCompleteDetailsApiResponseModel;
        this.this$0 = storeCompleteProductConfigLocallyUseCase;
        this.$configId = str;
        this.$configApiModel = productConfigCompleteDetailsListApiResponseModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreCompleteProductConfigLocallyUseCase$invoke$2(this.$configModel, this.this$0, this.$configId, this.$configApiModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreCompleteProductConfigLocallyUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (r10.i(r3, r9) == r0) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
