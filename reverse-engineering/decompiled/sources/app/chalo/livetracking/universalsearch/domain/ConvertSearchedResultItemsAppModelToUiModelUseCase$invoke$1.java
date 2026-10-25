package app.chalo.livetracking.universalsearch.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.ConvertSearchedResultItemsAppModelToUiModelUseCase", f = "ConvertSearchedResultItemsAppModelToUiModelUseCase.kt", l = {41, 46, 55, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invoke", v = 1)
final class ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConvertSearchedResultItemsAppModelToUiModelUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1(ConvertSearchedResultItemsAppModelToUiModelUseCase convertSearchedResultItemsAppModelToUiModelUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = convertSearchedResultItemsAppModelToUiModelUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
