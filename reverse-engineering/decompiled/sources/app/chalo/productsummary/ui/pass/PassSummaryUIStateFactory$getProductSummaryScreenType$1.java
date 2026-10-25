package app.chalo.productsummary.ui.pass;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory", f = "PassSummaryUIStateFactory.kt", l = {93, 94, 95, 105, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 163, 164, 165, 177}, m = "getProductSummaryScreenType", v = 1)
final class PassSummaryUIStateFactory$getProductSummaryScreenType$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PassSummaryUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSummaryUIStateFactory$getProductSummaryScreenType$1(PassSummaryUIStateFactory passSummaryUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passSummaryUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
