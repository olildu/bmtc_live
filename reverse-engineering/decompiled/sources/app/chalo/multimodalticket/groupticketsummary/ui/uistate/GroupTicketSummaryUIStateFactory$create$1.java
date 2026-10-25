package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryUIStateFactory", f = "GroupTicketSummaryUIStateFactory.kt", l = {85, 98, 109, 127, 141, 150, 164, 174, 179, 198, ComposerKt.providerMapsKey, 208, 220, 228}, m = CLConstants.CRED_SUB_TYPE_MANDATE_CREATE, v = 1)
final class GroupTicketSummaryUIStateFactory$create$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
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
    final /* synthetic */ GroupTicketSummaryUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketSummaryUIStateFactory$create$1(GroupTicketSummaryUIStateFactory groupTicketSummaryUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = groupTicketSummaryUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
