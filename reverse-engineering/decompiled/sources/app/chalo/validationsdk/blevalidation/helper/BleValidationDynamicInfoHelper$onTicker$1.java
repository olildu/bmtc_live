package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper", f = "BleValidationDynamicInfoHelper.kt", l = {51, 51, 65, 65, 67, EACTags.DEPRECATED, 78}, m = "onTicker", v = 1)
final class BleValidationDynamicInfoHelper$onTicker$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BleValidationDynamicInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationDynamicInfoHelper$onTicker$1(BleValidationDynamicInfoHelper bleValidationDynamicInfoHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bleValidationDynamicInfoHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BleValidationDynamicInfoHelper.a(this.this$0, null, null, null, this);
    }
}
