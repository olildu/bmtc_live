package app.chalo.appsupport.uistate;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appsupport.uistate.BookingHelpUIStateFactory", f = "BookingHelpUIStateFactory.kt", l = {45, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 55, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = CLConstants.CRED_SUB_TYPE_MANDATE_CREATE, v = 1)
final class BookingHelpUIStateFactory$create$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BookingHelpUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingHelpUIStateFactory$create$1(BookingHelpUIStateFactory bookingHelpUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bookingHelpUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
