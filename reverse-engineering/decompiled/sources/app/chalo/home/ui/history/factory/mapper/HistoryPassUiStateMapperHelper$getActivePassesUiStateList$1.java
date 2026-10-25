package app.chalo.home.ui.history.factory.mapper;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.spatial.RectListKt;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper", f = "HistoryPassUiStateMapperHelper.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 61, RectListKt.BitOffsetForGesturable, 66, 71, 76, 83, 85, 101, 112, 112, 132, 170, 178, 197, 197, 199, 200, ComposerKt.providerMapsKey, 209, 214, 221, 223, 239, 250, 250, 275, 314, 320, 337, 360, 362, 392, 394, 399, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE}, m = "getActivePassesUiStateList", v = 1)
final class HistoryPassUiStateMapperHelper$getActivePassesUiStateList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryPassUiStateMapperHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryPassUiStateMapperHelper$getActivePassesUiStateList$1(HistoryPassUiStateMapperHelper historyPassUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyPassUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}
