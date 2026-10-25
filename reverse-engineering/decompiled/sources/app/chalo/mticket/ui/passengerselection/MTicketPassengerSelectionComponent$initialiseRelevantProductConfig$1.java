package app.chalo.mticket.ui.passengerselection;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent", f = "MTicketPassengerSelectionComponent.kt", l = {475, 480, 481}, m = "initialiseRelevantProductConfig", v = 1)
final class MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mTicketPassengerSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
        Preferences.Key key = MTicketPassengerSelectionComponent.D;
        return mTicketPassengerSelectionComponent.L0(null, null, this);
    }
}
