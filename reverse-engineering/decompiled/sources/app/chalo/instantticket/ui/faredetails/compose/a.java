package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.material3.SheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3917a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ SheetState c;

    public /* synthetic */ a(int i, SheetState sheetState, CoroutineScope coroutineScope) {
        this.f3917a = i;
        this.b = coroutineScope;
        this.c = sheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3917a) {
            case 0:
                BuildersKt.d(this.b, null, null, new FareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$1$1$1(this.c, null), 3);
                break;
            case 1:
                BuildersKt.d(this.b, null, null, new FareDetailsBaseComposableKt$FareDetailsMainComposable$1$1$1$1(this.c, null), 3);
                break;
            default:
                BuildersKt.d(this.b, null, null, new FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$1$1$1$1(this.c, null), 3);
                break;
        }
        return Unit.f17538a;
    }
}
