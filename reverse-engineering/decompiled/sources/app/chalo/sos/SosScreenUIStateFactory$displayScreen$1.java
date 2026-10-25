package app.chalo.sos;

import androidx.compose.ui.spatial.RectListKt;
import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.sos.SosScreenUIStateFactory", f = "SosScreenUIStateFactory.kt", l = {RectListKt.BitOffsetForGesturable, EACTags.DISPLAY_IMAGE, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, EACTags.DEPRECATED, 86, 104, 122, TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "displayScreen", v = 1)
final class SosScreenUIStateFactory$displayScreen$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SosScreenUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosScreenUIStateFactory$displayScreen$1(SosScreenUIStateFactory sosScreenUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sosScreenUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
