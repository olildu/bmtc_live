package app.chalo.premiumbus.bulkbookingridedetails.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase", f = "UpdatePassStartDateChangesUseCase.kt", l = {35, 42, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 66, EACTags.DISPLAY_IMAGE, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 78, 85, 86, 93, 94}, m = "invoke", v = 1)
final class UpdatePassStartDateChangesUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatePassStartDateChangesUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePassStartDateChangesUseCase$invoke$1(UpdatePassStartDateChangesUseCase updatePassStartDateChangesUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = updatePassStartDateChangesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0L, false, this);
    }
}
