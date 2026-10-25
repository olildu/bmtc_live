package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.FaqItemUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19643a;
    public final /* synthetic */ BookingHelpScreenViewState b;

    public /* synthetic */ tb(BookingHelpScreenViewState bookingHelpScreenViewState, int i) {
        this.f19643a = i;
        this.b = bookingHelpScreenViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19643a) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                BookingHelpScreenViewState bookingHelpScreenViewState = this.b;
                LazyListScope.CC.o(LazyColumn, bookingHelpScreenViewState.d.size(), new tb(bookingHelpScreenViewState, 1), null, ComposableLambdaKt.composableLambdaInstance(-461535219, true, new o4(bookingHelpScreenViewState, 1)), 4, null);
                return Unit.f17538a;
            default:
                return ((FaqItemUiState) this.b.d.get(((Integer) obj).intValue())).f994a;
        }
    }
}
