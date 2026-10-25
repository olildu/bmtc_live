package app.chalo.productpurchase.passpurchase.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase", f = "CreateSuperPassOrderUseCase.kt", l = {43, 44, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invoke", v = 1)
final class CreateSuperPassOrderUseCase$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateSuperPassOrderUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSuperPassOrderUseCase$invoke$1(CreateSuperPassOrderUseCase createSuperPassOrderUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = createSuperPassOrderUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, 0L, null, null, null, null, null, this);
    }
}
