package app.chalo.home.domain;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.GetProductStatusUIUseCase", f = "GetProductStatusUIUseCase.kt", l = {37, 38, 45, 46, 54, 71, 72, 80, 99, 100, 107, 108, 115, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_DTS_HD, 143, 144, 151, 161, 162, 164, 168, 169, 178, 179, 181, ModuleDescriptor.MODULE_VERSION, 186, 194, 215, 216, 223, 224, 231, 248, 249, 256, 257, 264, 265, 272, 273, 288, 289, 297, 298}, m = "invoke", v = 1)
final class GetProductStatusUIUseCase$invoke$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductStatusUIUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProductStatusUIUseCase$invoke$1(GetProductStatusUIUseCase getProductStatusUIUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getProductStatusUIUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
