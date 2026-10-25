package app.chalo.home.ui.history;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class MyTicketsComponent$convertToUiState$2$productsTabUiState$1 extends FunctionReferenceImpl implements Function1<MyTicketsViewIntent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MyTicketsViewIntent p0 = (MyTicketsViewIntent) obj;
        Intrinsics.i(p0, "p0");
        ((MyTicketsComponent) this.receiver).q1(p0);
        return Unit.f17538a;
    }
}
