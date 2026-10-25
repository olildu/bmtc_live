package app.chalo.home.ui.savedplacesandrides;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesUiStateFactory", f = "SavedPlacesAndRidesUiStateFactory.kt", l = {36, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50, 57, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, EACTags.APPLICATION_IMAGE, 72, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 78, 85, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "createUiState", v = 1)
final class SavedPlacesAndRidesUiStateFactory$createUiState$1 extends ContinuationImpl {
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
    final /* synthetic */ SavedPlacesAndRidesUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesUiStateFactory$createUiState$1(SavedPlacesAndRidesUiStateFactory savedPlacesAndRidesUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = savedPlacesAndRidesUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, this);
    }
}
