package app.chalo.mticket.ui.tripinfo;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIStateFactory", f = "MTicketTripInfoUIStateFactory.kt", l = {40, 45, 53, 63, EACTags.DISPLAY_IMAGE, 72, 76, 83, 87, 94, 98}, m = "convertToUIState", v = 1)
final class MTicketTripInfoUIStateFactory$convertToUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
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
    final /* synthetic */ MTicketTripInfoUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoUIStateFactory$convertToUIState$1(MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mTicketTripInfoUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
