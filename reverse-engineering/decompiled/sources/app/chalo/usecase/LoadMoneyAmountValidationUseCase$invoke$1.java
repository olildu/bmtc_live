package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.LoadMoneyAmountValidationUseCase", f = "LoadMoneyAmountValidationUseCase.kt", l = {26, 35, 47, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invoke", v = 1)
final class LoadMoneyAmountValidationUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadMoneyAmountValidationUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoneyAmountValidationUseCase$invoke$1(LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = loadMoneyAmountValidationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0L, 0L, this);
    }
}
