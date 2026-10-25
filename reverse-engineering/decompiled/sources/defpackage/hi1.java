package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchRequest;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15830a;

    public /* synthetic */ hi1(int i) {
        this.f15830a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15830a) {
            case 0:
                return TextFieldValue.Saver$lambda$1(obj);
            case 1:
                return TextKt.Text_Z58ophY$lambda$4$lambda$3((TextLayoutResult) obj);
            case 2:
                return TextKt.Text_fLXpl1I$lambda$14$lambda$13((TextLayoutResult) obj);
            case 3:
                return TextKt.Text_IbK3jfQ$lambda$11$lambda$10((TextLayoutResult) obj);
            case 4:
                return TextKt.Text__4IGK_g$lambda$17$lambda$16((TextLayoutResult) obj);
            case 5:
                return TextLinkScope._init_$lambda$0((AnnotatedString.Range) obj);
            case 6:
                return TextLinkScope.LinksComposables$lambda$0$1$0((SemanticsPropertyReceiver) obj);
            case 7:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.i(semantics, "$this$semantics");
                return Unit.f17538a;
            case 8:
                Intrinsics.i((PremiumBusFareDetailsSwitchRequest) obj, "it");
                return Unit.f17538a;
            case 9:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 10:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("Ticket");
                return Unit.f17538a;
            case 11:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("Ticket");
                return Unit.f17538a;
            case 12:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("Ticket");
                return Unit.f17538a;
            case 13:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("Ticket");
                return Unit.f17538a;
            case 14:
                TicketSummaryDataState it = (TicketSummaryDataState) obj;
                Intrinsics.i(it, "it");
                return TicketSummaryDataState.a(it, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 15:
                TicketSummaryDataState it2 = (TicketSummaryDataState) obj;
                Intrinsics.i(it2, "it");
                return TicketSummaryDataState.a(it2, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 16:
                TicketSummaryDataState it3 = (TicketSummaryDataState) obj;
                Intrinsics.i(it3, "it");
                return TicketSummaryDataState.a(it3, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32639);
            case 17:
                TicketSummaryDataState it4 = (TicketSummaryDataState) obj;
                Intrinsics.i(it4, "it");
                return TicketSummaryDataState.a(it4, null, false, true, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 18:
                TicketSummaryDataState it5 = (TicketSummaryDataState) obj;
                Intrinsics.i(it5, "it");
                return TicketSummaryDataState.a(it5, null, false, true, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 19:
                TicketSummaryDataState it6 = (TicketSummaryDataState) obj;
                Intrinsics.i(it6, "it");
                return TicketSummaryDataState.a(it6, null, false, false, true, null, null, null, null, null, null, null, false, null, null, null, 32757);
            case 20:
                TicketSummaryDataState it7 = (TicketSummaryDataState) obj;
                Intrinsics.i(it7, "it");
                return TicketSummaryDataState.a(it7, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 21:
                TicketSummaryDataState it8 = (TicketSummaryDataState) obj;
                Intrinsics.i(it8, "it");
                return TicketSummaryDataState.a(it8, null, false, true, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 22:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, true, null, null, null, null, null, null, null, false, null, null, null, 32759);
            case 23:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, true, null, null, null, null, null, null, null, false, null, null, null, 32725);
            case 24:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, true, null, null, null, null, null, null, null, false, null, null, null, 32661);
            case 25:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 26:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 27:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 28:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            default:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, true, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
        }
    }
}
