package app.chalo.ncmc.data.appmodel;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardsInfoAppModelKt {
    public static final ChaloCardUnsyncedRechargeDetails a(String cardNumber, List list) {
        Object next;
        Intrinsics.i(list, "<this>");
        Intrinsics.i(cardNumber, "cardNumber");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((ChaloCardUnsyncedRechargeDetails) next).f6134a, cardNumber)) {
                return (ChaloCardUnsyncedRechargeDetails) next;
            }
        }
        next = null;
        return (ChaloCardUnsyncedRechargeDetails) next;
    }

    public static final String b(ChaloCardDetails chaloCardDetails) {
        ChaloCardType chaloCardType;
        Intrinsics.i(chaloCardDetails, "<this>");
        String d = chaloCardDetails.getD();
        if (d != null) {
            return d;
        }
        if (chaloCardDetails instanceof SemiClosedCardDetailsAppModel) {
            chaloCardType = ChaloCardType.SEMICLOSED;
        } else if (chaloCardDetails instanceof ClosedCardDetailsAppModel) {
            chaloCardType = ChaloCardType.CLOSED;
        } else if (chaloCardDetails instanceof OpenCardDetailsAppModel) {
            chaloCardType = ChaloCardType.OPEN;
        } else {
            if (!(chaloCardDetails instanceof UnknownCardDetailsAppModel)) {
                throw new NoWhenBranchMatchedException();
            }
            chaloCardType = null;
        }
        if (chaloCardType != null) {
            return chaloCardType.name();
        }
        return null;
    }
}
